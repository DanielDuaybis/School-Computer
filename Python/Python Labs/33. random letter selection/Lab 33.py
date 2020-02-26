#Lab 32
from graphics import *
from random import *

w = GraphWin('WINDOW',500,500)

file = open('ColorList.txt','r+')
colors = file.readlines()
letters = []
for i in colors:
    letters.append(i)
t = Text(Point(250,250),letters[randint(0,41)])
t.draw(w)

w.getMouse()
w.close()
