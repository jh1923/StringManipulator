import java.util.Scanner;

public class StringManipulatorMain 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = in.next();
		System.out.println(StringManipulator.noVowels(input));
	}

}
