package switch_programs;

public class Simple_Switch 
{
	public static void main(String[] args) 
	{
		String res = "";
		if(args.length != 1)
		{
			res += "Invalid \nEnter only one value";
			System.out.println(res);
			return;
		}
		int number = Integer.parseInt(args[0]);
		switch (number % 2) 
		{
		case 0:
			res += number + " is even.";
			break;
		case 1:
			res += number + " is odd.";
		}
		System.out.println(res);
	}

}
