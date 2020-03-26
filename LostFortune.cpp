//Lost Fortune  
//A personalized adventure game

#include<iostream>
//Allows a string object to access a string through a variable
#include<string>
using std:: cout;
using std:: cin;
using std:: endl;
using std:: string;

//Getting the players information
int main()
{
   const int GOLD_PIECES = 900;
   int adventurers;
   int killed;
   int survivors;
   string leader;
   string island;
   
   //Asking player for their information
   cout << "Welcome one, welcome all to the amazing Lost Fortune Adventure Game ";
   cout << "Please enter the following for your personalized adventure\n";
   
   //Determines the number of adventures players been on
   cout << "Enter a number";
   cin >> adventurers;
   
   //Detrmines the origin of player
   cout << "Enter where you're from";
   cin >> island;
   
   //
   cout << "Enter a number, smaller than the first number: ";
   cin >> killed;
   
   //
   surivors = adventuerers - killed;
   
   cout << "Enter your last name: ";
   cin >> leader;
   
   //Tell the story
   cout << "A devilous and brave group that defied death itself of about " adventurers << " men set out on a quest.";
   cout << "They set out on a quesrt to find the cursed treasure of Anthena.";
   cout << "There was only one man amongst these beasts who had every mans respect. Their name is " << leaders << " of the great island of " << island <<".";
   
   cout << "\nWhile the crew were having a festival in the woods of ";
}  

   