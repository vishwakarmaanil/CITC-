package ArraysandStrings;
import java.util.*;

public class Unique
{
	boolean isUniqueChar(String word)
	{
		if (word.length() > 128)
			return false;
		boolean countArray[] = new boolean[128];
		// word = word.toUpperCase();
		// char words[] = word.toCharArray();
		for (int i = 0; i < word.length(); i++)
		{
			int countVal = word.charAt(i);
			if (countArray[countVal])
				return false;
			countArray[countVal]= true;
		}
		
		return true;
	}

	public static void main(String args[])
	{
		Unique i = new Unique();
		System.out.println("asdasdasd");
		System.out.println(i.isUniqueChar("ccheall"));
		System.out.println(i.isUniqueChar("bcdef"));
		
		System.out.println(i.isUniqueChar("qweqwewqwqeqwe"));
		System.out.println(i.isUniqueChar("anil"));
		System.out.println(i.isUniqueChar("anila"));
		System.out.println(i.isUniqueChar("anila12321"));
		System.out.println(i.isUniqueChar("anil123"));
	}
}
