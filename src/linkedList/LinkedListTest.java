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
		Node temp1 = head;
		Node temp2 = head;
		for (int i = 0; i < k; i++)
		{
			if (temp1 == null)
				return;
			temp1 = temp1.next;
		}
		while (temp1 != null)
		{
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		System.out.println(temp2.data + "  ");
	}

	public void deleteMidNode()
	{
		Node temp = head;
		int length = 0;
		if (head == null)
			return;
		while (temp.next != null)
		{
			length++;
			temp = temp.next;
		}
		temp = head;
		for (int i = 0; i < (length / 2); i++)
		{
			temp = temp.next;
		}

		Node mid = temp;
		Node newNode = mid.next;
		mid.data = newNode.data;
		mid.next = newNode.next;
	}

	public void partition(int x)
	{
		Node beforeStart = null;
		Node afterStart = null;
		Node beforeEnd = null;
		Node afterEnd = null;
		Node temp = head;
		while (temp != null)
		{

			if (temp.data < x)
			{
				if (beforeStart == null)
				{
					beforeStart = temp;
					beforeEnd = beforeStart;
				} else
				{
					beforeEnd.next = temp;
					beforeEnd = temp;
				}
			} else
			{
				if (afterStart == null)
				{
					afterStart = temp;
					afterEnd = afterStart;
				} else
				{
					afterEnd.next = temp;
					afterEnd = temp;
				}
			}
			temp = temp.next;
		}
		if (beforeEnd != null)
			beforeEnd.next = afterStart;

		while (beforeStart != null)
		{
			System.out.print(beforeStart.data + " ");
			beforeStart = beforeStart.next;
		}

	}

	public void partition1(int x)
	{
		Node temp = head;
		Node newNode1 = head;
		Node newNode2 = head;

		while (temp != null)
		{
			if (temp.data < x)
			{
				temp.next = newNode1;
				newNode1 = temp;

			} else
			{
				newNode2.next = temp;
				newNode2 = temp;
			}
			temp = temp.next;
			System.out.println(temp.data + " ");
		}

	}
}
