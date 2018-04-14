package linkedList;

import java.util.*;

public class RemoveDups
{
	public static void main(String[] args)
	{
		LinkedListTest list = new LinkedListTest();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.display();
		// list.removeDups();
		// list.removeDups1();
		System.out.println("\n");
//		list.ktonth(0);
		list.deleteMidNode();
		list.display();
	}
}
