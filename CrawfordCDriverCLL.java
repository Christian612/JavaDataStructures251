import java.util.Scanner;
public class CrawfordCDriverCLL
{ 
   public static void main(String[] args)
   {
      //Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //CLL Object
      CrawfordC_CLL obj = new CrawfordC_CLL();
     
      //Add an element to front 
      obj.addEmptyCLL(1);
      System.out.println("Element added to front of list");
      
      //Add element to end of list
      obj.addToEndCLL(2);
      System.out.println("Element added to rear of list");
      
      //Add anywhere in node
      System.out.println("Enter element you want to add before");
      int num = keyboard.nextInt();
      obj.addAnywhereCLL(num);
      
      //Add anywhere in node
      System.out.println("Enter element you want to add before");
      int num2 = keyboard.nextInt();
      obj.addAnywhereCLL(num);

      //Add anywhere in node
      System.out.println("Enter element you want to add before");
      int num3 = keyboard.nextInt();
      obj.addAnywhereCLL(num);

      
      //Delete the end of a list
      obj.deleteEndCLL();
      //Print out elements after end of list delted
      obj.printCLL();
      
      //Delete the front node
      obj.deleteFrontCLL();
     //Print out elements after front was delted
     obj.printCLL();
     
     //Search and delete an element
     obj.deleteAnywhereCLL(2);
     //Print outelements after searched node delted
     obj.printCLL(); 
     
   }
 }