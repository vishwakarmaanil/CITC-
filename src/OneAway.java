// given true string check if they are one edit away; three types of edit = insert, replace or remove a character --> print true
public class OneAway
{

	boolean check(String str1, String str2)
	{
		if ((str1.length() - str2.length()) > 1)
			return false;

		String first = str1.length() < str2.length() ? str1 : str2;
		String second = str1.length() < str2.length() ? str2 : str1;

		int index1 = 0;
		int index2 = 0;

		boolean difference = false;
		while (index2 < second.length() && index1 < first.length())
		{
			if (first.charAt(index1) != second.charAt(index2))
			{
				if (difference)
					return false;
				difference = true;

				if (first.length() == second.length())
				{
					index1++;
				}
			} else
			{
				index1++;
			}
			index2++;
		}

		return true;
	}

	public static void main(String args[])
	{
		OneAway a = new OneAway();
		System.out.println(a.check("pale", " ple"));
		System.out.println(a.check("pales", " pale"));
		System.out.println(a.check("pale", " bale"));
		System.out.println(a.check("pale", " bae"));

	}
}
