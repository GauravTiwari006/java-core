import java.util.Scanner;
public class inside_string{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
		String gaurav="";	
		System.out.println("Enter the strring :");
		gaurav=sc.nextLine();
		String search="";	
		System.out.println("Enter the word :");
		search=sc.nextLine();
		int index=gaurav.indexOf(search);
		if(index==-1)
			System.out.println("Word not found!");
		else
			System.out.println("Word found at index : "+index);  
            sc.close(); 
    }
}