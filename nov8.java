public class nov8 {
    

        public static void main(String[] args) {
            System.out.println("*************using for loop print even number *************");
            for(int i = 0; i <= 10;i=i+2) {
                System.out.println(i);
            }
            
          
            System.out.println("------using while loop print even number-----");
            
            int j = 0;
            while(j<=10) {
                System.out.println(j);
                j=j+2;
            }
            // 
            // 
            // 
            System.out.println("  ********===reverse even number programm===*********** ");
            System.out.println("------ reverse even number using for loop------- ");
		for(int i = 10;i >= 0;i = i-2) {
			System.out.println(i);
		}
		
	
		System.out.println(" reverse even number using while");
        //System.out.println(" reverse even number using for loop ");
		
		int k= 10;
		while(k>=0) {
			System.out.println(k);
			k = k-2;
		}
            // 
            // 
            //
            System.out.println("******program to print small number***** ");
            int a = 1;
		    int b = 5;
		
		if(a<b) {
			System.out.println("a smaller than b");
		}
		else if(b<a) {
			System.out.println("b smaller than a");
		}
		else {
			System.out.println("a equal to b");
		}

    
        }
    
    
    
}
