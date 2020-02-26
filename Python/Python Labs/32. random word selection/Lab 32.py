#Lab 32
from graphics import *
from random import *

w = GraphWin('WINDOW',500,500)

file = open('ColorList.txt','r+')
colors = file.readlines()
color = colors[randint(0,8)]
t = Text(Point(250,250),color)
if(color == 'red'):
    t.setFill('red')
if(color == 'orange'):
    t.setFill('orange')
if(color == 'yellow'):
    t.setFill('yellow')
if(color == 'green'):
    t.setFill('green')
if(color == 'blue'):
    t.setFill('blue')
if(color == 'purple'):
    t.setFill('purple')
if(color == 'tan'):
    t.setFill('tan')
if(color == 'cyan'):
    t.setFill('cyan')
if(color == 'white'):
    t.setFill('white')
t.setSize(36)
t.draw(w)

w.getMouse()
w.close()
