#Lab 12
from graphics import *
window = GraphWin('window',1000,1000)
window.setBackground('cyan')
ground = Rectangle(Point(0,600),Point(1000,1000))
ground.setFill('green')
ground.draw(window)
p1x = 100
p2x = 90
p3x = 125
p4x = 160
p5x = 150
for x in range(0,9):
    fence = Polygon(Point(int(p1x),600),Point(int(p2x),525),Point(int(p3x),500),Point(int(p4x),525),Point(int(p5x),600))
    fence.draw(window)
    fence.setFill('white')
    p1x = int(p1x) + 100
    p2x = int(p2x) + 100
    p3x = int(p3x) + 100
    p4x = int(p4x) + 100
    p5x = int(p5x) + 100
test = Circle(Point(50,50),50)
test.setFill('yellow')
test.draw(window)
