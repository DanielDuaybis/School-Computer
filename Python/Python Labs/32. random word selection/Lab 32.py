#Lab 32
from graphics import *
from random import *

#w = GraphWin('I AM A WINDOW',600,600)
#w.setBackground('black')

file = open('ColorList.txt','r')
color = file.readline(randint(0,9))

print(color)

"""
if(color == 'red;'):
    word = Text(Point(300,300),'Red')
    word.setTextColor('red')
    word.setSize(36)
    word.setStyle('bold italic')
    word.draw(w)
if(color == 'blue;'):
    word = Text(Point(300,300),'Blue')
    word.setTextColor('blue')
    word.setSize(36)
    word.setStyle('bold italic')
    word.draw(w)
if(color == 'yellow;'):
    word = Text(Point(300,300),'Yellow')
    word.setTextColor('yellow')
    word.setSize(36)
    word.setStyle('bold italic')
    word.draw(w)
if(color == 'green;'):
    word = Text(Point(300,300),'Green')
    word.setTextColor('green')
    word.setSize(36)
    word.setStyle('bold italic')
    word.draw(w)
if(color == 'cyan;'):
    word = Text(Point(300,300),'Cyan')
    word.setTextColor('cyan')
    word.setSize(36)
    word.setStyle('bold italic')
    word.draw(w)
if(color == 'purple;'):
    word = Text(Point(300,300),'Purple')
    word.setTextColor('purple')
    word.setSize(36)
    word.setStyle('bold italic')
    word.draw(w)
if(color == 'orange;'):
    word = Text(Point(300,300),'Orange')
    word.setTextColor('orange')
    word.setSize(36)
    word.setStyle('bold italic')
    word.draw(w)
if(color == 'white;'):
    word = Text(Point(300,300),'White')
    word.setTextColor('white')
    word.setSize(36)
    word.setStyle('bold italic')
    word.draw(w)
if(color == 'tan;'):
    word = Text(Point(300,300),'Tan')
    word.setTextColor('tan')
    word.setSize(36)
    word.setStyle('bold italic')
    word.draw(w)

file.close()
w.getMouse()
w.close()

"""
