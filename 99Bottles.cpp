//99 Bottles
//Proram that prints the song "99 bottles of beer on the wall"
#include<iostream>
using namespace std;

int main()
{
   for(int i = 99; i > 0; i--)
   {
      if(i > 10)
         cout << i + " bottles of beer on the wall." << endl;
      else
         //If the index is less than 10 then 'bottles' becomes singular  
         cout << i + " bottle of beer on on the wall." << endl;
   }
   
   return 0;
}