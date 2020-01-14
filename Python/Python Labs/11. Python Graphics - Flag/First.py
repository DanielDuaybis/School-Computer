#Lab 11
from graphics import *
window = GraphWin("Window",1000,1000)
pole = Rectangle(Point(0,0),Point(10,800))
pole.setFill('black')
pole.draw(window)

blue = Rectangle(Point(10,0),Point(110,100))
blue.setFill('blue')
blue.draw(window)

red1 = Rectangle(Point(110,0),Point(310,25))
red1.setFill('red')
red1.draw(window)

white1 = Rectangle(Point(110,25),Point(310,50))
white1.setFill('white')
white1.draw(window)

red2 = Rectangle(Point(110,50),Point(310,75))
red2.setFill('red')
red2.draw(window)

white2 = Rectangle(Point(110,75),Point(310,100))
white2.setFill('white')
white2.draw(window)

red2 = Rectangle(Point(10,100),Point(310,125))
red2.setFill('red')
red2.draw(window)

white2 = Rectangle(Point(110,75),Point(310,100))
white2.setFill('white')
white2.draw(window)
