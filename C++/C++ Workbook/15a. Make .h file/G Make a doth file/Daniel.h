#ifndef _GABY_H_
#define	_GABY_H_


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




void drawbox(int x, int y,int width, int height, char sym);
//This makes a filled box
void drawbox(int x, int y,int width, int height, char sym)
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

void framedbox(int x, int y, int width, int height, char sym);
//This makes a framed box
void framedbox(int x, int y, int width, int height, char sym)
{
     gotoxy(x,y);
     for(int i = 0; i < height; i++)
     {
     	for(int i = 0; i < width; i++)
     	{
     		cout<<sym;
		}
		gotoxy(x,y + i)
	 }
	 gotoxy(x + 1, y + 1);
	 for(int i = 0; i < height - 2; i++)
     {
     	for(int i = 0; i < width - 2; i++)
     	{
     		cout<<' ';
		}
		gotoxy(x + 1,y + i)
	 }
	 
}

void drawline(int x, int y, int length, char sym);
//This makes a line
void drawline(int x, int y, int length, char sym)
{
     gotoxy(x,y);
     for(int i = 0; i < length; i ++)
     {
     	cout<<sym;
	 }
     
}
     
#endif


