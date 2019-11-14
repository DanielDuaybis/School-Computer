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
	int counter = 1;
  	gotoxy(3,3);
  	for(int i = 0; i < 5; i++)
  	{
  		for(int i = 0; i < 6; i++)
  		{
  			cout<<'@';
		  }
		gotoxy(3,3 + counter);
  		counter++;
	  }
	gotoxy(4,4);
	counter = 0;
	for(int i = 0; i < 4; i++)
  	{
  		for(int i = 0; i < 4; i++)
  		{
  			cout<<' ';
		  }
		gotoxy(4,4 + counter);
  		counter++;
	  }
	gotoxy(5,5);
	cout<<random(99);
	gotoxy(0,15);
	cout<<"Press q to quit or any other key to generate another number:  ";
	char input = getch();
	while(true)
	{
		input = getch();
		if(input == 'q')
		{
			break;
		}
		else
		{
			gotoxy(5,5);
			cout<<random(9);
		}
	}
	gotoxy(0,20);
}


