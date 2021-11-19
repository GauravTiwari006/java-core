import java.util.Scanner;
public class nov9
 {

	public static void main(String[] args)
     {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Enter your number*****:--- ");
		int num = sc.nextInt();
		int k = 0;
		if(num>2)
         {
			for(int i = 2; i < num;i++)
            
            {
				if(num%i == 0) {
					k = k+1;
				}
			}
		}
         else
         {
			System.out.println("number is negative  but -----");
		}
		if(k == 0) 
        {
			System.out.println(num + " is prime");
		}else
         {
			System.out.println(num + " is not prime");
		}
        


	}

}
    

