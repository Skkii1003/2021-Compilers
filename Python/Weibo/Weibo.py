#!/usr/bin/eny python
# -*- coding:utf-8 -*-
import re
from bs4 import BeautifulSoup
import requests
import urllib.request
import urllib.parse




def askURL(url):
    headers = {
        'cookie':"_T_WM=35b2894dd1108f47ebec965bdf24173f; SCF=AtAGjXPQTSD2Yom2Rx8XS4lt6Xw_cTzu4rocSt2FQRS9SNKCKcihEOPQO2oMmNgxBnJu5_OYZIl0gSo7buPHDV8.; SUB=_2A25ND-xaDeRhGeFL7lYU-C3NzTSIHXVu8_QSrDV6PUJbktAKLWOhkW1NfeD-wZvUlwCWjhSQPp-1xUx4jHoQexEn; SUBP=0033WrSXqPxfM725Ws9jqgMF55529P9D9W5Ys46nVSf3w-5FNx_Q.n.j5NHD95QNSK-XSKn0eKqRWs4DqcjSi--NiKnRi-8hMs87qBtt; SSOLoginState=1611373579" ,
        "user-agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36 Edg/87.0.664.75"
    }
    try:
        re = requests.post(url,headers = headers)
    except:
        print (re.status_code)
    return re.text

def getPage():
    html = askURL("https://weibo.cn/search/mblog?hideSearchFrame=&keyword=%E7%96%AB%E6%83%85&page=1")
    bs = BeautifulSoup(html,'lxml')
    # print (bs.find_all("a",class_="ctt"))
    for item in bs.find_all(re.compile("[\u4e00-\u9fa5]")):
        print(item)



getPage()

# askURL("https://weibo.cn/search/#top")