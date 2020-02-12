#Warm-Up 2/10/20
from graphics import *
from random import *

w = GraphWin('I AM A WINDOW',500,500)
w.setBackground('black')

word = Text(Point(250,250),'GO CYMBALS')
word.draw(w)
word.setSize(5)
word.setTextColor('cyan')

counter = 4

while True:
    for i in range(5,36):
        word.setSize(i)
        col = color_rgb(randint(0,255),randint(0,255),randint(0,255))
        word.setTextColor(col)
        time.sleep(.01)
    for i in range(36,5,-1):
        word.setSize(i)
        col = color_rgb(randint(0,255),randint(0,255),randint(0,255))
        word.setTextColor(col)
        time.sleep(.01)
    if(counter % 4 == 0):
        word.setFace('helvetica')
    if(counter % 4 == 1):
        word.setFace('courier')
    if(counter % 4 == 2):
        word.setFace('arial')
    if(counter % 4 == 3):
        word.setFace('times roman')
    counter = counter + 1
