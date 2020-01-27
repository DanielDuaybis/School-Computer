#Warm-Up 1/27/20

num = int(input("How high do you want your prime numbers to go to? "))

i = 2
while i > 1:
    for x in range(2,num):
        if(num % x != 0):
            print(x)
