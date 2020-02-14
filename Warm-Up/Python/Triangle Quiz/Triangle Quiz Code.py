#Triangle Quiz 2/14/20

from graphics import *
from random import *

#Making window
w = GraphWin('THIS IS A GREAT QUIZ',600,600)
w.setBackground('white')

#Creating lists to erase
erase = ['testvalue']
erase.pop(0)
shape = 0
counter = 0
erase2 = ['testvalue']
erase2.pop(0)

#Master while loop
while True:
    
    #Check to see which shape to draw
    if(shape % 2 == 0):
        
    #Drawing Triangles
        for i in range(0,randint(25,50)):
            triangle = Polygon(Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)))
            color = color_rgb(randint(0,255),randint(0,255),randint(0,255))
            triangle.setFill(color)
            triangle.setOutline(color)
            triangle.draw(w)
            time.sleep(.2)
            erase.append(triangle)

    #Reversing list
        erase.reverse()

    #Undrawing triangles
        for x in erase:
            x.undraw()
            time.sleep(.1)

    #Resetting erase list
        for x in erase:
            erase.pop(counter)
            counter = counter + 1
    
        counter = 0
        time.sleep(.5)

    #Check to see what shape to draw
    elif(shape % 2 == 1):
        
        #Drawing Rectangles
        for i in range(0,randint(25,50)):
            rectangle = Rectangle(Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)))
            color = color_rgb(randint(0,255),randint(0,255),randint(0,255))
            rectangle.setFill(color)
            rectangle.setOutline(color)
            rectangle.draw(w)
            time.sleep(.2)
            erase2.append(rectangle)

    #Reversing list
        erase2.reverse()

    #Undrawing rectangles
        for x in erase2:
            x.undraw()
            time.sleep(.1)

    #Resetting erase list
        for x in erase2:
            erase2.pop(counter)
            counter = counter + 1
    
        counter = 0
        time.sleep(.5)

    #Swapping shape    
    shape = shape + 1
