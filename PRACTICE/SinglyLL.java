package com.PRACTICE;

class Node
{
	int data;
	public Node next;
	
	public Node(int no)
	{
		this.data = no;
		this.next = null;
	}
}
//--------------------------------------------//

class SingleLL
{
	public Node first;
	public int iCount;
	
	public SingleLL()
	{
		this.first = null;
		this.iCount =0;
	}
	//--------------------------------------------//

	public void Display()
	{
		System.out.println("Elements of linked list are ");
		Node temp = first;
		
		while(temp!= null)
		{
			System.out.print("|"+temp.data+"|->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	//--------------------------------------------//
	public int Count()
	{
		return this.iCount;
	}
	
	//--------------------------------------------//

	public void InsertFirst(int no)
	{
		Node newn  = new Node(no);
		
		if(first == null)
		{
			first = newn;
		}
		else
		{
			newn.next = first;
			first = newn;
		}
		iCount++;
	}
	//--------------------------------------------//
	

	public void InsertLast(int no)
	{
		Node newn = new Node(no);
		
			if(first == null)
			{
				first = newn;
			}
			else
			{
				Node temp = first;
				
				while(temp !=null)
				{
					temp = temp.next;
				}
				temp.next = newn;
				
			}
		
		iCount++;
	}
	
}




public class SinglyLL 
{

	public static void main(String[] args) 
	{
		SingleLL sobj = new SingleLL();
			sobj.InsertFirst(23);
			sobj.InsertFirst(45);
			
			sobj.InsertLast(40);
			sobj.InsertLast(50);
			
			sobj.Display();
			System.out.println("Number of elements are "+sobj.Count());
	}

}
