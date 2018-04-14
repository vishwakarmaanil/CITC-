package ArraysandStrings;

public class StringCompression
{
	String compress(String str)
	{
		StringBuilder compressedString = new StringBuilder();
		int count = 0;

		for (int i = 0; i < str.length(); i++)
		{
			count++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1))
			{
				// compressedString += "" + str.charAt(i) + count; // string concat operates at
				// nsquare
				compressedString.append(str.charAt(i));
				compressedString.append(count);
				count = 0;
			}
		}

		return compressedString.length() < str.length() ? compressedString.toString() : str;
	}

	public static void main(String args[])
	{
		StringCompression c = new StringCompression();
		String ans = c.compress("aabcccccaaa"); // a5b2c2d1e1
		System.out.println(ans);
	}
}
