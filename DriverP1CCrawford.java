//Christian Crawford
import java.util.Scanner;
public class DriverP1CCrawford
{
   public static void main(String[] args)
   { 
      //Scanner object
      Scanner keyboard = new Scanner(System.in);
      //Object for ArrayP1_CC
      ArrayP1_CC obj = new ArrayP1_CC();
      
      //Methods
      System.out.println("Part 1: Store elements into array"); 
      obj.storeArray();
      
      System.out.println("\nPart 2: Print element of array out");
      obj.printArray(); 
      
      System.out.println("\nPart 3: Add and element to array");
      System.out.println("Enter a string of words");
      String addInput = keyboard.nextLine();
      obj.addArray(addInput);
      
      System.out.println("\nPart 4: Search for a particular element in array");
      System.out.println("\nPlease enter a word to search for: ");
      String searchInput = keyboard.nextLine();
      obj.searchArray(searchInput);
      
      System.out.println("\nPart 5: Print out elements of array in reverse order");
      obj.printReverse();
      
      System.out.println("\nPart 6: Find the longest string in the array");
      obj.longestString();
      
      System.out.println("\nPart 7: Find the smallest string in the array"); 
      obj.smallestString();
      
      System.out.println("\nPart 8: Add a character to array");
      System.out.println("\nPlease enter a character to insert into array  : ");
      char insertC = keyboard.next().charAt(0);
      obj.insertChar(insertC);
      
      
   }  
}