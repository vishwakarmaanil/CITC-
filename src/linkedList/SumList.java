package linkedList;

class SumList
{
	static Node head1, head2;

	static class Node
	{

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/*
	 * Adds contents of two linked lists and return the head node of resultant list
	 */

	void printList(Node head)
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
		SumList list = new SumList();

		// creating first list
		list.head1 = new Node(7);
		list.head1.next = new Node(1);
		list.head1.next.next = new Node(6);
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
		Node rs = list.addTwoLists(head1, head2, carry);
		System.out.print("Resultant List is ");
		list.printList(rs);
	}

	private Node addTwoLists(Node head1, Node head2, int carry)
	{
		if (head1 == null && head2 == null && carry == 0)
			return null;
		
		int value = carry;
		if (head1 != null)
			value += head1.data;

		if (head2 != null)
			value += head2.data;

		Node result = new Node(value % 10);

		if (head1 != null || head2 != null)
		{
			Node more = addTwoLists(head1 == null ? null : head1.next, head2 == null ? null : head2.next, value > 10 ? 1 : 0);
			result.next = more;
		}
		return result;
	}
}
