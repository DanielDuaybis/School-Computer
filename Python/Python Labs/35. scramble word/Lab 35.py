#Lab 32
from graphics import *
from random import *

file = open('ColorList.txt','r')
colors = file.readlines()
letters = []
color = colors[randint(0,8)]

for i in color:
    letters.append(i)

for x in range(0,len(letters)):
    length = len(letters)
    number = randint(0,length)
    print(letters[number],end='')
    letters.pop(number)
    length = length - 1
