#Lab 28
from graphics import *
from Waldo import Waldo
from random import *
import time

w = GraphWin('w',1400,700)

#Making Sky
w.setBackground('cyan')

#Making Ground
ground = Rectangle(Point(0,500),Point(1400,700))
ground.setFill('green')
ground.setOutline('green')
ground.draw(w)

#Making Waldo
randx = randint(0,1400)
randy = randint(0,500)
waldo = Waldo(Point(randx,randy))

#Making Counter
counter = Text(Point(900,200),'Times Clicked: ')
counter.setSize(30)
counter.draw(w)

clicked = Text(Point(950,200),'0')
clicked.setSize(30)
clicked.draw(w)

w.getMouse()
w.close()
