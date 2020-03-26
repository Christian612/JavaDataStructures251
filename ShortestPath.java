/*
 *  Dijkstra's Shortest-Path Algorithm
 */

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class ShortestPath
{
   /*
    * Find the index of a vertex 
    */
 	public static int IndexOf(String array[], String s)
	{
		for (int i = 0; i < array.length; i++)
			if (s.equals(array[i]))
				return i;
		return -1;	
	}
			  
   /*
    * Dijkstra's Shortest-Path Algorithm
    */
	public static void main(String[] args) throws IOException
   {
		String input;
		
		// Variables for inputing the graph
		String[] from = new String[100];
		String[] to = new String[100];
		int[] distance = new int[100];

		int numberOfUndirectedEdges;

		// Miscelleanous variables
		int i;
		int j;

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);

      // Get the filename
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();
		System.out.println(" ");

      // Make sure the file exists
      File file = new File(filename);
		if (!file.exists())
		{
			System.out.println("File " + filename + " does not exist");
			System.exit(0);
		}
		
		// Open the file
      Scanner inputFile = new Scanner(file);

      // Set the number of Undirected Edges to 0
		numberOfUndirectedEdges = 0;
 
 		// Print a heading for the graph edges
		System.out.println("The edges of the graph\n");
		
      // Process the graph file    
		while (inputFile.hasNext())
      {
         // Read a line from the graph file
         input = inputFile.nextLine();

			// Create a Tokenizer object 
			StringTokenizer st = new StringTokenizer(input);
			
			// From and To direction
			from[numberOfUndirectedEdges] = st.nextToken();
			to[numberOfUndirectedEdges] = st.nextToken();
			distance[numberOfUndirectedEdges] = Integer.valueOf(st.nextToken());
			
			// Print the edge
			System.out.println(from[numberOfUndirectedEdges] + " " + to[numberOfUndirectedEdges] + " " + distance[numberOfUndirectedEdges]);
			
			// To and From direction
			from[numberOfUndirectedEdges+1] = to[numberOfUndirectedEdges];
			to[numberOfUndirectedEdges+1] = from[numberOfUndirectedEdges];
			distance[numberOfUndirectedEdges+1] = distance[numberOfUndirectedEdges];
				
			numberOfUndirectedEdges += 2;
      }

	   // Close the file
      inputFile.close();
		System.out.println(" ");

      // Get the starting vertex
      System.out.print("Enter the starting vertex: ");
      String start = keyboard.nextLine();

      // Get the ending vertex
      System.out.print("Enter the ending vertex: ");
      String end = keyboard.nextLine();
		System.out.println(" ");
      
	   // Variables for vertices in the graph
	   String[] vertex = new String[100];
	   String[] path = new String[100];
   	int[] value = new int[100];
   	boolean[] circled = new boolean[100];

   	int numberOfVertices = 0;
   	final int INFINITY = 1000;

		// **************************************************************************
      for(i = 0; i < numberOfUndirectedEdges; i++){
         boolean exists = false;  
       
         for(j = 0; j < numberOfVertices; j++){
            if(from[i].equals(vertex[j]))
                  exists = true;
         }
      
         if(!exists){
         vertex[numberOfVertices++] = from[i];
         }
    }
       
          for(i = 0; i < numberOfVertices; i++){
            value[i] = INFINITY; 
            path[i] = "("; 
        
        }
        
        circled[i] = false;
        
        value[IndexOf(vertex,start)] = 0;
        
        while(!circled[IndexOf(vertex, end)]){
        int indexOfMinimum = IndexOf(vertex,end);
         for(i = 0; i < numberOfVertices; i++){
            if(!circled[i] && (value[i] < value[indexOfMinimum])){
               indexOfMinimum = i;
            } 
         }      
       circled[indexOfMinimum] = true;
       
       for(i = 0; i < numberOfUndirectedEdges; i++){
         if(vertex[indexOfMinimum].equals(from[i])){
            if(!circled[IndexOf(vertex, to[i])] && ((value[indexOfMinimum] + distance[i])) < value[IndexOf(vertex, to[i])]){
               path[IndexOf(vertex, to[i])] = path[indexOfMinimum] + vertex[indexOfMinimum] + ", ";              
            } 
           value[IndexOf(vertex,to[i])] = Math.min(value[IndexOf(vertex, to[i])], value[indexOfMinimum] + distance[i]);       
         }
       }      
 }
     path[IndexOf(vertex, end)]  = path[IndexOf(vertex, end)] + vertex[IndexOf(vertex, end)] + ")";
     
     System.out.println(value[IndexOf(vertex, end)] + "  ");
     System.out.println(path[IndexOf(vertex, end)]);
         }//end
     }//end      