package switch_programs;

import java.util.Scanner;

public class Month_Days_Using_Switch 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String res = "";
		System.out.println("Months\n 1. Jan\n 2. Feb\n 3. Mar\n 4. Apr\n 5. May\n 6. Jun\n 7. Jul\n 8. Aug\n 9. Sep\n10. Oct\n11. Nov\n12. Dec");
		System.out.print("Enter the number to find the month and its days: ");
		int number = scanner.nextInt();
		switch (number) 
		{
		case 1:
			res += "The number of days present in Jan is 31.";
			break;
		case 2:
			res += "The number of days present in Feb is 28.";
			break;
		case 3:
			res += "The number of days present in March is 31.";
			break;
		case 4:
			res += "The number of days present in April is 30.";
			break;
		case 5:
			res += "The number of days present in May is 31.";
			break;
		case 6:
			res += "The number of days present in June is 30.";
			break;
		case 7:
			res += "The number of days present in July is 31.";
			break;
		case 8:
			res += "The number of days present in August is 31.";
			break;
		case 9:
			res += "The number of days present in Sep is 30.";
			break;
		case 10:
			res += "The number of days present in Oct is 31.";
			break;
		case 11:
			res += "The number of days present in Nov is 30.";
			break;
		case 12:
			res += "The number of days present in Dec is 31.";
			break;
		default:
			res += "Invalid Number.";
			break;
		}
		System.out.println(res);
		scanner.close();
	}

}
