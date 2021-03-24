#!/usr/bin/eny python
# -*- coding:utf-8 -*-
import xlrd
import re

f = 'weibo.xls'
e = xlrd.open_workbook_xls(f)
print(e.sheet_names())
sheet1 = e.sheet_by_index(0)
print(sheet1.ncols)
row1 = sheet1.row(8)
print(row1[0])
temp= str(row1[1])
print(str(temp))
num = int(temp[9:12])
print(num)