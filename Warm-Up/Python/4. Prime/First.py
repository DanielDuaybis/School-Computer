#Warm-Up 1/27/20

for x in range(1,1000000000000000000000000000000000000 + 1):
       for i in range(2,x):
              if(x % i) == 0:
                     break
              else:
                     print(x)
