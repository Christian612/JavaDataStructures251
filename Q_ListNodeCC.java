//Christian Crawford
//The comments are used as algorithms to explain the code
//The Class
public class Q_ListNodeCC
{
   //Attirbutes- data, link
   private int data;
   private Q_ListNodeCC link;
   
   //Constructor
   public Q_ListNodeCC(int d, Q_ListNodeCC l)
   {
      data = d;
      link = l;
   }
   
   //Empty list defined by declaring the front and rear null
   Q_ListNodeCC front = null; 
   Q_ListNodeCC rear = null;
   
   //TempPtr defined as the front so no matter what method it'll start at the front
   Q_ListNodeCC tempPtr = front;
   
   //This method adds to an empty list
   public void addToEmptyList(int data)
   {
      //(1)Check if empty by equaling the temp pointers link to the front
      if(tempPtr == front)
      {
      //(2)If empty add new node that is equal to the rear and linked to the front
       rear = new Q_ListNodeCC(data,front);
      }
      //(3) If the queue/CLL has an element in it then we go to an else statement saying the LL is full
      else 
         System.out.println("Circular linked list is full");
   }
   public void addToFrontExistingList(int data)
   {
      //(1)Check if front exist by checking if front isnt the same as the rear
      if(front != rear)
      {
         //(2)Add a new node and declare it the front
         front = new Q_ListNodeCC(data,front);
      }
      //(3)If front is the same as the rear then print out list is empty
      else
         System.out.println("Circular linked list is full");
  
   }
   //This method adds to the rear of the list
   public void addToTail(int data)
   {
      //(1)Check if list is empty by checking if the front is = to the rear
      //If not then it will go through the if statement
      if(front != rear)
      {
         //(2)Use a while loop to reach the rear of the list
         //
         while(tempPtr != rear)
         {
            //(3)Temp pointer equals its link to go to the next node
            tempPtr = tempPtr.link;
         }
         //(4)if at rear then add data to end and link it to front
         if(tempPtr.link==front)
         {
            //(5)create node and add it as rear
            rear = new Q_ListNodeCC(data,rear);
         }
      }
      //(6)If the front is equal to the rear then print out the list is empty
      else
         System.out.println("Circular list is empty");
   }
      //This method adds after the front node
       public void addAfter(int data)
       {
          //(1)Check if list is empty by checking if the tempPtr is not equal to rear
          if(tempPtr != rear)
          {
            //(2)Temp pointer equals its link to go to the next node
            tempPtr = tempPtr.link;
            //(3)Add a node to the link of the front node
            front.link = new Q_ListNodeCC(data,front.link.link);
          }
          //(4)If the list is empty print out "list empty" for user
          else
           System.out.println("Circular list is empty");
     }
     //This method adds before the front node
     public void addBefore(int data)
     {
        //(1)Check if list is empty by checking if the tempPtr is not equal to rear
        if(tempPtr != rear)
       {
         //(2)
         front = new Q_ListNodeCC(data,front);
      }
      //(3)If front is the same as the rear then print out list is empty
      else
         System.out.println("Circular linked list is full");
   }
   //This method searches for an element and prints if it's found
   public void searchList(int element)
   {
      //(1)Check if empty by checking if the temp pointer links to the head if not execute the if statement 
      if(tempPtr != rear.link)
      {
       //(2) Use a while loop that executes till it reaches the end of the list(which is rear.link that links back to the front)
      while(tempPtr != rear)
      {
         //(3) Use a if statement that checks if each value where the temp pointer is = to the element
         if(tempPtr.data == element)
         {
         //(4)If the element matches one of the data values then"Element found" will be printed to the user
            System.out.println("Element found");
         }
         //(5)If the element has not been found then we will execute the else statement that will go to next node
         else
            //(6)Temp pointer equals its link to go to the next node
            tempPtr = tempPtr.link;
      }
    }
    //(7) If the list is empty print out "list empty" for user
      else
         System.out.println("Circular linked list is empty");
   }
   //This method prints out all the nodes in the list
   public void printList()
   {
      //(1)Check if empty by checking if the temp pointer links to the head if not execute the if statement 
      if(tempPtr != rear.link)
      {
         //(2) Display that these are the nodes being printed by usng S.O.P
         System.out.println("The nodes are: ");
         //(3) Use a while loop that executes till it reaches the end of the list(which is rear.link that links back to the front)
         while(tempPtr != rear.link)
         {
           //(4)Print out the value where the temp Pointer is by printing tempPtr.data 
           System.out.println(tempPtr.data);
           //(5)Temp pointer equals its link to go to the next node
           tempPtr = tempPtr.link;
         }
      } 
      //(6) If the list is empty print out "list empty" for user
      else
         System.out.println("Circular linked list is empty");
   }
}