package linkedList;

import linkedList.SumList.Node;

public class Intersectio
{

	public int isIntersection(Node h1, Node h2)
	{
		return 0;
	}

	public static Node head1, head2;

	public static class Node
	{

		int data;
		Node next;

		Node(int d)
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
		Node head1 = null;
		Node head2 = null;
		// creating first list
		list.head1 = new Node(7);
		list.head1.next = new Node(1);
		list.head1.next.next = new Node(2);
		list.head1.next.next.next = new Node(1);
		list.head1.next.next.next.next = new Node(7);
		System.out.print("First List is ");
		list.printList(head1);

		// creating seconnd list
		list.head2 = new Node(5);
		list.head2.next = new Node(9);
		list.head2.next.next = new Node(2);
		System.out.print("Second List is ");
		list.printList(head2);
		int carry = 0;
		// add the two lists and see the result
		// Node rs = list.addTwoLists(head1, head2, carry);
		int rs1 = list.isIntersection(head1, head2);
		// boolean rs1 = isPalindrome(head1);
		// boolean rs1 = isPalindromewithStack(head1);
		System.out.print("Resultant List is " + rs1);
		// list.printList(rs1);
	}
}
