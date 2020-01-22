#Lab 12
import math
shape = input("What shape would you like to find the area of? ")

#Area of a Rectangle
if(shape == "rectangle"):
    side1 = input("What is the length of side #1? ")
    side2 = input("What is the length of side #2? ")
    print("The area of your rectangle is: ", end='')
    print(int(side1) * int(side2))

#Area of a Triangle
elif(shape == "triangle"):
    base = input("What is the base length of your triangle? ")
    height = input("What is the height of your triangle? ")
    print("The area of your triangle is: ",end='')
    print(int(base) * int(height)/2)

#Area of a Circle(Approximate)
elif(shape == "circle"):
    radius = input("What is the radius of your circle? ")
    print("The area of your circle is approximately: ",end='')
    print(int(radius)**2 * math.pi)

#Else
else:
    print("This program does not run that shape")
