import java.util.Scanner;
public class lastindex {
    public static void LastIndex(int a[],int n)
	{
		int lastindex=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
			lastindex=i;
			}
		}
		System.out.println("Last Index of "+n+" = "+lastindex);
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
    
	  System.out.println("Enter the element whose index is to be found :");
	  index=sc.nextInt();
	  LastIndex(a,index);
      sc.close();
	}
}
