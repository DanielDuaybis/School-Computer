// base code file
#include"Daniel.h"
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
  	int num1;
  	int num2;
  	int num3;
  	char input;
  	cout<<"How much money will you bet(Limit of 99!):  $";
  	cin>>bet;
  	gotoxy(0,0);
  	cout<<"                                                   ";
  	while(bet > 99)
  	{
  		gotoxy(0,0);
		cout<"                                                                    ";
  		gotoxy(0,0);
  		Sleep(1000);
  		cout<<"Try again...swine";
  		gotoxy(0,0);
  		Sleep(1000);
  		cout<<"                                                            ";
  		Sleep(1000);
  		gotoxy(0,0);
  		cout<<"How much money will you bet(Limit of 99!):  $";
  		cin>>bet;
	}
  	gotoxy(0,0);
  	cout<<"                                                             ";
  	Sleep(1500);
  	gotoxy(0,0);
  	cout<<"Press space to start and stop the slots";
	Sleep(1500);
	gotoxy(0,0);
	cout<<"                                                             ";
  	gotoxy(0,0);
  	cout<<"Remember, press 'q' to quit!";
	Sleep(1500); 
  	framedbox(0,0,20,50,'$');
  	framedbox(0,0,5,25,'$');
  	framedbox(4,8,5,7,'#');
  	framedbox(19,8,5,7,'#');
  	framedbox(34,8,5,7,'#');
  	gotoxy(2,2);
  	cout<<"Credits:  $";
  	cout<<bet;
	while(getch() != 'q')
	{
		while(kbhit() == 0)
		{
			gotoxy(6,10);
			num1 = random(100);
			cout<<num1<<' ';
			gotoxy(21,10);
			num2 = random(100);
			cout<<num2<<' ';
			gotoxy(36,10);
			num3 = random(100);
			cout<<num3<<' ';
			gotoxy(4,16);
			cout<<"                               ";
			Sleep(75);
			
		}
		gotoxy(13,2);
		if(bet < 10)
		{
			gotoxy(16,2);
			cout<<'0';
		}
		else
		{
			gotoxy(17,2);
			cout<<'0';
		}
		gotoxy(13,2);
		bet = bet - .05;
		cout<<bet;
		getch();
		if(num1 == num2 && num2 == num3 && num1 == num3)
		{
			gotoxy(4,17);
			cout<<"JACKPOT! YOU WON $20.00!";
			bet = bet + 20;
			gotoxy(13,2);
			cout<<bet<<' ';
		}
		else if(num1 == num2)
		{
			gotoxy(4,16);
			cout<<"You won 50 cents!";
			bet = bet + .50;
			gotoxy(13,2);
			cout<<bet<<' ';
		}
		else if(num2 == num3)
		{
			gotoxy(4,16);
			cout<<"You won 50 cents!";
			bet = bet + .50;
			gotoxy(13,2);
			cout<<bet<<' ';
		}
		else if(num1 == num3)
		{
			gotoxy(4,16);
			cout<<"You won 50 cents!";
			bet = bet + .50;
			gotoxy(13,2);
			cout<<bet<<' ';
		}
		if(bet <= 0)
		{
			gotoxy(4,17);
			cout<<"YOU LOSE, FAREWELL SWINE!";
			gotoxy(0,23);
			break;
		}
	}
	if(bet < 0)
	{
		gotoxy(30,17);
		cout<<"00";
		gotoxy(4,17);
		cout<<"Your grand total is:  $"<<bet;
		gotoxy(0,23);
		cout<<"Have a nice day!";
	}
}
      
