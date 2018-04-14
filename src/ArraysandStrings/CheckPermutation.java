package ArraysandStrings;
// one string is permutation of other
public class CheckPermutation
{
	boolean checkPerm(String str1, String str2)
	{
		if (str1.length() != str2.length())
		{
			return false;
		}

		int countArray[] = new int[128];

		for (int i = 0; i < str1.length(); i++)
		{
			countArray[str1.charAt(i)]++;
		}

		for (int j = 0; j < str2.length(); j++)
		{
			countArray[str2.charAt(j)]--;
			if (countArray[str2.charAt(j)] < 0)
			{
				return false;
			}
		}

		return true;
	}

	public static void main(String args[])
	{
		CheckPermutation c = new CheckPermutation();
		System.out.println(c.checkPerm("h3ello", "elh3lo"));
		System.out.println(c.checkPerm("adad", "assdsads"));
	}
}
