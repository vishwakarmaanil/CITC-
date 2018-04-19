package stack;

import java.util.Stack;

public class StackMin extends Stack<Integer>
{
	Stack<Integer> s2;

	public StackMin()
	{
		s2 = new Stack<Integer>();
	}

	int min()
	{
		if (s2.isEmpty())
		{
			return Integer.MAX_VALUE;
		} else
			return s2.peek();
	}

	void push(int value)
	{
		if (value <= min())
		{
			s2.push(value);
		}
		super.push(value);
	}

	public Integer pop()
	{
		int value = super.pop();
		if (value == min())
		{
			s2.pop();
		}
		return value;
	}

	public static void main(String args[])
	{
		StackMin p = new StackMin();
		p.push(4);
		p.push(5);
		p.push(3);
		int min = p.min();
		System.out.println(min);
		int d = p.pop();
		System.out.println(d);
		min = p.min();
		System.out.println(min);
	}

}
