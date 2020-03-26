//Christian Crawford
import java.util.Scanner;
public class CC_NodeDriver
{
   public static void main(String[] args)
   {
      //Scanner object 
      Scanner keyboard = new Scanner(System.in);
      
      //List object
      CC_IntNode obj = new CC_IntNode(0, null);
      
      //Add to head
      System.out.println("First node added");
      obj.addFirstNode();
      
      System.out.println("Print elements in stack");
      obj.printNode();
      
      //Add second node
      System.out.println("Second node added");
      obj.addSecondNode();
      
      System.out.println("Print elements in stack");
      obj.printNode();

   
      //Add to end of list
      System.out.println("Enter last node");
      obj.addTail();
      
      //Print elements in list
     System.out.println("Print elements in stack");
      obj.printNode();
      
      //Add node in the middle
      System.out.println("Enter the value u want to add after");
      int num4 = keyboard.nextInt();
      System.out.println("Enter a value to add to list");
      int num5 = keyboard.nextInt();
      obj.middleNodeAfter(num4, num5);
      
   
      //Remove front element
      obj.removeFront();
      System.out.println("First node lost!");
      
      //Print elements in list
      obj.printNode();
      
      //Remove last node
      obj.removeTail();
      System.out.println("Last node gone!");
      
      //Print elements in list
      obj.printNode();

      
      //Remove middle node
      //obj.removeMiddle();
      System.out.println("Middle node disppeared!");
      
      System.out.println("Print elements in stack");
      obj.printNode();
   }
}