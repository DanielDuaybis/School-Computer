#Lab 8
length = input("What is the length of your line? ")
orientation = input("Do you want your line horizontal or vertical? ")
sym = input("What will your line be made out of? ")

if(orientation == "horizontal"):
    for x in range(0,int(length)):
        print(sym,end='')
if(orientation == "vertical"):
    for x in range(0, int(length)):
        print(sym)
