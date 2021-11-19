import java.util.Scanner;

public class numbermultibymethod {
	
	static float multiply(float a,float b) 
	 {
		
		float t=a*b;
		return t;
	 }
	
	public static void main(String args[]) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter 1st number:= ");
		float a=sc.nextFloat();

		System.out.println("Enter 2nd number:= ");
		float b=sc.nextFloat();

	
		float t=multiply(a,b);
		System.out.println(" multiplication is:="+ t);
		
	}

}