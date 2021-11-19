import java.util.Scanner;


public class nov10 {

	public static void main(String[] args) {




		int num;
		
		Scanner userinput = new Scanner(System.in);
		
		// Give value as a character : 
		System.out.print("Enter The value in character : ");
		char ch = userinput.next().charAt(0);
		
		// convert character value in ASCII value : 
		num = (int)ch;
		
		System.out.println();
		
		// Print ASCII value : 
		System.out.println("The ASCII value for given Character is : " + num);
		
		//  float value : 
		
		float r = 1004.115478f;
		System.out.println("**********The float value is :******** " +  r); 
		
		//  double value : 
		
		double d = 14567.1458675267;
		System.out.println("******double value is :***** " + d);
		
		// how to write character value : 
		
		char g = 'G';
		System.out.println("******** character value is : ******" +g );
		
		//
		// 
		//  
        

		
		
	}

}