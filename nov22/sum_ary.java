package nov22;
import java.util.Scanner;
public class sum_ary {
    // sum of all elements in an array
	public void sum(int rrr[])
	{
		int sum=0;
		for(int i=0;i<rrr.length;i++)
		{
			sum+=rrr[i];
		}
		System.out.println("Sum of all elements in the array : "+sum);
	}
	
	//middle element in an array
	public void midElement(int rrr[])
	{
		int mid=(rrr.length)/2;
		if(rrr.length%2!=0)
		{
			System.out.println("Middle Element in the array : "+rrr[mid]);
		}
		else
		{
			System.out.println("Middle Elements : "+rrr[mid-1]+" & "+rrr[mid]);
		}
	}
	
	//all positive elements in an array
	public void positive(int rrr[])
	{
		String aaa="";
		for(int i=0;i<rrr.length;i++)
		{
			if(rrr[i]>0)
			{
				aaa=aaa+" "+rrr[i];
			}
		}
		System.out.println("Positive elements present in the array : "+aaa);
	}
	
	//Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[10];
		
		System.out.println("Enter the 10 elements in the array:");
		
		for(int i=0;i<10;i++) 
		{
			x[i]=sc.nextInt();		
		}
		sum_ary aaa=new sum_ary();
		aaa.sum(x);
		aaa.midElement(x);
		aaa.positive(x);
		sc.close();
	}
}
