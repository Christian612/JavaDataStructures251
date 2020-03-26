//Dice Roller
//Deomonstrating generating random numbers and using a do while loop
#include <iostream>
#include <cstdlib> //Contains random number generating
#include <ctime>
using namespace std;

int main()
{
   char again;
   do{
      //random number generator seed
      srand(static_cast<unsigned int>(time(0))); 
      //generate random number
      int randomNumber = random();
      //Get a number between 1 and 6
      int die = (randomNumber%6)+1;
      cout << "You rolled " << die << endl;
      cout << "Do you want to roll again? (y/n)";
      cin >> again;
   }while(again == 'y' || again == 'Y');
   return 0;
}  