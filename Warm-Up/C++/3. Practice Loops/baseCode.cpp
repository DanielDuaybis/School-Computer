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
  	char c;
  	char v;
  	int counter = 1;
  	int counter2 = 1;
  	cout<<"What shall be the symbol for the C?  ";
  	cin>>c;
  	cout<<"What shall be the symbol for the V?  ";
  	cin>>v;
  	gotoxy(5,5);
  	for(int i = 0; i < 10; i++)
  	{
  		for(int i = 0; i < 5; i++)
  		{
  			cout<<c;
		}
		gotoxy(5, 5 + counter);
  		counter++;
	}
	counter = 1;
	gotoxy(6,6);
	for(int i = 0; i < 8; i++)
  	{
  		for(int i = 0; i < 4; i++)
  		{
  			cout<<'?';
		}
		gotoxy(6, 6 + counter);
  		counter++;
	}
	gotoxy(15,5);
	counter = 1;
	for(int i = 0; i < 10; i++)
	{
		cout<<v;
		gotoxy(15 + counter, 5 + counter2);
		counter++;
		counter2++;
	}
	counter = 1;
	counter2 = 1;
	gotoxy(24,14);
	for(int i = 0; i < 10; i++)
	{
		cout<<v;
		gotoxy(24 + counter, 14 - counter);
		counter++;
		counter2++;
	}
      getch();
}


