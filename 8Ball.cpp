//Magic 8-Ball
//Simulates a magic 8 ball
#include<iostream>
#include<ctime>
using namespace std;

int main()
{
   string answers[] = {"It is certain", "It is decidel so", "Without a doubt", "Yes", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Signs point to yes", "Reply hazy, try again", "Ask again later","Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "Maybe", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful}";
   string problem;
   char playAgain;
   do{
      cout << "Present your problems and an answer will appear" <<endl;
      cin >> problem;
      //Seed the random sequence generated by rand()
      srand(time(NULL));
      //Use the %20 to keep the random word between 0-20
      cout << answers[rand()%4] << endl;
      cout << "Play again? (Y/N)";
      cin >> playAgain;
   }while(playAgain = 'Y' || playAgain = 'y');
   
   return 0;
}