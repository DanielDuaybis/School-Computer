#Lab 35
from graphics import *
from random import *

file = open('ColorList.txt','r')
colors = file.readlines()
letters = []
color = colors[randint(0,8)]

for i in color:
    letters.append(i)

letters.pop(len(letters) - 1)
print(letters)

for x in range(0,len(letters)):
    number = randint(0,len(letters) - 1)
    letter = letters[number]
    print(letter,end='')
    letters.pop(number)

