import java.util.Scanner;
public class palindrome_string {
    public static void main(String[] args) {
		String original, reverse = "";
		 // Objects of String class  
		Scanner in = new Scanner(System.in);   
		System.out.println("Enter a string/number to check if it is a palindrome");  
		
		original = in.nextLine();   
		int length = original.length();

		for ( int i = length - 1; i >= 0; i-- )  
		   reverse = reverse + original.charAt(i);  

		if (original.equals(reverse))  
		   System.out.println("Entered string/number is a palindrome."); 

		else  
		   System.out.println("Entered string/number isn't a palindrome.");  
		   in.close(); 
	
    // other way

		// //To check if the string is palindrome or not
		// if(palindrm.equalsIgnoreCase(x))

		// 	System.out.println(palindrm+" - is a palindrome!!");
		// else
		// 	System.out.println(palindrm+" - is not a palindrome!!");
        //     sc.close();
    }
}