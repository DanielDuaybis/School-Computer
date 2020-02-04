#Warm-Up 2/3/30

from graphics import *
w = GraphWin('WINDOW',1000,700)

#Draw Black Left Lines:
w.getMouse()

for i in range(0,3000,30):
    left = Line(Point(0,0),Point(1000,i))
    left.draw(w)
    time.sleep(.000001)

#Draw Black Right Lines:
w.getMouse()

for i2 in range(0,3000,30):
    right = Line(Point(1000,0),Point(0,i2))
    right.draw(w)
    time.sleep(.000001)
    

#Color Left Lines:
w.getMouse()
counter = 0

for i in range(0,3000,30):
    left2 = Line(Point(0,0),Point(1000,i))
    left2.draw(w)
    time.sleep(.000001)
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

#Color Right Lines:
w.getMouse()
counter = 0

for i in range(0,3000,30):
    right2 = Line(Point(1000,0),Point(0,i))
    right2.draw(w)
    time.sleep(.000001)
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

#Bottom Left Lines:
w.getMouse()

for i in range(1000,-1000,-30):
    bleft = Line(Point(0,700),Point(1000,i))
    bleft.draw(w)
    time.sleep(.000001)

#Bottom Right Lines:
w.getMouse()

for i in range(1000,-1000,-30):
    bright = Line(Point(1000,700),Point(0,i))
    bright.draw(w)
    time.sleep(.000001)

#Color Bottom Left Lines:
w.getMouse()
counter = 0

for i in range(1000,-1000,-30):
    bleft2 = Line(Point(0,700),Point(1000,i))
    bleft2.draw(w)
    time.sleep(.000001)
    if(counter % 6 == 0):
        bleft2.setOutline('red')
    if(counter % 6 == 1):
        bleft2.setOutline('orange')
    if(counter % 6 == 2):
        bleft2.setOutline('yellow')
    if(counter % 6 == 3):
        bleft2.setOutline('green')
    if(counter % 6 == 4):
        bleft2.setOutline('blue')
    if(counter % 6 == 5):
        bleft2.setOutline('purple')
    counter = counter + 1

#Bottom Right Lines:
w.getMouse()
counter = 0

for i in range(1000,-1000,-30):
    bright2 = Line(Point(1000,700),Point(0,i))
    bright2.draw(w)
    time.sleep(.000001)
    if(counter % 6 == 0):
        bright2.setOutline('red')
    if(counter % 6 == 1):
        bright2.setOutline('orange')
    if(counter % 6 == 2):
        bright2.setOutline('yellow')
    if(counter % 6 == 3):
        bright2.setOutline('green')
    if(counter % 6 == 4):
        bright2.setOutline('blue')
    if(counter % 6 == 5):
        bright2.setOutline('purple')
    counter = counter + 1

#Close:
w.getMouse()
w.close
