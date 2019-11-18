// base code file
#include"Gaby.h"
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
  	cout<<"How much money will you bet:  $";
  	cin>>bet;
  	framedbox(0,0,20,50,'$');
  	framedbox(0,0,5,20,'$');
  	framedbox(4,8,5,7,'#');
  	framedbox(19,8,5,7,'#');
  	framedbox(34,8,5,7,'#');
	while(kbhit() == 0)
	{
		gotoxy(6,10);
		cout<<random(99);
		gotoxy(21,10);
		cout<<random(99);
		gotoxy(36,10);
		cout<<random(99);
	}
}
      
