package linkedList;

import java.util.*;

public class RunAllMethods
{
	public static void main(String[] args)
	{
		LinkedListTest list = new LinkedListTest();
		LinkedListTest list1 = new LinkedListTest();
		list.add(7);
		list.add(1);
		list.add(6);
		list.display();
		list1.add(5);
		list1.add(9);
		list1.add(2);
		System.out.println();
		list1.display();
		
		// list.display();
		// list.removeDups();
		// list.removeDups1();
		// System.out.println("\n");
		// // list.ktonth(0);
		// list.deleteMidNode();
		// list.display();
		// // System.out.println("\n");
//		list.partition1(5);
	}
}
