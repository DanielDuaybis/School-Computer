// base code file
#include"Gaby.h"
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
  // write code here
  	double bet;
  	cout<<"How much money will you bet:  $";
  	cin>>bet;
  	framedbox(0,0,20,50,'$');
  	framedbox(0,0,5,20,'$');
  	framedbox(4,8,5,7,'#');
  	framedbox(19,8,5,7,'#');
  	framedbox(34,8,5,7,'#');
  	gotoxy(21,0);
  	cout<<random(100);
}
      
