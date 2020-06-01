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

   
