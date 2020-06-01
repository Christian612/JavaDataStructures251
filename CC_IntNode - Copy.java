//Christian Crawford
public class CC_IntNode
{
   //Attributes
   private int data;
   private CC_IntNode link;
   //Empty list
   private CC_IntNode head;
   private CC_IntNode tptr;
   private CC_IntNode previous;
   //Constructor
   public CC_IntNode(int d, CC_IntNode l)
   {
      data = d;
      link = l;
   }
   //myList
   public CC_IntNode() 
   {
      head = null;
   }
   
   //Add first node to empty list
   public void addFirstNode()
   {
      //Check if empty
      if(head == null)
         head = new CC_IntNode(1, null);
   }
   
   //Add second node to list
   public void addSecondNode()
   {
      //Check if empty
      if(head != null)
      {
         //Add node
         head.link = new CC_IntNode(2,null);
      }
      else
         System.out.println("Linked List empty");
   }
   
   //Add to the end of the list
    public void addTail()
   {
      //Check if empty
      if(tptr != null)
      {
         //Go through list
         while(tptr.link != null)
         {
            //Increment
            tptr = tptr.link;
         }                                                              
         //Add tail
         tptr.link = new CC_IntNode(3, null);
      }
      else
         System.out.println("Linked list empty"); 
    }

   //Add in the middle of list
   public void middleNodeAfter(int x, int y)
   {
      //Check if empty
      if(tptr != null)
      {
         //If only one node 
         if(head.link == null)
            head.link = new CC_IntNode(x,null);
         else
         {
            while(tptr.data != x)
            {
               //Increment tptr
               tptr = tptr.link;
            }
            while(previous.link != tptr)
            {
               //Increment 
               tptr = tptr.link;
            }
            //Add node
            previous = new CC_IntNode(y, previous.link);
         }
      }
      else
         System.out.println("List is empty");
   }
   
   //Remove a node front the front of the list 
   public void removeFront()
   {
      //Check if 
      if(tptr != null)
      {
         //Remove head
         head = head.link;                                                              
      }
      else
         System.out.println("Linked list empty");
   }
   
   //Remove the last node
   public void removeTail()
   {
      //Check if empty
      if(tptr != null)
      {
         //Go through list
         while(tptr.link != null)
         {
            //Increment
            tptr = tptr.link;
         }                                                              
         //Remove tail
         tptr.link = null;
      }
      else
         System.out.println("Linked list empty"); 
    }
     
     //Remove from middle of list
     public void removeMiddle(int x)
     {
      //Check if 
      if(tptr != null)
      {
         //Remove middle
          while(tptr.data != x)
          {
            //Increment tptr
            tptr = tptr = tptr.link;
          }                                                             
      }
      else
         System.out.println("Linked list empty");
     }
         
     //Print out every node in the list
     public void printNode()
     {
       if(head != null)
       {
         while(tptr != null)
         {
            System.out.println("The element is " + tptr.data);
            //Increment
            tptr = tptr.link;
         }                                                              
      }
      else 
         System.out.println("Linked List empty");
     }  
}