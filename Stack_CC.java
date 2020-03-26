//Christian Crawford
public class Stack_CC
{
   //Attributes
   int size = 10;
   int[] myStack = new int[size];
   int top;
   int[] tempStack = new int[size];
   int tempTop;
   //storeStack() 
   public class storeStack()
   {
      for(int i=top-1; i< size; i++)
      {
         myStack[i] = i;
      }
   }
   //addToStack()
   public void addToStack(int x)
   {
      //Check if full
      if(top != size)
      {
         myStack[top+1] = x;
      }
      else
         System.out.println("Stack full");   
   }
   //printOrder() will print order that was added last
   public void printOrder()
   {  
      //Check if stack isempty
      if(top != 0)
      {
         for(int i=top-1; i>0; i--)
         {
            //Print
            System.out.println(myStack[i]);
            //Store into temporary stack
            tempStack[temptop]=myStack[i];
            //Increment tempTop
            tempTop++;
         }
      }
      else
         System.out.println("Stack empty");
   }
   //printReverse() will print order of first added to stack to last
   public void printReverse()
   {
      //Check if empty
      if(top != 0)
      {
         //Store elements in order 
         for(int i=top-1; i>0;i--)
         {
            //Store top element into temporary stack
            tempStack[temptop]=myStack[i];
            //Increment tempTop 
            tempTop++ 
         } 
         //Print out elements 
         for(int i=tempTop-1; i>0; i--)
         {
            //Print element
            System.out.println(tempStack);
            //Store tempTop element into original stack 
            myStack[top] = tempStack[i];
            //Increment top
            top++;
         }
      }
      else
         System.out.println("Stack empty");
   }
}