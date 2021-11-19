public class nov12 {
    public static void main(String[] args) {
        System.out.println("pyramid:");
        for (int i = 0; i < 5; i++)
         { 
             for (int j = 0; j < 5 - i; j++)
             { 
                 System.out.print(" "); 
            
            } 
            for (int k = 0; k <= i; k++) 
            { 
                System.out.print("* ");
         }
         
          System.out.println(); 
        }




 
System.out.println("reverse pyramid:");

for (int i = 5; i >= 1; i--)
{ 
    for (int j = 1; j <= 5-i; j++)
    { 
        System.out.print(" "); 
   
   } 
   for (int k = 1; k <= i; k++) 
   { 
       System.out.print("* ");
}

 System.out.println(); 
}
System.out.println("reverse number pyramid:");

for (int i = 5; i >= 1; i--)
{ 
    for (int j = 1; j <= 5-i; j++)
    { 
        System.out.print(" "); 
   
   } 
   for (int k = 1; k <= i; k++) 
   { 
       System.out.print(i);
}

 System.out.println(); 
}
System.out.println("daimond star:");

for (int i = 1; i <= 5; i++)
{
    for (int j = 5 - i; j >= 1; j--)
    {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
for (int i = 4; i >= 1; i--)
{
    for (int j = 5 - i; j >= 1; j--)
    {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++)
    {
        System.out.print("*");
    }
    System.out.println();
}





      }

      
    
 }
