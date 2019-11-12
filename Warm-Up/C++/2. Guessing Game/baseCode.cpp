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
  	int num = random(100);
  	int guess;
  	while(true)
  	{
  		cout<<"I am thinking of a number between 1 an 100"<<endl<<endl;
  		cout<<"Guess:  ";
  		cin>>guess;
  		cout<<endl;
  		if(guess==num)
  		{
  			cout<<"CONGRATULATIONS! YOU GUESSED THE NUMBER!";
  			break;
		  }
		else if(guess>num)
		{
			cout<<"Please try again, your guess is too high"<<endl<<endl;
		  }
		else
		{
			cout<<"Please try again, your answer is too low"<<endl<<endl;
		  }
	  }
      getch();
}


