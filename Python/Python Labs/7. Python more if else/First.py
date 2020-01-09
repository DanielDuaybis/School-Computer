#Lab 7
num1 = input("What is the first number? ")
oper = input("What is the operation? ")
num2 = input("What is the second number? ")
if(oper == "+"):
    solution = int(num1) + int(num2)
    print(str(num1) + oper + str(num2) + "=" + str(solution))
elif(oper == "-"):
    solution = int(num1) - int(num2)
    print(str(num1) + oper + str(num2) + "=" + str(solution))
elif(oper == "*"):
    solution = int(num1) * int(num2)
    print(str(num1) + oper + str(num2) + "=" + str(solution))
elif(oper == "/"):
    solution = int(num1) / int(num2)
    print(str(num1) + oper + str(num2) + "=" + str(solution))
