import java.util.Scanner;
public class nov11 {
    public static void main(String[] args) {

         int num;
         System.out.println("*****user input table programm*****");
         System.out.print("enter any number ");
         Scanner r=new Scanner(System.in);
         num=r.nextInt();
          for ( int i =1; i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
            

          }
          // 
          // 
          System.out.println("*****swapping programm*****");
          int x,y,t;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of x and y");
        
        x= sc.nextInt();
        y=sc.nextInt();
        System.out.println("before swaping number:" +x+" "+y);
        t=x;
        x=y;
        y=t;
        System.out.println("after swaping:"+ x+" "+y);
        System.out.println();

        // 
        // 
        // 
        System.out.println("*****factorial programm*****");
        int fact =1 ;
        for (int i =8; i>=1; i--)// factorial of 8 is 40320
        {
            fact = fact*i;


        }
        System.out.println(fact);


    }
    
}
