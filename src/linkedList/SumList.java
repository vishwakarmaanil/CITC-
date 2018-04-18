package linkedList;

import java.util.Stack;

import linkedList.Intersectio.Result;
import linkedList.SumList.Node;

class SumList
{
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
		SumList list = new SumList();

		// creating first list
		list.head1 = new Node(7);
		list.head1.next = new Node(1);
		list.head1.next.next = new Node(2);
		list.head1.next.next.next = new Node(1);
		list.head1.next.next.next.next = new Node(7);
		System.out.print("First List is ");
		list.printList(head1);

		// creating seconnd list
		// list.head2 = new Node(5);
		// list.head2.next = new Node(9);
		// list.head2.next.next = new Node(2);
		// System.out.print("Second List is ");
		// list.printList(head2);
		// int carry = 0;
		// add the two lists and see the result
		// Node rs = list.addTwoLists(head1, head2, carry);
		// Node rs1 = list.addTwoLists2(head1, head2);
		// boolean rs1 = isPalindrome(head1);
		boolean rs1 = isPalindromewithStack(head1);
		System.out.print("Resultant List is " + rs1);
		// list.printList(rs1);
	}

	private static boolean isPalindrome(Node node)
	{
		Node temp = null;
		Node temp2 = node;
		while (node != null)
		{
			Node newNode = new Node(node.data);
			newNode.next = temp;
			temp = newNode;
			node = node.next;
		}

		while (temp != null && temp2 != null)
		{

			if (temp.data != temp2.data)
			{
				return false;
			}
			temp = temp.next;
			temp2 = temp2.next;
		}
		return true;
	}

	private static boolean isPalindromewithStack(Node node)
	{
		Node temp = node;
		Stack<Integer> stack = new Stack<Integer>();

		while (node != null)
		{
			stack.push(node.data);
			node = node.next;
		}

		while (temp != null)
		{
			if (stack.peek() != temp.data)
			{
				return false;
			}
			stack.pop();
			temp = temp.next;
		}

		return true;
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
		int size = 0;
		while (node != null)
		{
			node = node.next;
			size++;
		}
		return new Result(node, size);
	}

	public Node findKth(Node node, int k)
	{
		while (node != null && k > 0)
		{
			node = node.next;
			k--;
		}
		return node;
	}

	public int isIntersection(Node h1, Node h2)
	{
		if (h1 == null || h2 == null)
			return 0;

		Result r1 = getTailandSize(h1);
		Result r2 = getTailandSize(h2);

		Node longer = r1.size > r2.size ? h1 : h2;
		Node shorter = r2.size > r1.size ? h2 : h1;

		longer = findKth(longer, Math.abs(r1.size - r2.size));

		while (shorter != longer)
		{
			shorter = shorter.next;
			longer = longer.next;
		}
		return longer.data;
	}
	
	
	Node addTwoLists2(Node first, Node second)
	{
		Node res = null; // res is head node of the resultant list
		Node prev = null;
		Node temp = null;
		int carry = 0, sum;

		while (first != null || second != null) // while both lists exist
		{
			// Calculate value of next digit in resultant list.
			// The next digit is sum of following things
			// (i) Carry
			// (ii) Next digit of first list (if there is a next digit)
			// (ii) Next digit of second list (if there is a next digit)
			sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);

			// update carry for next calulation
			carry = (sum >= 10) ? 1 : 0;

			// update sum if it is greater than 10
			sum = sum % 10;

			// Create a new node with sum as data
			temp = new Node(sum);

			// if this is the first node then set it as head of
			// the resultant list
			if (res == null)
			{
				res = temp;
			} else // If this is not the first node then connect it to the rest.
			{
				prev.next = temp;
			}

			// Set prev for next insertion
			prev = temp;

			// Move first and second pointers to next nodes
			if (first != null)
			{
				first = first.next;
			}
			if (second != null)
			{
				second = second.next;
			}
		}

		if (carry > 0)
		{
			temp.next = new Node(carry);
		}

		// return head of the resultant list
		return res;
	}
}