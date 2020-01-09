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
	// leave the following line in all programs
  	char border;
  	int num1;
  	int num2;
  	char op;
  	int counter = 1;
  	cout<<"Please enter the border char for your calculator:  ";
  	cin>>border;
  	cout<<"Please enter the first number:  ";
  	cin>>num1;
  	cout<<"Please enter the operator:  ";
  	cin>>op;
  	cout<<"Please the second number:  ";
  	cin>>num2;
  	gotoxy(1,7);
  	for(int i = 0; i < 15; i++)
  	{
  		cout<<border;
	  }
	gotoxy(1,11);
	for(int i = 0; i < 15; i++)
  	{
  		cout<<border;
	  }
	  gotoxy(1,7);
	for(int i = 0; i < 4; i++)  
	{
		cout<<border;
		gotoxy(1,7 + counter);
		counter++;	
	  }
	  gotoxy(15,7);
	  counter = 0;
	for(int i = 0; i < 5; i++)  
	{
		cout<<border;
		gotoxy(15,7 + counter);
		counter++;
	  }
	gotoxy(3,9);
	cout<<num1;
	cout<<' ';
	cout<<op;
	cout<<' ';
	cout<<num2;
	cout<<' ';
	cout<<'=';
	cout<<' ';
	if(op=='+')
	{
		cout<<num1+num2;
	}
	if(op=='-')
	{
		cout<<num1-num2;
	}
	if(op=='*')
	{
		cout<<num1*num2;
	}
	if(op=='/')
	{
		cout<<num1/num2;
	}
      getch();
      cout<<endl<<endl;
}


