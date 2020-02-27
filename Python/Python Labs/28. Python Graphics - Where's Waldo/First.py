#Lab 28
from graphics import *
from Waldo import Waldo
from random import *
import time

w = GraphWin('WINDOW',1400,700)

#Making Sky
w.setBackground('cyan')

#Making Ground
ground = Rectangle(Point(0,500),Point(1400,700))
ground.setFill('green')
ground.setOutline('green')
ground.draw(w)

#Making Sun
sun = Circle(Point(50,50),50)
sun.setFill('yellow')
sun.setOutline('yellow')
sun.draw(w)

#Making Waldo
randx = randint(0,1400)
randy = randint(0,500)
waldo = Waldo(Point(randx,randy))

#Making Counter
counter = Text(Point(900,200),'Times Clicked: ')
counter.setSize(30)
counter.draw(w)

clicked = Text(Point(1100,200),'0')
clicked.setSize(30)
clicked.draw(w)

#Finding Waldo
print("Waldo is at ",randx,",",randy)
clicks = 0
while True:
    if(waldo.contains(w.getMouse())):
        break;
    clicks = clicks + 1
    clicked.setText(clicks)
    
waldo.draw(w)
win = Text(Point(700,350),'YOU FOUND WALDO IN ',clicks,' CLICKS')
win.setSize(36)
win.setFill('red')
win.draw(w)

w.getMouse()
w.close()
