#Lab 10
from graphics import *
window = GraphWin("Window",1000,1000)
rectangle = Rectangle(Point(10,10),Point(300,300))
rectangle.draw(window)
rectangle.setFill('cyan')
window.getMouse()
window.close()
