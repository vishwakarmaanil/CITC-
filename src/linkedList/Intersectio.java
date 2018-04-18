package linkedList;

import linkedList.SumList.Node;

public class Intersectio
{
	public class Result
	{
		public Node tail;
		public int size;

		public Result(Node tail, int size)
		{
			this.tail = tail;
			this.size = size;
		}
	}

	public Result getTailandSize(Node node)
	{
		if(node == null)
			return null;
		
		int size = 0;
		while (node != null)
		{
			size++;
			node = node.next;
			
		}
		return new Result(node, size);
	}

	public Node findKth(Node node, int k)
	{
		Node temp = node;
		while ( k > 0 && temp != null) 
		{
			temp = temp.next;
			k--;
		}
		return temp;
	}

	public Node isIntersection(Node h1, Node h2)
	{
		if (h1 == null || h2 == null)
			return null;

		Result r1 = getTailandSize(h1);
		Result r2 = getTailandSize(h2);

		if(r1.tail != r2.tail)
			return null;
		
		Node longer = r1.size > r2.size ? h1 : h2;
		Node shorter = r1.size < r2.size ? h1 : h2;

		longer = findKth(longer, Math.abs(r1.size - r2.size));

		while (shorter != longer)
		{
			shorter = shorter.next;
			longer = longer.next;
		}
		return longer;
	}

	public static Node head1, head2;

	public static class Node
	{
		int data;
		Node next;

		public Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public void printList(Node head)
	{
		while (head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}

	public static void main(String[] args)
	{
		Intersectio list = new Intersectio();
		// creating first list
		list.head1 = new Node(3);
		list.head1.next = new Node(1);
		list.head1.next.next = new Node(5);
		list.head1.next.next.next = new Node(9);
		list.head1.next.next.next.next = new Node(7);
		list.head1.next.next.next.next.next = new Node(2);
		list.head1.next.next.next.next.next.next = new Node(1);
		System.out.print("First List is ");
		list.printList(head1);

		// creating seconnd list
		list.head2 = new Node(4);
		list.head2.next = new Node(6);
		list.head2.next.next = list.head1.next.next.next.next;
		System.out.print("Second List is ");
		list.printList(head2);
		int carry = 0;
		// add the two lists and see the result
		// Node rs = list.addTwoLists(head1, head2, carry);
		Node rs1 = list.isIntersection(head1, head2);
		// boolean rs1 = isPalindrome(head1);
		// boolean rs1 = isPalindromewithStack(head1);
		System.out.print("Resultant List is " + rs1.data);
		// list.printList(rs1);
	}
}
