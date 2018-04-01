//replace spaces with string '%20' == String Manipulation problem

public class URLify
{
	void replaceString(char[] strr, int trueLength)
	{
		// char strr[] = str.toCharArray();
		// count the number of spaces
		int spaceCount = 0;
		int index = 0;
		for (int i = 0; i < trueLength; i++)
		{
			if (strr[i] == ' ')
			{
				spaceCount++;
			}
		}

		index = spaceCount * 2 + trueLength;

		// create new array of size new index
		char newAr[] = new char[index];
		if (trueLength < strr.length)
			strr[trueLength] = '\0';

		// start going in reverse and replace space with %20
		for (int i = trueLength - 1; i >= 0; i--)
		{
			if (strr[i] == ' ')
			{
				newAr[index - 1] = '0';
				newAr[index - 2] = '2';
				newAr[index - 3] = '%';
				// decrement the index by 3
				index = index - 3;
			} else
			{
				newAr[index - 1] = strr[i];
				index--;
			}
		}
		for (int j = 0; j < newAr.length; j++)
		{
			System.out.print(newAr[j]);
		}
	}

	public static void main(String args[])
	{
		URLify c = new URLify();
		String ce = "Mr John Smith   ";
		char[] b = ce.toCharArray();
		c.replaceString(b, 13);
	}
}
