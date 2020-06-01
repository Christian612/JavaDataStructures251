//Christian Crawford
import java.util.Scanner;
public class CrawfordCDriverLL
{
   public static void main(String[] args)
   {
      //Scanner object
      Scanner keyboard = new Scanner(System.in);
      //Queue object
      CrawfordCClassLL obj = new CrawfordCClassLL();
      
      System.out.println("Add an element to the empty queue");
      int num1 = keyboard.nextInt();
      obj.Q_addToEmptyCC(num1);
      
      System.out.println("Add to the rear");
      int num2 = keyboard.nextInt();
      obj.Q_addToRearCC(num2);
      
      System.out.println("Add to the rear");
      int num3 = keyboard.nextInt();
      obj.Q_addToRearCC(num3);
      
      System.out.println("The elements in the queue are: ");
      obj.Q_Print();
      
      System.out.println("Front removed");
      obj.Q_RemoveFrontCC(2);
      
      System.out.println("The elements in the queue are: ");
      obj.Q_Print();

     
      System.out.println("Enter an integer to  searchthrough the queue");
      int num8 = keyboard.nextInt();
      obj.Q_SearchCC(num8);
      
      System.out.println("This is the largest element in the queue: ");
      obj.Q_FindLargest();
            
      System.out.println("This is the elements that are odd in the queue: ");
      obj.Q_PrintOdd();
      
      System.out.println("Enter an integer that occurs");
      int num9 = keyboard.nextInt();
      obj.Q_NumOccur(num9);
      
      System.out.println("Enter an integer in the queue to remove");
      int num7 = keyboard.nextInt();
      obj.Q_FindRemove(num7);
      
      System.out.println("The elements in the queue are: ");
      obj.Q_Print();
   }
}