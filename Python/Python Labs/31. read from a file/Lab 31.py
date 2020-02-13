#Lab 31
from random import *
file = open('ColorList.txt','r+')
i = ['red\n','orange\n','yellow\n','green\n','blue\n','purple\n','cyan\n','white\n','tan\n']
file.writelines(i)

print(file.readlines())
