#Lab 14
from graphics import *
window = GraphWin('window',1000,1000)

#Shirt
shirt = Rectangle(Point(400,200),Point(600,500))
shirt.setFill('cyan')
shirt.draw(window)

#Pants
pants = Polygon(Point(400,500),Point(375,900),Point(425,925),Point(500,550),Point(575,925),Point(625,900),Point(600,500))
pants.setFill('black')
pants.draw(window)

#Left arm
leftarm = Polygon(Point(400,200),Point(450,200),Point(425,500),Point(375,500))
leftarm.setFill('cyan')
leftarm.draw(window)

#Left hand
lefthand = Circle(Point(400,480),30)
lefthand.setFill('tan')
lefthand.setOutline('tan')
lefthand.draw(window)

#Right arm
rightarm1 = Polygon(Point(600,200),Point(700,200),Point(650,100),Point(700,100),Point(775,250),Point(600,250))
rightarm1.setFill('cyan')
rightarm1.draw(window)

#Right hand
righthand1 = Circle(Point(675,100),30)
righthand1.setFill('tan')
righthand1.setOutline('tan')
righthand1.draw(window)

#Right arm other position
rightarm2 = Polygon(Point(600,200),Point(725,200),Point(775,100),Point(825,100),Point(775,250),Point(600,250))
rightarm2.setFill('cyan')

#Right hand other position
righthand2 = Circle(Point(800,100),30)
righthand2.setFill('tan')
righthand2.setOutline('tan')

#Waving animation
time.sleep(.5)
for x in range(0,99999999999):
    if(x % 2 == 0):
        rightarm1.undraw()
        righthand1.undraw()

        #rightarm2.draw(window)
        #rightarm2.draw(window)

        time.sleep(.5)
    if(x % 2 == 1):
        #rightarm2.undraw()
        #righthand2.undraw()

        rightarm1.draw(window)
        rightarm1.draw(window)

        time.sleep(.5)
        
window.getMouse()
window.close()
