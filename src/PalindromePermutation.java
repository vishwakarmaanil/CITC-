public class PalindromePermutation
{
	boolean check(String str)
	{
		// a string is palindrom when we have even number of each chars with one odd/ or
		// all even
		str = str.toLowerCase();
		int oddCount = 0;
		int count[] = new int[26];
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ' ')
				continue;
			count[str.charAt(i) - 'a']++;
		}
		for (int i = 0; i < count.length; i++)
		{
			if (count[i] % 2 == 0)
			{
				continue;
			}

			if (count[i] % 2 == 1)
				oddCount++;

		}
		if (oddCount > 1)
			return false;
		else

			return true;
	}

	public static void main(String args[])
	{
		PalindromePermutation p = new PalindromePermutation();
		boolean op = p.check("anitintx leela");
		System.out.println(op);
	}

}
