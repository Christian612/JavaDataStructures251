//Christian Crawford
public class CrawfordCClassLL
{
   //Attirbutes
   private int data;
   private CrawfordCClassLL link;
   
   //Constructor
   public CrawfordCClassLL(int d, CrawfordCClassLL l)
   {
      data = d;
      link = l;
   }
   public CrawfordCClassLL()
   {
      head = null;
      tail = null;
   }
   
   //Empty list
   private CrawfordCClassLL head;
   private CrawfordCClassLL tail = head; 
   
   //Add to the empty queue
   public void Q_addToEmptyCC(int ele)
   {
     if(Q_IsEmpty() == true) 
      head = new CrawfordCClassLL(ele, null);
   }
   
   //Add to the rear of queue
   public void Q_addToRearCC(int ele)
   {
      if(Q_IsEmpty() == true)
      {
         tail = new CrawfordCClassLL(ele,null);
      }
      else
      {
         while(tail.link != null)
         {
            //Increment 
            tail = tail.link;
         }
         if(tail.link == null)
            tail = new CrawfordCClassLL(ele, null);
      }      
   }
   
   //Remove the front element of queue
   public boolean Q_RemoveFrontCC(int ele)
   {
      boolean isFound = false;
      //Check if empty
      if(Q_IsEmpty() == false)
      {
         head = head.link;
         isFound = true;
      }
      else
      {
         System.out.println("Queue already empty");
      }
      return isFound;
   }
   
   //Search through a queue 
   public boolean Q_SearchCC(int ele)
   {
      boolean isFound = false;
      if(Q_IsEmpty() != true)
      {
         //Go through queue
         while(tail.link != null)
         {
            if(tail.data == ele)
            {
               //Add ele
               
               isFound = true;
               //Increment
               tail = tail.link;
            }   
            else
               tail = tail.link;
         }
      }
      else
      {
         System.out.println("Queue already empty");
      }
      return isFound;
   }

   //Find the largest element in the queue
   public int Q_FindLargest()
   {
       //Assign largest
       int largest = tail.data;

      if(Q_IsEmpty() != true)
      {
         //Go through queue
         while(tail.link != null)
         {
            if(largest < tail.data)
            {
               largest = tail.data;
               //Increment
               tail = tail.link;
            }
            else
               //Increment
               tail = tail.link;
         }
      }
      else
      {
         System.out.println("Queue empty");
      }
      return largest;
   }

   //Print the odd numbers in a queue
   public void Q_PrintOdd()
   {
      //Check if empty
      if(Q_IsEmpty() != true)
      {
         //Go through queue to print out odd
         while(tail.link != null)
         {
            if(tail.data %2==-0)
            {
               //Print odd
               System.out.println(tail.data);
               //Increment
               tail = tail.link;
            }
            else
               //Increment
               tail = tail.link;
         }
      }
      else
         System.out.println("Queue is empty");
   
   }
   
   //Returns the number found eben if it is 0
   public int Q_NumOccur(int ele)
   {
      int numOccur = 0;

      if(Q_IsEmpty() != true)
      {         
         //Go through queue
         while(tail.link != null)
         {
            if(tail.data == ele)
            {
               numOccur++;
               //Increment
               tail = tail.link;
            }
            else
               //Increment
               tail = tail.link;   
         } 
      }
      else
      {
         System.out.println("Queue already empty");
      }
      return numOccur;
   }
   
   //Remove the element
   public boolean Q_FindRemove(int ele)
   {
      boolean isFound = false;
      //Check if empty
      if(Q_IsEmpty() == false)
      {
         //Go through queue
         while(tail.link != null)
         {
            //Check for element
            if(tail.link.data == ele)
            {
               isFound = true;
               //Remove
               tail.link = tail.link.link;
               //Increment
               tail = tail.link;
            }
            else
               //Increment
               tail = tail.link;   
         }
      } 
      else
         System.out.println("Queue empty");
      
      return isFound;
   }
   
   //Check if queue is empty
   public boolean Q_IsEmpty()
   {
      if(tail == null)
         return true;
      else
         return false;
   }
   
   //Print out the elements in a queue
   public void Q_Print()
   {
      //Check if queue is empty
      if(Q_IsEmpty() != true)
      {
         //Go through queue
         while(tail.link != null)
         {
            //Print
            System.out.println(tail.data);
            //Increment
            tail = tail.link;
         }
         System.out.println(tail.data);
         System.out.println(" ");
      }
      else
         System.out.println("Queue empty");
   }
}