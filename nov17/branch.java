import java.util.Scanner;

public class branch {
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		String gt;
		int year;
		System.out.println("Enter the Branch(capital accepted):\n CSE  \n ECE \n MECH");
		gt=r.nextLine();
		System.out.println("Enter the Year  :");
		year=r.nextInt();
		System.out.println("\n SUBJECT :");
		
		// for 1st year common for all branches
		if(year == 1)
		{
			System.out.println(" English \n Maths \n Science");
		}
		
		//for 2nd year
		else if(year==2)
		{
			switch(gt)
			{
			
			case "CSE":
				System.out.println(" Operating System\n Java\n Data Structure");
				break;
			case "ECE":
				System.out.println(" Micro processors\n Logic switching theory");
				break;
			case "MECH":
				System.out.println(" Drawing \n Manufacturing Machines");
				break;
			default:	
				System.out.println("Invalid");
			}
		}
		
		// for 3rd year
		else if(year == 3)
		{
			switch(gt)
			{
			
			case "CSE":
				System.out.println(" Computer Organization\n MultiMedia");
				break;
			case "ECE":
				System.out.println(" Fundamentals of Logic Design\n Microelectronics");
				break;
			case "MECH":
				System.out.println(" Internal Combustion Engines\n Mechanical Vibration");
				break;
			default:	
				System.out.println("Invalid ");
			}
		}
		// for 4th(berojgar) year
		else if(year == 4)
		{
			switch(gt)
			{
			
			case "CSE":
				System.out.println(" Data Communication and Networks\n MultiMedia");
				break;
			case "ECE":
				System.out.println("* Embedded System\n* Image Processing");
				break;	
			case "MECH":
				System.out.println("* Production Technology\n,  Thermal Engineering");
				break;
			default:	
				System.out.println("****Invalid****");
			}
		}
		else
		{
			System.out.println("Enter between 1 to 4 year only");
		}
	}
}