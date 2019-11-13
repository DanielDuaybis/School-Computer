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
  	string stop;
  	int counter = 0;
  	gotoxy(1,3);
  	for(int i = 0; i < 5; i++)
  	{
  		cout<<'@';
	}
	gotoxy(1,7);
	for(int i = 0; i < 5; i++)
	{
		cout<<'@';
	}
	gotoxy(1,3);
	for(int i = 0; i < 5; i++)
	{
		cout<<'@';
		gotoxy(1,3 + counter);
		counter++;
	}
	gotoxy(5,3);
	counter = 0;
	for(int i = 0; i < 5; i++)
	{
		cout<<'@';
		gotoxy(5,3 + counter);
		counter++;
	}
	gotoxy(3,5);
	cout<<random(9);
	gotoxy(0,10);
	counter = 1;
	while(true)
	{
		gotoxy(0,10 + counter);
		counter++;
		cout<<"Would you like another random number?";
		cin>>stop;
		if(stop=="yes")
		{
			gotoxy(3,5);
			cout<<random(9);
		}
		else if(stop=="no")
		{
			break;
		}
		else
		{
			cout<<"DON'T YOU DARE SASS ME YOU SWINE";
		}
	}
	
	// leave the following line in all programs
  
      getch();
}


