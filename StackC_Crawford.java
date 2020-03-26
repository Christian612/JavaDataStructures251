public class StackC_Crawford
{
   //define array structureofsize10
   int size=10;
   int[] arrayStack=new int[size];
   int top;
   
   //Temporary stack
   int[] tempStack = new int[size];
   int tempTop;
   
   //Even stack
   int[] evenStack = new int[size];
   int topEven;
   
   //Odd stack
   int[] oddStack = new int[size];
   int topOdd;
   
   public void storeStack()
   {
      for(int i=top-1;i>0;i--)
      {
         arrayStack[i] = i;
      }
   }
   
   //Print out stack elements
   public void prinStack()
   {
      for(int i=top-1; i> 0; i--)
      {
         System.out.println(arrayStack[i]);
      }
   }
   
   //Move all the EVEN elements to stackEven
   //Move all the ODD elements to stackOdd
   public void oddEvenStack()
   {
      //check if empty
      if(top != 0)
      {
         //go through arraystack
         for(int i=top-1;i>0;i--)
         {
            if(arrayStack[i] %2==0)
            {
               evenStack[topEven] = arrayStack[i];
               //Increment even top
               topEven++;
            }
            else
            {
               oddStack[topOdd] = arrayStack[i];
               //Increment odd top
               topOdd++;
            }
         }
      }
      else
         System.out.println("Stack empty");
   }
   
   //Find the largest even 
   //Find thelargest odd
   public void findEvenOdd()
   {
      if(topEven !=0 && topOdd != 0)
      {
         //assign largest to top
         int largestOdd = oddStack[topOdd];
         int largestEven = evenStack[topEven];
         
         //go through odd stack for largest element
         for(int i= topOdd-1; i>0;i--)
         {
            if(oddStack[i] > largest)
            {
               //assign as new largest
               largest = oddStack[i];
               //move to temporary stack
               tempStack[tempTop] = oddStack[i];
               //increment
               tempTop++;
            }
            else
              //move to temporary stack
               tempStack[tempTop] = oddStack[i];
               //increment
               tempTop++;
         }
         //print out largest
         System.out.println("The largest odd element is " + largestOdd);
         
         //move odds back to oddStack
         for(int i=tempTop-1;i>0;i--)
         {
            //move to temporary stack
               tempStack[tempTop] = evenStack[i];
               //increment
               topOdd++;
         }

         //go through even stack for largest element
         for(int i= topEven-1; i>0;i--)
         {
            if(evenStack[i] > largest)
            {
               //assign as new largest
               largest = largestEven[topEven];
               //move to temporary stack
               tempStack[tempTop] = evenStack[i];
               //increment
               tempTop++;
            }
            else
            {
              //move to temporary stack
               tempStack[tempTop] = oddStack[i];
               //increment
               tempTop++;
            }
         }

      }
         System.out.println("Even/odd stack empty");
   }
}