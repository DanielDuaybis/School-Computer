#Warm-Up 2/24/20
from graphics import *
from random import *

#General Creations
w = GraphWin('Warm-Up',500,500)
w.setBackground('white')
squares = []
win = Text(Point(250,250),'YOU DID IT')
win.setFill('cyan')
win.setSize(36)
win.setStyle('bold italic')

#Creating Squares
for x in range(1,700):
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
    time.sleep(.004)

#Making Blue Square
squares[589].setFill('cyan')

#Moving Squares
while True:
    
    #Setting Coordinate Variables
    m = w.getMouse()
    mx = m.getX()
    my = m.getY()
    p1 = squares[589].getP1()
    p1x = p1.getX()
    p1y = p1.getY()
    p2 = squares[589].getP2()
    p2x = p2.getX()
    p2y = p2.getY()
    
    #Button and Moving Squares
    if(mx >= p1x and mx <= p2x and my >= p1y and my <= p2y):
        for i in squares:
            i.move(randint(-10,10),randint(-10,10))
            rgb = randint(0,255)
            randgray = color_rgb(rgb,rgb,rgb)
            i.setFill(randgray)
        win.draw(w)
        while True:
            for i in squares:
                i.move(randint(-10,10),randint(-10,10))
                rgb = randint(0,255)
                randgray = color_rgb(rgb,rgb,rgb)
                i.setFill(randgray)
                
    #Moving Blue square
    else:
        squares[589].move(randint(-30,30),randint(-30,30))
