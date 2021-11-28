import java.util.Scanner;
public class reverse_string {
public static void main(String[] args) {
     	Scanner sc  = new Scanner(System.in);


		String palindrm="";	
		System.out.println("Enter the word :");
		palindrm=sc.nextLine();
		char[] grv=palindrm.toCharArray();

		String x="";

		for(int i=(grv.length)-1;i>=0;i--)
		{
			x=x+grv[i];
		}
		System.out.println("Reversed String : "+x);
        sc.close();
}
}
