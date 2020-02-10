import java.util.Scanner;
public class Driver_NodeCCC
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Int_NodeCCC liss = new Int_NodeCCC(4, null);
      //System.out.println("Enter number");
      // int item = new Int_NodeCCC();
      /*make a variable to store input
      make a new node with parameters new Int_NodeCCC(<your variable>, <connection to next link>)*/
      liss.insertEmpty(1);
      liss.printList();
      //liss.insertEmpty(3);
      //liss.insertEmpty(5);
      //int item = keyboard.nextInt();
      //Node that stores the item variable with the link (in this example null)
     // Int_NodeCCC item2 = new Int_NodeCCC(item, null);
      liss.addToEnd(2);
      liss.printList();
   }
}