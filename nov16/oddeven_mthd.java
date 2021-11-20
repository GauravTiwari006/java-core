
import java.util.Scanner;

public class oddeven_mthd {
	 
	public static void testforoddeven(int a)
	{
		if (a%2==0)

			System.out.println("Even Number");

		else
			System.out.println("Odd Number");

	}
	public static void main(String args[])
	{
		
		Scanner r = new Scanner(System.in);

		int test;
		
// number is odd or even
		System.out.println("Enter the number : ");

		test=r.nextInt();

		testforoddeven(test);
	}

}
