class Node
{
	Node next = null;
	int data;

	Node(int data)
	{
		this.data = data;
	}

	void add(int data)
	{
		Node end = new Node(data);
		Node newNode = this;
		while (newNode.next != null)
		{
			newNode = newNode.next;
		}
		newNode = end;
	}

	Node delete(Node head, int data)
	{
		Node n = head;
		if (n.data == data)
		{
			return head.next;
		}
		while (n.next != null)
		{
			if (n.next.data == data)
			{
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
}

public class myList
{
	Node n = new Node(14);
 
}
