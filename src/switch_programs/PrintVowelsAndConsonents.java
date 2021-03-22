package switch_programs;

import java.util.Scanner;

public class PrintVowelsAndConsonents 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the charecter: ");
		char charecter = scanner.next().toUpperCase().charAt(0);
		switch (charecter) 
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("the given charecter is Vowel.");
				
				break;
			default:
				if(charecter >= 'A' && charecter <= 'Z')
				{
					System.out.println("The given charecter is consonent.");
				}
				else
				{
					System.out.println("Invalid charecter.");
				}
		}
		scanner.close();
	}
}
