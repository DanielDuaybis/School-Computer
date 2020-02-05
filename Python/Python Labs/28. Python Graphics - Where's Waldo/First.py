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
close = Text(Point(500,200),' ')
close.setSize(36)
close.draw(w)
for i in range(0,20):
    clicked.setText(i)
    
    if(waldo.contains(Point(location))):
        #Winning Sequence
        win = Text(Point(700,250),'CONGRATS!')
        win.setSize(36)
        win.draw(w)
        win2 = Text(Point(700,300),'YOU CAUGHT WALDO IN ' + str(clicked.getText()) + ' CLICKS')
        win2.setSize(36)
        win2.draw(w)
        break
    
    elif():
        
    else:
        
    
    location = w.getMouse()

if(i == 20):
    lose = Text(Point(700,250),'YOU LOSE')

w.getMouse()
w.close()
