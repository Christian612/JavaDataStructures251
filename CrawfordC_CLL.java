//Christian Crawford
public class CrawfordC_CLL
{
   //Attributes
   private int data;
   private CrawfordC_CLL link;
   
   //Create empty list
   private CrawfordC_CLL head;
   private CrawfordC_CLL end;
   private CrawfordC_CLL tptr = head;
   
   //Define head and end
   public CrawfordC_CLL()
   {
      head = null;
      end = null;
   }
   
   //Constructor
   public CrawfordC_CLL(int d, CrawfordC_CLL l)
   {
      data = d;
      link = l;
   }
   
   //Add to empty list
   public void addEmptyCLL(int data)
   {
      if(head == null)
      {
         //Create node then add to list
         head = new CrawfordC_CLL(data,end); //should've been (data,head)
         head.link = head; //not needed
      }
   }
   
   //Add to the end of the list
   public void addToEndCLL(int data)
   {
      if(end != null) //tptr or head
      {
         if(tptr.link == head)  
         {                       //should've been 2 conditions if and a else with a while
             end = tptr.link;   //if head.link = head then add element at head.link
                                //else while loop till end of list then add using tptr 
             end = new CrawfordC_CLL(data, end);
         }
      }
      else
         System.out.println("Circular Linked List empty");
   }
   
   //Add anywhere in the list
   public void addAnywhereCLL(int data)
   {
      if(head != null)
      {
         while(tptr.link != head)
         {
            if(tptr.data == data)
            {
               tptr.link = new CrawfordC_CLL(2, tptr.link);
               //Increment
               tptr = tptr.link;
            }
            else
               tptr = tptr.link;
         }
      }
      else
         System.out.println("Circular Linked List empty");
   }
   
   //Delete the end of list
   public void deleteEndCLL()
   {
      if(head != null)
      {
         while(tptr.link.link != head)
         {
            //Increment
            tptr = tptr.link;
         }
         //Delete previous node link to null
         tptr.link = null; //tptr.link.link
      }
      else
         System.out.println("Circular Linked List empty");
   }
    
   //Delete front of the list
   public void deleteFrontCLL()
   {
    if(head != null)
      {
        //
        head = head.link; 
        end.link = head;
      }
      else
         System.out.println("Circular Linked List empty"); 
   }
   
   //Delete from anywhere in list
   public void deleteAnywhereCLL(int data)
   {
       if(head != null)
      {
         while(tptr.link != head)
         {
            if(tptr.link.data == data)
            {
               tptr.link = tptr.link.link;
            }
            else
               tptr = tptr.link;
         }
      }
      else
         System.out.println("Circular Linked List empty");
   }
   //Print out the elements in a list
   public void printCLL()
   {
      if(head != null)
      {
         //Go through loop
         while(tptr.link != head)
         {
            //Print out element at node
            System.out.println(tptr.data);
         }
      }
      else
         System.out.println("Circular Linked List empty");
   }
}