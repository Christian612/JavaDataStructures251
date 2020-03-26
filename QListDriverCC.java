//Christian Crawford
//The comments are used as algorithms to explain the code
//The Driver
import java.util.*;
public class QListDriverCC
{
   public static void main(String[] args)
   {  
      //(1) Create object to call list
      Q_ListNodeCC list = new Q_ListNodeCC(1,null);
      //(2)Call the addToEmpty method and pass a integer 
      list.addToEmptyList(1);
      //(3)Call the addToFrontExistingList method and pass a integer
      list.addToFrontExistingList(2);
      //(4)Call the addToTail method and pass a integer
      list.addToTail(3);
      //(5)Call the addAfter method and pass a integer
      list.addAfter(4);
      //(6)Call the addBefore method and pass a integer
      list.addBefore(5);
      //(7)Call the searchList method and pass a integer
      list.searchList(3);
      //(8)Call the printList to print all the nodes in the list
      list.printList();
   }   
}