#Warm-Up 2/24/20
from graphics import *
from random import *

w = GraphWin('Warm-Up',500,500)
w.setBackground('white')
squares = []

#Creating Squares
for x in range(1,600):
    p1x = randint(0,500)
    p1y = randint(0,500)
    p2x = p1x + 20
    p2y = p1y + 20
    rgb = randint(0,255)
    randgray = color_rgb(rgb,rgb,rgb)
    square = Rectangle(Point(p1x,p1y),Point(p2x,p2y))
    square.setFill(randgray)
    square.draw(w)
    squares.append(square)
    time.sleep(.008)

#Making Blue Square
squares[589].setFill('cyan')

#Moving Squares
m = w.getMouse()
p1 = squares[589].getP1()
p2 = squares[589].getP2()
if(m.getX() < p1.getX() and m.getX() > p2.getX() and m.getX() > p1.getY() and m.getX() < p2.getY()):
    while True:
        for i in squares:
            i.move(randint(-5,5),randint(-5,5))
            rgb = randint(0,255)
            randgray = color_rgb(rgb,rgb,rgb)
        i.setFill(randgray)
