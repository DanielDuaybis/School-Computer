#Waldo Quiz 3/6/20

from graphics import *
from random import *
from Waldo import *

#Basics
w = GraphWin("WALDO MAKER 2000",600,600)
waldos = []

#Making two buttons
blue = Waldo(Point(230,300))
blue.setFill('blue')
blue.draw(w)
waldos.append(blue)

yellow = Waldo(Point(350,300))
yellow.setFill('yellow')
yellow.draw(w)
waldos.append(yellow)

#################################################

while True:
    location = w.getMouse()
#Blue button
    if(waldos[0].contains(location)):
        for i in range(0,randint(5,20)):
            red = Waldo(Point(randint(5,580),randint(5,580)))
            red.draw(w)
            waldos.append(red)
#Yellow button
    if(waldos[1].contains(location)):
        break;

#################################################

#Stampede Text
stampede = Text(Point(300,300),"IT'S A STAMPEDE")
stampede.setFill('cyan')
stampede.setSize(36)
stampede.setStyle('bold italic')
stampede.draw(w)

#Stopping, Starting, and Adding while in motion
while True:
    location = w.checkMouse()
#Adding in motion
    if(location != None):
        if(waldos[0].contains(location)):
            for i in range(0,randint(2,7)):
                red = Waldo(Point(randint(5,580),randint(5,580)))
                red.draw(w)
                waldos.append(red)
#Stopping and starting
        if(waldos[1].contains(location)):
            while True:
                location = w.getMouse()
#Adding while temporarily stopped
                if(waldos[0].contains(location)):
                    for i in range(0,randint(2,7)):
                        red = Waldo(Point(randint(5,580),randint(5,580)))
                        red.draw(w)
                        waldos.append(red)
                if(waldos[1].contains(location)):
                    break;
#Moving
    for n in waldos:
        n.move(0,10)
#Recycling
        if(n.getY() >= 600):
            if(n.getX() >= 590):
                xmove = randint(-500,0)
            elif(n.getX() <= 10):
                xmove = randint(0,500)
            else:
                xmove = randint(-300,300)
            n.move(xmove,-600)
