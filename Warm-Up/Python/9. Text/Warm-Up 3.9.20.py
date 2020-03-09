#Warm-Up 3/9/20
from graphics import *
from random import *

print("WELCOME TO THE DEITCH LIBRARY")
book = input("Which book would you like? ")
text = []

if(book == 'Fahrenheit 451'):
    file = open('Fahrenheit.txt','r')
    w = GraphWin("THE LIBRARY",1400,700)
    for line in file:
        for word in line.split():
            text.append(word)
print(text)
'''
    for i in file:
        number = randint(0,len(text) - 1)
        randword = Text(Point(randint(0,1400),randint(0,700)),text[number])
        r = randint(0,255)
        g = randint(0,255)
        b = randint(0,255)
        randcolor = color_rgb(r,g,b)
        randword.setFill(randcolor)
        randword.setSize(randint(5,36))
        randword.draw(w)
        text.pop(number)
'''
