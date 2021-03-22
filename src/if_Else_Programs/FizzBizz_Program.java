package if_Else_Programs;

import java.util.Scanner;

public class FizzBizz_Program 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String res = "";
		System.out.println("Enter the number to find the given number is fizz or bizz: ");
		int number = scanner.nextInt();
		if(number % 3 == 0 && number % 5 == 0) // || (number % 15 == 0)
		{
			res += "FIZZBIZZ";
		}
		else if(number % 3 == 0)
		{
			res += "FIZZ";
		}
		else if(number % 5 == 0)
		{
			res += "BIZZ";
		}
		else
		{
			res += number;
		}
		System.out.println(res);
		scanner.close();
	}

}
