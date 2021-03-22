package if_Else_Programs;

public class Nested_If_Program 
{
	public static void main(String[] args) 
	{
		String res = "";
		if(args.length != 3)
		{
			res += "Invalid \nEnter 3 values only.";
			System.out.println(res);
			return;
		}
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int number3 = Integer.parseInt(args[2]);
		if(number1 > number2)
		{
			if(number1 > number3)
			{
				res += number1 + " is big.";
			}
			else
			{
				res += number3 + " is big.";
			}
			
		}
		else if(number2 > number3)
		{
			res += number2 + " is big.";
		}
		else
		{
			res += number3 + " is big.";
		}
		System.out.println(res);
		
	}

}
