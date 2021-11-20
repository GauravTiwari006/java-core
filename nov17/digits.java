import java.util.Scanner;
public class digits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a, digit;
        char ch;
		
		do {
			digit=0;
		System.out.println("Enter the number:");
		a=sc.nextInt();
		
		do
		{
			digit++;
			a/=10;
		}while(a!=0);
         
         if (digit==1)
          {
              System.out.println("number is one digit number:-");
          }
           else if (digit==2)
           {
               System.out.println(" number is two digit number ");
           }
            else if (digit==3)
           {
               System.out.println("number is three digit number:-");
           }
            else if (digit==4)
            {
                System.out.println(" number is four digit number ");
            }
            else if (digit==5)
           {
                System.out.println(" number is  five digit number ");
            }
         else {
             System.out.println("the number has more than 5 digit:");
         }

         System.out.println("want continue?--then enter y =");
         ch= sc.next().charAt(0);
        
        }while(ch== 'y');

    }


 

}