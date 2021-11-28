import java.util.Scanner;
public class firstindex {
    
	//Method to find the first index of given element in an array
	public static void FirstIndex(int a[],int n)
	{
		int firstindex=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
			firstindex=i;
			break;
			}
		}
		System.out.println("First Index of "+n+" = "+firstindex);
	}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index;
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
    
	  System.out.println("Enter element whose index is to be found :");
	  index=sc.nextInt();
	  FirstIndex(a,index);
      sc.close();
	 
	}
}
