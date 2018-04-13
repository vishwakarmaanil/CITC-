package linkedList;

import java.util.*;

public class RemoveDups
{
	public static void main(String[] args)
	{
		LinkedListTest list = new LinkedListTest();
		list.add(15);
		list.add(12);
		list.add(1);
		list.add(15);
		list.add(12);
		list.display();
		// list.removeDups();
		// list.removeDups1();
		System.out.println("\n");
		list.ktonth(2);

	}
}
