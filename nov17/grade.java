import java.util.Scanner;

public class grade {
	public static String calGrade(int x)
	{
		String grv=" ";
		if((x>=90)&&(x<=100))
		{
			grv="A+";
		}
		else if((x>=80)&&(x<=89))
		{
			grv="A";
		}
		else if((x>=70)&&(x<=79))
		{
			grv="B";
		}
		else if((x>=60)&&(x<=69))
		{
			grv="C";		
		}
		else if((x>=50)&&(x<=59))
		{
			grv="D";		
		}
		else if(x<50)
		{
			grv="FAIL :feeling very bad bro keep try next year";
		}
		else
		{
			grv="Invalid";
		}
		return grv;
	}
	public static void main(String[] args) {
		
		Scanner r =new Scanner(System.in);
		int x;
		String grv;
		//User input for marks
		System.out.println("Enter the marks:");
		x=r.nextInt();
		//Calling Static Function calGrade
		grv=calGrade(x);
		System.out.println("Your grade : "+grv);
	}

}