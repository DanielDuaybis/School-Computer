#Lab 36
from graphics import *
from random import *

file = open('ColorList.txt','r')
colors = file.readlines()



while True:
    letters = []
    color = colors[randint(0,8)]

    listToStr = "".join([str(elem) for elem in color])
    if(int(len(listToStr)) > 3):
        listToStr = listToStr[0:len(listToStr) - 1]

    print("/",listToStr,"/")

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
    guess = input("What color is this? ")
    if(guess == str(color)):
        print()
        print("Congratulations!")
        again = input("Would you like to play again? (yese or no) ")
        if(again == "no"):
            break;
    else:
        while True:
            print()
            print("YOU ARE WRONG!")
            guess = input("Please try again: ")
            if(guess == color):
                print()
                print("Congratulations!")
                again = input("Would you like to play again? (yese or no) ")
                if(again == "no"):
                    break;

print()
print("Thanks for playing!")
