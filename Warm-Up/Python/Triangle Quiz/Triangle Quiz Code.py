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

#Master while loop
while True:
    
    #Check to see which shape to draw
    if(shape % 8 == 0):
        
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
    elif(shape % 8 == 1):
        
        #Drawing Rectangles
        for i in range(0,randint(25,50)):
            rectangle = Rectangle(Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)))
            color = color_rgb(randint(0,255),randint(0,255),randint(0,255))
            rectangle.setFill(color)
            rectangle.setOutline(color)
            rectangle.draw(w)
            time.sleep(.2)
            erase.append(rectangle)

    #Reversing list
        erase.reverse()

    #Undrawing rectangles
        for x in erase:
            x.undraw()
            time.sleep(.1)

    #Resetting erase list
        for x in erase:
            erase.pop(counter)
            counter = counter + 1
    
        counter = 0
        time.sleep(.5)
        
    #Check to see which shape to draw
    if(shape % 8 == 2):
        
    #Drawing Pentagons
        for i in range(0,randint(25,50)):
            pentagon = Polygon(Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)))
            color = color_rgb(randint(0,255),randint(0,255),randint(0,255))
            pentagon.setFill(color)
            pentagon.setOutline(color)
            pentagon.draw(w)
            time.sleep(.2)
            erase.append(pentagon)

    #Reversing list
        erase.reverse()

    #Undrawing pentagons
        for x in erase:
            x.undraw()
            time.sleep(.1)

    #Resetting erase list
        for x in erase:
            erase.pop(counter)
            counter = counter + 1
    
        counter = 0
        time.sleep(.5)    
        
    #Check to see which shape to draw
    if(shape % 8 == 3):
        
    #Drawing Hexagons
        for i in range(0,randint(25,50)):
            hexagon = Polygon(Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)))
            color = color_rgb(randint(0,255),randint(0,255),randint(0,255))
            hexagon.setFill(color)
            hexagon.setOutline(color)
            hexagon.draw(w)
            time.sleep(.2)
            erase.append(hexagon)

    #Reversing list
        erase.reverse()

    #Undrawing hexagons
        for x in erase:
            x.undraw()
            time.sleep(.1)

    #Resetting erase list
        for x in erase:
            erase.pop(counter)
            counter = counter + 1
    
        counter = 0
        time.sleep(.5)

    #Check to see which shape to draw
    if(shape % 8 == 4):
        
    #Drawing Heptagons
        for i in range(0,randint(25,50)):
            heptagon = Polygon(Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)))
            color = color_rgb(randint(0,255),randint(0,255),randint(0,255))
            heptagon.setFill(color)
            heptagon.setOutline(color)
            heptagon.draw(w)
            time.sleep(.2)
            erase.append(heptagon)

    #Reversing list
        erase.reverse()

    #Undrawing heptagons
        for x in erase:
            x.undraw()
            time.sleep(.1)

    #Resetting erase list
        for x in erase:
            erase.pop(counter)
            counter = counter + 1
    
        counter = 0
        time.sleep(.5)
        
    #Check to see which shape to draw
    if(shape % 8 == 5):
        
    #Drawing Octagons
        for i in range(0,randint(25,50)):
            octagon = Polygon(Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)))
            color = color_rgb(randint(0,255),randint(0,255),randint(0,255))
            octagon.setFill(color)
            octagon.setOutline(color)
            octagon.draw(w)
            time.sleep(.2)
            erase.append(octagon)

    #Reversing list
        erase.reverse()

    #Undrawing octagons
        for x in erase:
            x.undraw()
            time.sleep(.1)

    #Resetting erase list
        for x in erase:
            erase.pop(counter)
            counter = counter + 1
    
        counter = 0
        time.sleep(.5)
        
    #Check to see which shape to draw
    if(shape % 8 == 6):
        
    #Drawing nonagons
        for i in range(0,randint(25,50)):
            nonagon = Polygon(Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)))
            color = color_rgb(randint(0,255),randint(0,255),randint(0,255))
            nonagon.setFill(color)
            nonagon.setOutline(color)
            nonagon.draw(w)
            time.sleep(.2)
            erase.append(nonagon)

    #Reversing list
        erase.reverse()

    #Undrawing nonagons
        for x in erase:
            x.undraw()
            time.sleep(.1)

    #Resetting erase list
        for x in erase:
            erase.pop(counter)
            counter = counter + 1
    
        counter = 0
        time.sleep(.5)
        
    #Check to see which shape to draw
    if(shape % 8 == 7):
        
    #Drawing decagons
        for i in range(0,randint(25,50)):
            decagon = Polygon(Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)),Point(randint(0,600),randint(0,600)))
            color = color_rgb(randint(0,255),randint(0,255),randint(0,255))
            decagon.setFill(color)
            decagon.setOutline(color)
            decagon.draw(w)
            time.sleep(.2)
            erase.append(decagon)

    #Reversing list
        erase.reverse()

    #Undrawing decagons
        for x in erase:
            x.undraw()
            time.sleep(.1)

    #Resetting erase list
        for x in erase:
            erase.pop(counter)
            counter = counter + 1
    
        counter = 0
        time.sleep(.5)

    #Swapping shape    
    shape = shape + 1
