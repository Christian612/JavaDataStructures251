import java.util.Scanner;
public class DriverBegin_CC
{
   public static void main(String[] args)
   {
         Scanner keyboard = new Scanner(System.in);
         CLLBegin_CC list = new CLLBegin_CC(0,null);
         list.addToRear(1);
         list.addToRear(2);
//          list.addToRear(4);
//          list.printNodes();
//          list.removeFront();
         list.printNodes();
   }
}