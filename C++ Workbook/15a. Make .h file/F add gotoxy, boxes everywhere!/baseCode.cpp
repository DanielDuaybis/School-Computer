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
void drawBox(int, int, int, int, char);
main()
{
      srand(time(NULL)); 
  	// write code here
	// leave the following line in all programs
  	drawBox(6,8,9,9,'&');
      getch();
}
void drawBox(int x, int y, int width, int height, char sym)
{
	gotoxy(x,y);
	for(int i = 0; i < height; i++)
	{
		for(int i = 0; i < width; i++)
		{
			cout<<sym;
		}
		gotoxy(x,y + i);
	}
}


