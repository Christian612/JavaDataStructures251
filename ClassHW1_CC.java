//Christian Crawford
//Data Structures 
//Array Properties:
//1. Array has a fixed size
//2. Array is a continguous block of memory
//3. Array is a linear collection
//4. Array can only define one data type at a time

public class ClassHW1_CC
{
   //Define array
   int size = 8;
   int[] myArray = new int[size];
   
   //Attributes
   int count;
   int occuranceNum = 0;
   int sum = 0;
   double avg = 0.0;
   
   //Store method of elements less than 30 and odd
   public void storeArray()
   {
      for(int i=0; i<count;i++)
      {
        if(myArray[i] < 30 && myArray[i]%2==1) 
        {
            //Add element to array
            myArray[i] = i;  
        }
      }
   }
   //Add and element 
   public void addElement(int num)
   {
      //check if empty
      if(count != size)
      {
         do
         {
            //
            if(myArray[count]%2 != 0 && num < 30)
            {
               //Add x to array at count index
               myArray[count]=num;
               //Increment count
               count++;
            }
            else
               System.out.println("Number is not odd and is not less than 30");
         }while( count < 3);
      }
      else
         System.out.println("Array is full");  
   }
   //Print out all numbers between 1-20
   public void printArray()
   {
      System.out.println("this ran");
     //  for(int i=0; i<count; i++)
//       { System.out.println("this ran");
         if(myArray[i] >= 1 && myArray[i] <= 20)
         {
            //myArray[i] += 5;   
            System.out.println("The value at index " + i + " is " + myArray[i]);
         }
      }
   }
   //Method to calculate and print out sum of array elements
   public void arraySum()
   {
      for(int i = 0; i <count; i++)
      {
         sum += myArray[i];
      }
      System.out.println("The sum of thje array is " + sum);
   }
   
   //Method to calculate and print out average of array elements
   public void arrayAvg()
   {
      for(int i = 0; i <count; i++)
      {
         sum += myArray[i];
      }
      System.out.println("The sum of thje array is " + avg);
   }
   
   //Method to search and replace
   public void searchReplace(int key, int num)
   {
      //Check if empty
      if(count != size)
      {
         for(int i = 0; i < count; i++)
         {
            if(myArray[i] == key)
               //Replace 
               myArray[i] = num;
         }
      }
   }
   //Method to deterrmine number of occurance
   public void numMultiple(int num)
   {
      for(int i=0; i< count; i++)
      {
         if(myArray[i] == num)
            occuranceNum++;
      }
      System.out.println("The occurance of "+ num + " is "+ occuranceNum);
   }
   
   //Search and delete 1#
   public void searchDelete()
   {
      if(count == 0)
      {
         System.out.println("List empty");
      }
      for(int i=0; i< count; i++)
      {
         int x = 9;
         if(myArray[i] == x)
         {
            for(int j=i;j<count;j++)
            {
               myArray[j] =j+1;
            }
            count--;
         }
         else
            System.out.println("Not found");
      }
   }  
   //Search and delete 2#
   public void searchDelete2(int key)
   {
      //check if empty
      if(count != 0)
      {
         //Go through array
         for(int i=0; i< size; i++)
         {
            if(myArray[i]==key)
            {
               count--;
               for(int j=i; j<count;j--)
               {
                  myArray[j] = myArray[j+1];
               }
            }
            else
               count++;  
         }
      }
      else  
         System.out.println("Array empty");
   }
   
   //Search and delete 3#
   public void searchNdelete(int x)
   {
      boolean found = false;
      int indexOf = 0;
      
      if(count == 0)
      {
         System.out.println("Array Empty");
      }
      else
      {
         for(int i=0; i <count;i++)
         {
            if(myArray[i] == x)
            {
               indexOf = i;
               found = true;
            }
         } 
     }
     if(found == false)
     {
      System.out.println("Not found");
     } 
     else if(found == true)
     {
      for(int i=indexOf; i< (count-1); i++)
      {
         myArray[i] = myArray[i+1];
      }
      count--;
     }
   }
}