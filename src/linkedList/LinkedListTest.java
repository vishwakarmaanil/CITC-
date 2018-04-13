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
		HashSet<Integer> h = new HashSet<>();
		Node temp = head;
		while (temp != null)
		{
			if (h.contains(temp.data))
			{
				temp = temp.next;
			}
			h.add(temp.data);
			temp = temp.next;
		}
		System.out.println(h);
	}

	public void removeDups1()
	{
		Node temp = head;

		while (temp != null)
		{
			Node runner = temp;
			while (runner.next != null)
			{
				if (runner.next.data == temp.data)
				{
					runner.next = runner.next.next;
				}
				runner = runner.next;
			}
			temp = temp.next;
		}
	}

	public void ktonth(int k)
	{
		Node temp = head;
		int length = 0;
		while (temp.next != null)
		{
			length++;
			temp = temp.next;
		}

		int count = length;
		temp = head;
		while (temp != null)
		{
			if (count < (length - k))
			{
				System.out.print(temp.data + "  ");
			}
			count--;
			temp = temp.next;
		}

	}
}
