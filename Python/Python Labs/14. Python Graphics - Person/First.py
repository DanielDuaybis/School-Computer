#Lab 14
from graphics import *
window = GraphWin('window',1000,1000)

shirt = Rectangle(Point(400,200),Point(600,500))
shirt.setFill('cyan')
shirt.setOutline('cyan')
shirt.draw(window)

pants = Polygon(Point(400,500),Point(375,900),Point(425,925),Point(500,550),Point(575,925),Point(625,900),Point(600,500))
pants.setFill('black')
pants.draw(window)

leftarm = Polygon(

window.getMouse()
window.close()
