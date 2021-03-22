package if_Else_Programs;

public class If_Else_Program 
{
	public static void main(String[] args) 
	{
		String res = "";
		if(args.length != 1)
		{
			res += "Invalid \nEnter only one value.";
			System.out.println(res);
			return;
					
		}
		int number = Integer.parseInt(args[0]);
		if(number % 2 == 0)
		{
			res += "The given number is even number.";
		}
		else
		{
			res += "The given number is odd number.";
		}
		
		System.out.println(res);
		
	}

}
