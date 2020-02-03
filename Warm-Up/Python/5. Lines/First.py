#Warm-Up 2/3/20
from graphics import *

w = GraphWin('WINDOW',1000,700)

#Draw Black Lines
w.getMouse()
for i in range(0,2000,20):
    left = Line(Point(0,0),Point(1000,i))
    left.draw(w)
    time.sleep(.001)

#New Set of Lines
w.getMouse()
for i2 in range(0,2000,20):
    right = Line(Point(1000,0),Point(0,i2))
    right.draw(w)
    time.sleep(.001)
    

#Color Left Lines
w.getMouse()
counter = 0
for i in range(0,2000,20):
    left2 = Line(Point(0,0),Point(1000,i))
    left2.draw(w)
    time.sleep(.001)
    if(counter % 6 == 0):
        left2.setOutline('red')
    if(counter % 6 == 1):
        left2.setOutline('orange')
    if(counter % 6 == 2):
        left2.setOutline('yellow')
    if(counter % 6 == 3):
        left2.setOutline('green')
    if(counter % 6 == 4):
        left2.setOutline('blue')
    if(counter % 6 == 5):
        left2.setOutline('purple')
    counter = counter + 1

#Color Right Lines
w.getMouse()
counter = 0
for i in range(0,2000,20):
    right2 = Line(Point(1000,0),Point(0,i))
    right2.draw(w)
    time.sleep(.001)
    if(counter % 6 == 0):
        right2.setOutline('red')
    if(counter % 6 == 1):
        right2.setOutline('orange')
    if(counter % 6 == 2):
        right2.setOutline('yellow')
    if(counter % 6 == 3):
        right2.setOutline('green')
    if(counter % 6 == 4):
        right2.setOutline('blue')
    if(counter % 6 == 5):
        right2.setOutline('purple')
    counter = counter + 1


w.getMouse()
w.close
