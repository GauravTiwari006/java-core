// "- write a method which takes 2 numbers and 1 char(operation +, -, *, /) and performs 
// the operation and returns the ans

// 





import java.util.Scanner;
public class operator_19 {
    public static double operations_on_operator(int x,int y,char z)
	
	{
		double result=0;
		if(z == '*')
		{
			result=x*y;
		}
		else if(z == '/')
		{
            result=((float)x)/y;
			
		}
		else if(z == '+')
		{
			result=x+y;
		}
		else if(z == '-')
		{
            result=x-y;
        }	
		else
		{
			System.out.println(" operator not exits ");
		}
		return result;
	}

	public static void main(String[] args)
    
    {
		Scanner sc = new Scanner(System.in);
		char z;
		int x,y;
		double result;
		
		System.out.println("1. Enter '*' for multiplication\n2. Enter '/' for division\n3. Enter '+' for addition\n4. Enter '-' for substraction");
		System.out.println(" choice any one :");
		z = sc.next().charAt(0);
		System.out.println("Enter the first & second numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		result=operations_on_operator(x,y,z);
		System.out.println(x+ " "  +y+  " " +z+ " = "+result);
		sc.close();
	}

}
