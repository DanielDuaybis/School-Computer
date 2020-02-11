#Lab 32
from graphics import *
from random import *
file = open("ColorList.txt",'r')
print(file.readline(randint(0,9)))
file.close()
