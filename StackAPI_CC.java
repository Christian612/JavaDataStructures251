//Christian Crawford
import java.util.*;
import java.util.Scanner;
public class StackAPI_CC
{
   public static void main(String[] args)
   {
      //Scanner object
      Scanner keyboard = new Scanner(System.in);
      //Create an empty stack
      Stack<Integer> myStack = new Stack<Integer>();
      
      //Store into stack
      for(int i=0; i<10;i++)
      {
         myStack.push(i);
      }  
      //Display the  elements in a stack
      System.out.println("Initial Stack: " + myStack);
      //Add an element to stack
      System.out.println("Ënter an element: ");
      int num = keyboard.nextInt();
      myStack.push(num);
   }
}