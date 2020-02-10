public class PseudoRandomNumbers
{
   public static void main(String[] args)
   {
      //small number variables
      int m = 11;
      int a = 7;
      int c = 5;
      int s = 3;
      int x0 = s;
      int xN = 0;
      System.out.println("Small series of Pseudo Random Numbers");
      for(int i = 0; i < 50; i++)
      {
         xN = (a * x0 + c) % m;
         System.out.print(xN + " ");
         x0 = xN;
      }
      System.out.println();
      System.out.println("Large series of Psuedo Random Numbers");
      //large number variables
      m = 2147483647;
      a = 16807;
      c = 0;
      s = 3;
      for(int i = 0; i < 50; i++)
      {
         xN = (a * x0 + c) % m;
         System.out.print(xN + " ");
         x0 = xN;
      } 
   }

}