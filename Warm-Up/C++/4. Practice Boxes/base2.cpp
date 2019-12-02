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
  	framedbox(0,0,5,5,'@');
  	framedbox(5,5,5,5,'@');
  	framedbox(10,10,5,5,'@');
  	framedbox(15,15,5,5,'@');
  	framedbox(20,20,5,5,'@');
}
      
