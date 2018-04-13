package linkedList;

import java.util.*;

class LinkedListTest
{
	Node head = null;

	public void add(int data)
	{
		if (head == null)
		{
			head = new Node(data);
		} else
		{
			Node end = new Node(data);
			Node n = head;
			if (n != null)
			{
				while (n.next != null)
				{
					n = n.next;
				}
				n.next = end;
			}
		}
	}

	public void delete(int d)
	{

		if (head.data == d)
		{
			head = head.next;
		} else
		{
			Node n = head;
			while (n.next != null)
			{
				if (n.next.data == d)
				{
					n.next = n.next.next;
					return;
				}
				n = n.next;
			}
		}
	}

	public void display()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
	}
	
	public void removeDups()
	{
		
	}
}
