#!/usr/bin/env bash
set -e

# Change USERNAME, PASSWORD
USERNAME="191250111"
PASSWORD="191250111"

echo "--------Begin to Submit--------"

if [[ $USERNAME == "19xxxxxxx" || $PASSWORD == "xxxxxxxxx" ]]; then
  echo "Fail. You need to change USERNAME and PASSWORD"
  exit -1
fi

COURSE=PTC2021
MODULE=$(git rev-parse --abbrev-ref HEAD | tr '[a-z]' '[A-Z]')
WORKSPACE=$(basename $(realpath .))
FILE=submit.zip

if [[ $(git status --porcelain) ]]; then
  echo "Error: Git repository is dirty."
  echo "Commit all your changes before submitting."
  echo "Hint: run 'git status' to show changed files."
  exit -1
fi

# Construct assignmentId
ANTLRTMP="antlr-N"
FLEXTMP="flex-N"

BRANCH=$(git symbolic-ref --short -q HEAD)
LEN=${#BRANCH}
NUMBER=$(echo $BRANCH | tr -cd "[0-9]")
ID=""

if [ $LEN -eq 6 ]; then
  ID=$(echo $FLEXTMP | sed "s/N/${NUMBER}/g")
else
  ID=$(echo $ANTLRTMP | sed "s/N/${NUMBER}/g")
fi

echo "In branch: $BRANCH "
echo "Submit to assignment: $ID"


# Compress the whole folder instead of git storage only.
cd .. && \
zip -r "$FILE" $(ls -d "$WORKSPACE/.git" "$WORKSPACE/$STUID.pdf" 2>/dev/null) > /dev/null

# construct json for cul
TMPRAW='{"username":"XXXUSERXXX","password":"YYYPWDYYY"}'
DATARAW=$(echo $TMPRAW | sed "s/XXXUSERXXX/$USERNAME/g" | sed "s/YYYPWDYYY/$PASSWORD/g")
URL=https://oj.problemoverflow.cn:28300

# extract token
RAW=$(curl "$URL/auth/login" \
  -H 'Content-Type: application/json' \
  --data-raw $DATARAW )
TOKEN=$(echo $RAW | sed 's/,/\n/g' | grep "token" | sed 's/:/\n/g' | sed '1d' | sed 's/}//g' | sed 's/\"//g')

RES=$(curl "$URL/submissions" \
  -H "Authorization: Bearer $TOKEN" \
  -F "assignmentId=$ID" \
  -F "file=@$FILE" )

FLAG0=$?

TIME=$(echo $RES | sed 's/,/\n/g' | grep "createdAt" | sed 's/:/\n/g' | sed '1d' | sed 's/}//g' | sed 's/\"//g')

if [[ $FLAG0 -ne 0 || -z $TIME ]]; then
  echo ""
  echo "T_T Commit Fail! T_T"
else
  echo ""
  echo "^v^ Commit Success! ^v^ "
fi

