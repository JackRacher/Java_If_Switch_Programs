package if_Else_Programs;

public class If_Else_If_program 
{
	public static void main(String[] args) 
	{
		String res = "";
		if(args.length != 2)
		{
			res += "Invalid \nEnter 2 values only.";
			System.out.println(res);
			return;
		}
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		if(number1 == number2)
		{
			res += "Both are equal.";
		}
		else if(number1 < number2)
		{
			res += number2 + " is big.";
		}
		else
		{
			res += number1 + " is big.";
		}
		System.out.println(res);
		
	}

}
