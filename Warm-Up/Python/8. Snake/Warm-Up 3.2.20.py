#Warm-Up 3/2/20
from graphics import *
from random import *

#Making Square and Window
w = GraphWin('WARM-UP',900,600)

square = Rectangle(Point(50,50),Point(100,100))
directions = Text(Point(500,500),'When the square stops changing color, click once.')
directions.setSize(15)
directions.draw(w)
square.draw(w)

#Square Sparkling
for i in range(0,randint(10,20)):
    r = randint(0,255)
    g = randint(0,255)
    b = randint(0,255)
    randcolor = color_rgb(r,g,b)
    square.setFill(randcolor)
    square.setOutline(randcolor)
    time.sleep(.05)

#Transition
w.getMouse()
square.undraw()
directions.undraw()
snake = []

#Making Snake
for x in range(50,300,50):
    nsquare = Rectangle(Point(x,50),Point(x + 50,100))
    r = randint(0,255)
    g = randint(0,255)
    b = randint(0,255)
    randcolor = color_rgb(r,g,b)
    nsquare.setFill(randcolor)
    nsquare.setOutline(randcolor)
    nsquare.draw(w)
    snake.append(nsquare)

#Moving Snake
w.getMouse()
while True:
    for n in snake:
        n.move(50,0)
        r = randint(0,255)
        g = randint(0,255)
        b = randint(0,255)
        randcolor = color_rgb(r,g,b)
        n.setFill(randcolor)
        n.setOutline(randcolor)

        #Recycling Snake
        if(n.getP1().getX() == 900):
            n.move(-900,50)

        #Adding to Snake
        if(snake[0].getP1().getX() == 50):
            asquare = Rectangle(Point(snake[0].getP1().getX() - 50,snake[0].getP1().getY()),Point(snake[0].getP2().getX(),snake[0].getP2().getY()))
            asquare.draw(w)
            snake.insert(0,asquare)
    time.sleep(.2)
    
