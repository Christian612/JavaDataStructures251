//Christian Crawford
//Data Structures
//Array Properties:
//1. Array has a fixed size
//2. Array is a continguous block of memory
//3. Array is a linear collection
//4. Array can only define one data type at a time
import java.util.*;
import java.util.Scanner;

public class DriverHW1_CC{ 
   public static void main(String[] args)
   {
      //Scanner object
      Scanner keyboard = new Scanner(System.in);
      //Object for ClassHW1_CC
      ClassHW1_CC myArray = new ClassHW1_CC();
      
      //Methods
      System.out.println("Part 1: Store elements into array");
      myArray.storeArray(); 
      
      
      // System.out.println("Enter a number that is less than 30 and odd: ");
//       int num = keyboard.nextInt();
//       array.addElement(num);          
      //arrayTest.searchReplace(3,6);
      //arrayTest.numOccur(7);
      //arrayTest.searchDelete(4);
      //arrayTest.printOdd(); // number 10 is messing this method up
      
      System.out.println("Part : Print out elements of array");
      myArray.printArray();
   }
}