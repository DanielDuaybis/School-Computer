#Lab 27
from graphics import *
from Waldo import Waldo
from random import *
import time

w = GraphWin('w',1400,700)

#Making Waldo
waldo = Waldo(Point(0,350))
waldo.draw(w)
x = 1
while(x > 0):
    for i in range(0,1400):
        waldo.move(1,0)
    for i in range(0,1400):
        waldo.move(-1,0)

w.getMouse()
w.close()
