
public class StringManipulator 
{
	public String noVowels(String str)
	{	
		String newStr = "";
		for (int i = 0; i < (str.length()); i++)
		{
			if (str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u')
			{
				newStr+="*";
			}
			else
			{
				newStr += "" + str.charAt(i);
			}
		}
		return newStr;
	}
}
