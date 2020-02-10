public class Int_NodeCCC
{

   //Attributes
   private int data;
   Int_NodeCCC link;
   
    //Constructor
   public Int_NodeCCC(int d, Int_NodeCCC l)
   {
      data = d;
      link = l;
   }
   
   //create empty linked list
   Int_NodeCCC head = null;
   Int_NodeCCC temphead = head;
   
   //Insert to empty
   public void insertEmpty(int item)
   {
      if(temphead == null)
      {
            temphead = new Int_NodeCCC(item, null);  
      }
      else
         System.out.println("Shit full g"); 
   }
   
   
   
   
   //AddToEnd method
   public void addToEnd(int item)
   {  if(temphead == null) {
         System.out.println("It's empty");
      }else{
         while(temphead.link != null){
            //increment
            temphead = temphead.link;
         }
       }
       if(temphead.link == null)
         {
            temphead.link = new Int_NodeCCC(item, null);  
         }
    }  
   //Print linked list
   public void printList()
   {
      //Check if linked list is empty
      if(temphead.link != null)
      {
         //Til we get to the end of the list then the loop will end
         while(temphead.link !=null)
         {
            //Printing out the value at set position
            System.out.println(temphead.data);
            //Taking the temphead to the next node
            temphead = temphead.link;
         }
      }
      else
         System.out.println("List is empty");
   }
   //Delet
   
}