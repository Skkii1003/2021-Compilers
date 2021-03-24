#!/usr/bin/eny python
# -*- coding:utf-8 -*-
import random

import xlrd
import xlwt

from Process import Sort

dic_positive = ['加油','善待','挺住','愿一切','靠谱','骄傲','始终相信','相信','恭喜',
                '熬过去','见真情','过难关','一切都','牛逼','真的牛','太好了','好消息',
                '棒','雷厉风行','厉害','体谅','奥利给','好人','康复']
dic_thankful = ['平平安安','辛苦','致敬','平安','谢谢','希望与爱','注意身体','感谢',
                '幸运','敬佩','赞','注意安全','欢迎回家','一路走好','看哭','伟大','感恩',
                '感激','祝福','尊敬','榜样']
dic_sad = ['难受','抱歉','眼泪','太难了','哀悼','心酸','安息','心疼']
dic_angry = ['不行吗','biss','屁事','善后','作死','没有心','气死','吃野味','tm','草',
             '漏掉','隐瞒','什么意义','居然','垃圾','能不能','饭桶','憨批','这么差','在干嘛',
             '还聚集','严查','不到位','你妹','可悲可笑','重罚','他妈','不配合','服气了','枪毙',
             '作妖','怎么想的','雷劈','造谣','不要命','沙雕','黑心','贱','怀疑','迷惑','不了了之']
dic_worry = ['纳闷','担心','建议','着急','请求','求求','失控','要求','保佑','拜托',
             '关注一下吧','奉劝','严格控制','放松警惕','掉以轻心','麻烦','一定要改','请自觉',
             '重视','急一急','魔幻','希望','想看到','请加大','急一急','急死人','瑟瑟发抖',
             '关注','很慌','请大家']
dic_affraid = ['不敢','害怕','生怕','吓得','不敢想象','吓人','救命','恐怖']

def has_dic(cmm):
    dic = {1:dic_positive,2:dic_thankful,3:dic_sad,4:dic_angry,5:dic_worry,6:dic_affraid}
    choice = [1,2,3,4,5,6]
    for i in range(0,6):
        r = random.choice(choice)
        d = dic[r]
        length = len(d)
        for j in range(0,length):
            if cmm.find(d[j]) != -1:
                return r
        choice.remove(r)

    return 0


def process(file):
    e = xlrd.open_workbook_xls(file)
    sheet = e.sheet_by_index(0)
    # print(sheet.row(1)[0])
    data = []
    for i in range(1,sheet.nrows):
        content = {}
        temp = str(sheet.row(i)[0])
        length = len(temp) - 3
        rank = int(temp[6:length])
        content['rank'] = rank
        # print(rank)
        temp = str(sheet.row(i)[3])
        length = len(temp) - 4
        like = int(temp[8:length])
        content['like'] = like
        # print(like)
        temp = str(sheet.row(i)[4])
        length = len(temp) - 1
        cmm = temp[6:length]
        content['cmm'] = cmm
        # print(temp)
        temp = content
        data.append(temp)
        # print(data)
    # print(data)
    return data


def mindset_func(data):
    positive = 0
    thankful = 0
    sad = 0
    angry = 0
    worry = 0
    affraid = 0
    dic = {1:positive,2:thankful,3:sad,4:angry,5:worry,6:affraid}

    length = len(data)
    for i in range(0,length):
        like = data[i]['like']
        cmm = data[i]['cmm']
        re = has_dic(cmm)
        if re == 0:
            continue
        else:
            dic[re] = dic[re] + like

    total = dic[1] + dic[2] + dic[3] + dic[4] + dic[5] + dic[6]
    result = []
    result.append([total])
    for i in range(1,7):
        if total == 0:
            tf = 0
        else:
            tf = round(dic[i] / total,4)
        temp = [dic[i],tf]
        result.append(temp)

    return result

def IDF(re1,re2,re3,re4):
    total = [re1[0][0],re2[0][0],re3[0][0],re4[0][0],re1[0][0] + re2[0][0] + re3[0][0] + re4[0][0]]
    result = []
    result.append(total)
    idf1 = []
    idf2 = []
    idf3 = []
    idf4 = []
    for i in range(1,7):
        df = (re1[i][0] + re2[i][0] + re3[i][0]+ re4[i][0]) / total[4]
        idf1.append(round(re1[i][1] / df,4))
        idf2.append(round(re2[i][1] / df,4))
        idf3.append(round(re3[i][1] / df,4))
        idf4.append(round(re4[i][1] / df,4))

    result.append(idf1)
    result.append(idf2)
    result.append(idf3)
    result.append(idf4)

    return result

def get_rank(e):
    return e['rank']

def getcmm_by_rank(data,rank = []):
    data = sorted(data, key=get_rank, reverse=False)
    # print(data)
    print(rank)
    length = len(data)
    re = []
    for i in range(0,length):
        r = data[i]['rank']
        for j in rank:
            if r == j:
                re.append(data[i])
                break
            if j > r :
                break;
    return re


if __name__ == '__main__':
    data = process('../Cmm/cmm.xls')
    rank = Sort.getrank()
    result = getcmm_by_rank(data,rank)
    # print(re)
    re = mindset_func(result)
    print(re)


    # data2 = process('../Cmm/cmmpd2.xls')
    # data3 = process('../Cmm/cmmpd3.xls')
    # data4 = process('../Cmm/cmmpd4.xls')
    # print(data1)
    # re1 = mindset_func(data1)
    # re2 = mindset_func(data2)
    # re3 = mindset_func(data3)
    # re4 = mindset_func(data4)
    # print(re1)
    # print(re2)
    # print(re3)
    # print(re4)
    # data = IDF(re1,re2,re3,re4)
    # print(data)
