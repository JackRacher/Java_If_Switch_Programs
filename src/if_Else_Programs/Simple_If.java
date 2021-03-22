package if_Else_Programs;

public class Simple_If 
{
	public static void main(String[] args) 
	{
		//Printing Absolute value using command line arguments
		
		String res = "";
		if(args.length != 1)
		{
			res += "Invalid \nEnter only one value";
			System.out.println(res);
			return;
		}
		int number = Integer.parseInt(args[0]);
		if(number < 0)
		{
			res += -number;
		}
		res += number;
		System.out.println(res);
		
	}

}
