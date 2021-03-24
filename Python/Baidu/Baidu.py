#!/usr/bin/eny python
# -*- coding:utf-8 -*-
import urllib.request
import urllib.parse
from bs4 import BeautifulSoup
import re


def askURL(url):
    html = ""
    head = {"User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36 Edg/87.0.664.75"}
    request = urllib.request.Request(url,headers=head);
    # print (reponse.read().decode("utf-8"))
    try:
        reponse = urllib.request.urlopen(request)
        html = reponse.read()
    except urllib.error.URLError as e:
        print("error")

    return html



def getData():
    url = "https://www.baidu.com/s?ie=utf-8&medium=1&rtt=4&bsst=1&rsv_dl=news_b_pn&cl=2&wd=%E7%96%AB%E6%83%85&tn=news&rsv_bp=1&tfflag=0&x_bfe_rqs=03E80000001&x_bfe_tjscore=0.000000&tngroupname=organic_news&newVideo=12&pn=520"
    html = askURL(url)
    bs = BeautifulSoup(html,"lxml")
    # print(bs.title.string)

    for item in bs.find_all("div",class_='result-op c-container xpath-log new-pmd'):
        print(item.find_all("h3"))

getData()






