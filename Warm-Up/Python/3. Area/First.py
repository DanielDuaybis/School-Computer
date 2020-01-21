#Lab 12
shape = input("What shape would you like to find the area of? ")
if(shape == "rectangle"):
    side1 = input("What is the length of side #1? ")
    side2 = input("What is the length of side #2? ")
    print("The area of your rectangle is: ", end='')
    print(int(side1)*int(side2))
elif(shape == "triangle"):
    base = input("What is the base length of your triangle? ")
    height = input("What is the height of your triangle? ")
    print("The area of your triangle is: ",end='')
    print(int(base)*int(height)/2)
elif(shape == "circle"):
    radius = input("What is the radius of your circle? ")
    print("The area of your circle is approximately: ",end='')
    print(int(radius)*int(radius)*3.14159)
else:
    print("This program does not run that shape")
