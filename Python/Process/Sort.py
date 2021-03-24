#!/usr/bin/eny python
# -*- coding:utf-8 -*-

import xlrd
import xlwt


#将数据整理成列表
def process(file):
    e = xlrd.open_workbook_xls(file)
    sheet = e.sheet_by_index(0)
    # print(sheet.row(1)[0])
    name = []
    result = []
    for i in range(0,sheet.nrows):
        content = {}
        for j in range(0,sheet.ncols):
            if i==0:
                temp = str(sheet.row(i)[j])
                length = len(temp)
                name.append(temp[6:length-1])
            else:
                temp = str(sheet.row(i)[j])
                if j==1:
                    content[name[j]] = temp[6:17]
                else:
                    length = len(temp)
                    content[name[j]] = temp[6:length-1]
        if i!=0:
            temp = content
            result.append(temp)

    return result

def get_weght(e):
    return e['weight']


#根据权重对新闻排序，评论：转发：点赞 = 3:3:4

def sort_by_weight(data):
#计算权重
    i=0
    while i<len(data):
        try:
            temp = data[i]['评论数']
            length = len(temp)
            num_cmm = int(temp[3:length-1])

            temp = data[i]['转发数']
            length = len(temp)
            num_fwd = int(temp[3:length-1])

            temp = data[i]['点赞数']
            length = len(temp)
            num_like = int(temp[2:length - 1])

            weight = num_cmm*0.3 + num_fwd*0.3 + num_like*0.4
            data[i]['weight'] = weight
            i = i+1
        except Exception:
            data.remove(data[i])
            i = i-1
    #排序
    return sorted(data,key=get_weght,reverse = True)

def write_result(data,save_name):
    workbook = xlwt.Workbook()
    sheet = workbook.add_sheet('新闻',cell_overwrite_ok=True)
    sheet.write(0, 0, 'rank')
    sheet.write(0,1,'标题')
    sheet.write(0, 2, '时间')
    sheet.write(0,3,'权重')
    sheet.write(0,4,'url')
    length = len(data)
    for i in range(0,length):
        sheet.write(i + 1, 0, data[i]['rank'])
        sheet.write(i+1,1,data[i]['新闻'])
        sheet.write(i + 1, 2, data[i]['时间'])
        sheet.write(i+1, 3, data[i]['weight'])
        sheet.write(i+1, 4, data[i]['评论链接'])

    workbook.save(save_name)

def filter(data):
    key = ['疫','新冠','肺炎','病毒','援','核酸','封','阳性','隔离','确诊','阴性','感染','病例','境外','疫苗','动物','无接触','野味','英雄','医','药','治愈',
           '死亡','应急','复学','开学','复工','网课','烈士']
    i = 0
    length = len(data)

    while i<length:
        has = False
        # print(data[i])
        title = data[i]['新闻']
        for j in range(0,len(key)):
            if (title.find(key[j]))!=-1:
                has = True
                break
        if has==False:
            data.remove(data[i])
            i = i - 1
            length = len(data)
        i = i+1
    return data


def sort_by_time(data):
    p1 = []
    p2 = []
    p3 = []
    p4 = []
    length = len(data)
    for i in range(0,length):
        time = data[i]['时间']
        time = time.replace('-','')
        time = int(time)
        if time >= 20191208 and time <= 20200122:
            p1.append(data[i])
        elif time >= 20200123 and time <= 20200207:
            p2.append(data[i])
        elif time >= 20200208 and time <= 20200309:
            p3.append(data[i])
        elif time >= 20200310 and time <= 20200620:
            p4.append(data[i])
        else:
            print("not in time limits")

    write_result(p1,'../Data_filtered/pd1.xls')
    write_result(p2, '../Data_filtered/pd2.xls')
    write_result(p3, '../Data_filtered/pd3.xls')
    write_result(p4, '../Data_filtered/pd4.xls')

def filter_by_weight(data):
    length = len(data)
    i=0
    while i < length:
        w = data[i]['weight']
        if w < 2000:
            data.remove(data[i])
            i = i - 1
            length = len(data)
        i = i + 1
    return data


def add_rank(data):
    length = len(data)
    for i in range(0,length):
        temp = data[i]
        temp['rank'] = i+1

    return data

def sort_by_event(data):
    event = ['野味','动物','蝙蝠']
    result = []
    length = len(data)
    for i in range (0,length):
        news = data[i]['新闻']
        for j in range(0,len(event)):
            if  news.find(event[j]) != -1:
                result.append(data[i]['rank'])
                break;
    return result

def getrank():
    file = '../Data_raw/total.xls'
    data = process(file)
    data = sort_by_weight(data)
    data = filter(data)
    data = add_rank(data)
    data = filter_by_weight(data)
    rank = sort_by_event(data)
    return rank

if __name__ == '__main__':
    file = '../Data_raw/total.xls'
    data = process(file)
    data = sort_by_weight(data)
    data = filter(data)
    data = add_rank(data)
    data = filter_by_weight(data)
    re = sort_by_event(data)
    print(re)
    # write_result(re,'../Data_filtered/event1.xls')
    # write_result(data,'../Data_filtered/total2000.xls')
    print("Completed!")
