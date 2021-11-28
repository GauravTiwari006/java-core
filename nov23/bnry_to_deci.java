
import java.util.Scanner;

public class bnry_to_deci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number :");
		int num=sc.nextInt();
		int sum=0,x=0;
		while(num!=0)
	       {
	    	  sum+=(num%10)*Math.pow(2, x);
	    	  num=num/10;
	    	  x++;
	       }
	       System.out.println("Decimal number is = : "+sum);
           sc.close();
	}
}
