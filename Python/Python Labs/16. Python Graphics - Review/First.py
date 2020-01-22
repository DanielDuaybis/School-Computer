#Lab 12
from graphics import *

#Message
tex = input("What message would you like to send? ")
window = GraphWin('window',1000,1000)
message = Text(Point(500,475),tex)
message.setSize(36)
message.setStyle("bold italic")
message.setTextColor('black')
message.draw(window)

#Landscape
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

#Flag

blue = Rectangle(Point(20,200),Point(40,220))
blue.setFill('blue')
blue.draw(window)

red1 = Rectangle(Point(40,200),Point(70,203))
red1.setFill('red')
red1.draw(window)

white1 = Rectangle(Point(40,203),Point(70,206))
white1.setFill('white')
white1.draw(window)

red2 = Rectangle(Point(40,206),Point(70,209))
red2.setFill('red')
red2.draw(window)

white1 = Rectangle(Point(40,209),Point(70,212))
white1.setFill('white')
white1.draw(window)

red3 = Rectangle(Point(40,212),Point(70,215))
red3.setFill('red')
red3.draw(window)

white1 = Rectangle(Point(40,215),Point(70,218))
white1.setFill('white')
white1.draw(window)

red4 = Rectangle(Point(40,218),Point(70,220))
red4.setFill('red')
red4.draw(window)

white1 = Rectangle(Point(20,220),Point(70,223))
white1.setFill('white')
white1.draw(window)

red5 = Rectangle(Point(20,223),Point(70,226))
red5.setFill('red')
red5.draw(window)

white1 = Rectangle(Point(20,226),Point(70,229))
white1.setFill('white')
white1.draw(window)

red6 = Rectangle(Point(20,229),Point(70,232))
red6.setFill('red')
red6.draw(window)

white1 = Rectangle(Point(20,232),Point(70,235))
white1.setFill('white')
white1.draw(window)

red7 = Rectangle(Point(20,235),Point(70,238))
red7.setFill('red')
red7.draw(window)

#Person

pants = Polygon(Point(40,600),Point(50,600),Point(55,545),Point(60,600),Point(70,600),Point(65,550),Point(45,550))
pants.setFill('black')
pants.draw(window)

shirt = Rectangle(Point(35,500),Point(65,550))
shirt.setFill('red')
shirt.draw(window)

rightarm = Rectangle(Point(55,500),Point(85,510))
rightarm.setFill('red')
rightarm.draw(window)

leftarm = Rectangle(Point(25,500),Point(55,510))
leftarm.setFill('red')
leftarm.draw(window)

head = Circle(Point(55,480),20)
head.setFill('tan')
head.draw(window)

mouth = Circle(Point(55,485),10)
mouth.setFill('red')
mouth.setOutline('red')
mouth.draw(window)

mouthcover = Rectangle(Point(45,475),Point(65.480))
mouthcover.setFill('tan')
mouthcover.setOutline('tan')
mouthcover.draw(window)


