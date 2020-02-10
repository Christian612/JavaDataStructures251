Public class int_NodeCC
{
	Private int data;
	Private int link;
	//Constructor 
	Public int_NodeCC(int d, int l)
	{
		data = d;
		link = l;
	}
	//Defining empty list
	int_NodeCC head = null;
	int_NodeCC tempHead = head;
	
	public void addToEmptyyList(data)
	{
      (a)	Create a new node
      (b)	Add the data to the node and declare link as null because method is only adding one element to data
	}
	public void addToFrontExistingList(data)
	{
      (a)	Create a new node
      (b)	Add the data to the new node and set the link to the head
	}
	public void addToTail(data)
   {
      (a)	Create a new node
      (b)	Initialize node with data parameter
      (c)	Set link to null because it’s going to be last element
      (d)	Go through list till tempHead is = to null
	}
	public void addAfter(data)
	{
      (a)
	}
	public addBefore(data)
	{
		(a)
	}
	public searchList(element)
	{
      (a)
	}
	public void printList()
	{
      (a)
	}
}

