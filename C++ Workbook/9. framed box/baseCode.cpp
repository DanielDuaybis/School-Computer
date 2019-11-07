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
	int width;
  	int height;
  	int counter = 0;
  	cout<<"Please input the frame character:  ";
  	cin>>input;
  	cout<<"Please input the width:  ";
  	cin>>width;
  	cout<<"Please input the height:  ";
  	cin>>height;
  	for(int i = 0; i < 2; i++)
  	{
		for(int i = 0; i < width; i++)
  		{
  			cout<<input;
		}
		gotoxy(0,height + 4);
	}
	for(int i = 0; i < 2; i++)
	{
		for(int i = 0; i < height; i++)
		{
			cout<<input;
			gotoxy(0,4 + counter);
			counter++;
		}
		gotoxy(width,4)
	}
      getch();
}


