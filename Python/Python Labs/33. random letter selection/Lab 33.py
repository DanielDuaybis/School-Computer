#Lab 32
from graphics import *
from random import *

w = GraphWin('WINDOW',500,500)

file = open('ColorList.txt','r+')
colors = file.readlines()
letters = []
color = colors[randint(0,8)]
for i in color:
    letters.append(i)
t = Text(Point(250,250),letters[randint(0,len(color))])
t.draw(w)

w.getMouse()
w.close()