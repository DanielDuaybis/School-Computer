// base code file

#include <iostream>
#include <windows.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>
#include <sstream>
#include <fstream>
using namespace std;
void gotoxy(short x, short y) {
	COORD pos = {x, y};
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), pos);
	}
// generates a random number between 0 and r inclusive
int random(int r)
{
    return rand()% r + 1;
}  
///////////////////////////////////////////////////////////////////////
main()
{
      srand(time(NULL)); 
  	// write code here
  	int num1;
  	int num2;
  	char op;
  	string stop;
  	while(true)
  	{
  		cout<<"Please enter the first number:   ";
  		cin>>num1;
  		cout<<"Please enter the second number:   ";
  		cin>>num2;
  		cout<<"Please enter the operation to be performed (+,-,*,/):   ";
  		cin>>op;
  		if(op=='+')
  		{
			cout<<num1+num2;
		}
		else if(op=='-')
		{
			cout<<num1-num2;
		}
		else if(op=='*')
		{
			cout<<num1*num2;
		}
		else if(op=='/')
		{
			cout<<num1/num2;
		}
		else
		{
			cout<<"THAT IS NOT A VALID OPERATION YOU SWINE";
		}
		cout<<"Would you like to me to perform another operation?\n"
		cin>>stop
		if(stop==yes)
		{
		}
		else
		{
			cout<<"FAREWELL FIEND"
			break;
		}
	}
  	
	
	// leave the following line in all programs
  
      getch();
}


