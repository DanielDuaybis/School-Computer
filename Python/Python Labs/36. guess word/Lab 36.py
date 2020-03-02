#Lab 36
from graphics import *
from random import *

file = open('ColorList.txt','r')
colors = file.readlines()

while True:
    letters = []
    color = colors[randint(0,8)]

    for i in color:
        letters.append(i)

    letters.pop(len(letters) - 1)

    print("Here is your scrambled word: ",end='')

    for x in range(0,len(letters)):
        number = randint(0,len(letters) - 1)
        letter = letters[number]
        print(letter,end='')
        letters.pop(number)

    print()
    guess = input("Please enter your guess: ")

    if(guess == color):
        print()
        print("You got it!")
        time.sleep(.5)
        print()
        again = input("Would you like to play again? (yes or no) ")
        if(again =="no"):
            break;
    
    else:
        print()
        guess = input("Please try again: ")

print()
print("Thanks for playing!")
