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
void lines(int);
main()
{
      srand(time(NULL)); 
  	// write code here
	// leave the following line in all programs
  	lines(9);
      getch();
}
void line(int repeat)
{
	int counter = 1;
	for(int i = 0; i < repeat; i++)
	{
		for(int i = 0; i < counter; i++)
		{
			cout<<'*';
		}
		counter++;
		cout<<endl;
	}
}


