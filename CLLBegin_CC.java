public class CLLBegin_CC
{
   //Attributes
   private int data;
   private CLLBegin_CC link; 
   //Constructor
   public CLLBegin_CC(int d, CLLBegin_CC l)
   {
      data = d;
      link = l;
   }
   //Declare front and read
   CLLBegin_CC front = null;
   CLLBegin_CC rear = null;
   //Declare tempPtr
   CLLBegin_CC tempPtr = front;
   //Add to rear
   public void addToRear(int data)
   {
      //check if empty
      if(rear == null)
      {
         //add node 
         rear = new CLLBegin_CC(data,rear);
         //add front
         front = rear;
      }
      else //if not empty
      {
         //go to next node
         tempPtr = tempPtr.link;
         if(tempPtr == rear)
         {
            //add node
           tempPtr.link = new CLLBegin_CC(data,front);
           rear = tempPtr;
         }
      }
   }
   
   //Delete first node
   public void removeFront()
   {
      //check if empty
      if(rear != null)
      {
         //delete the front
         tempPtr = tempPtr.link;
         front = tempPtr;
      }
      else 
         System.out.println("List is empty.");
   }
   
   //Print nodes
   public void printNodes()
   {
      //check if empty
      if(front != null)
      {
       System.out.println("The nodes are: ");  
       while(tempPtr != rear.link)
       {
         System.out.println(tempPtr.data);
         //go to next node
         tempPtr = tempPtr.link;
       }
      }
      else
         System.out.println("List is empty");
   }
}