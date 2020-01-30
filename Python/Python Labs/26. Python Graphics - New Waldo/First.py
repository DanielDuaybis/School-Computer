#Lab 26
from graphics import *
from Waldo import Waldo
from random import *

w = GraphWin('w',500,500)

#Making Waldos
for i in range(0,1000):
    randx = randint(0,500)
    randy = randint(0,500)
    waldo = Waldo(Point(randx,randy))
    waldo.draw(w)

w.getMouse()
w.close()
