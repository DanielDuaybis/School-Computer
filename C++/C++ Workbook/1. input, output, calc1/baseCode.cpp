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
  double number1;
  double number2;
  cout<<"Please enter the first number:   ";
  cin>>number1;
  cout<<"Please enter the second number:   ";
  cin>>number2;
  cout<<"THEY SHALL BE MULTIPLIED\n";
  cout<<number1 * number2;
  
  // leave the following line in all programs
  
      getch();
}


