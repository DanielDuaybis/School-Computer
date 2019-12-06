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
	string term;
	ifstream kevin;
//	ifstream josiah;
	char tenors;
//	string quads;
	kevin.open("welcome.txt", ios::in);

	while(kevin >> tenors)
	{
		cout << tenors;
		Sleep(50);
	}
	Sleep(200);
	gotoxy(0,0);
	cout<<"                                                                                                                                                                  ";
	gotoxy(0,0);
	cout<<"Please input the name of the person you would like to look up or type (in) to submit a description";
	Sleep(2000);
	gotoxy(0,0);
	cout<<"                                                                                                                ";
	gotoxy(0,0);
	cout<<"Or you can type input to submit a description (Not functional yet): ";
	cin>>term;
	cout<<endl<<endl<<endl;
	
	
//	if(term == "kevin")
//	{
		ifstream josiah;
		string quads;
		josiah.open("kevin.txt", ios::in);
	
		while(josiah >> quads)
		{
			cout << quads;
		}
//	}
	if(term == "daniel")
	{
		ifstream josiah;
		string quads;
		josiah.open("daniel.txt", ios::in);
	
		while(josiah >> quads)
		{
			cout << quads;
		}
	}	
}
