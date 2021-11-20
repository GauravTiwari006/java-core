import java.util.Scanner;

public class fact {
	public static void main(String[] args) {
		
		Scanner r =new Scanner(System.in);
		int x;
		long gaurav;
		char ch;
		// continuous input
		do {
			gaurav=1;
		System.out.println("Enter the number:");
		x=r.nextInt();

		// factorial of a number
		for(int i=1;i<=x;i++)
		{
			gaurav=gaurav*i;
		}
		System.out.println(x+"!="+gaurav);

		System.out.println("Do you want to continue(y/n)");
		ch=r.next().charAt(0);
		
	}while(ch=='y');

}
}
