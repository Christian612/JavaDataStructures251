//Play Again
//Demonstrate usage of while loops
#include<iostream>
using namespace std;

int main()
{
   char again = 'y';
   while(again == 'y')
   {
      cout << "\n";
      cout << "\nDo you want to play again? (y/n):";
      cin >> again;
   }
   cout < "\nOkay, bye-bye";
   
   return 0;
}