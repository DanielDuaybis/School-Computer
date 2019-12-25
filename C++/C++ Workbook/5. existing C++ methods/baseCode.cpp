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
  	char input;
  	char direc;
  	int length;
  	int counter;
  	int xx = 0;
  	int yy = 3;
  	cout<<"Please enter the symbol:   ";
  	cin>>input;
  	cout<<"Please enter the length:   ";
  	cin>>length;
  	cout<<"Please enter the direction (h, v, or d):   ";
  	cin>>direc;
  	if(direc == 'h')
  	{
  		for(counter = 0; counter < length; counter++)
  		{
  			cout<<input<<"  ";
		  }
	  }
	if(direc == 'v')
	{
		for(counter = 0; counter < length; counter++)
		{
			cout<<input<<endl;
			}
		}
	if(direc == 'd')
	{
		for(counter = 0; counter <= length - 1; counter++)
		{
			gotoxy(xx,yy),
			cout<<input;
			xx++;
			yy++;
			}
		}
	
      getch();
}


