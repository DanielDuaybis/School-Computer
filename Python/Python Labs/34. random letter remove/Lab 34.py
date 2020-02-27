#Lab 32
from graphics import *
from random import *

file = open('ColorList.txt','r+')
colors = file.readlines()
letters = []
color = colors[randint(0,8)]
for i in color:
    letters.append(i)
number = randint(0,len(color))
letter = letters[number]
for x in color:
    if(x == letter):
        continue
    print(x,end='')
