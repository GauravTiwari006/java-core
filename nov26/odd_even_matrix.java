import java.util.Scanner;
public class odd_even_matrix {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
	int[][] matrix=new int[4][4];
	int row=matrix.length;
	int cols=matrix[0].length;
    int countEven=0;	
    int countOdd=0;
	System.out.println("Enter elements in matrix: ");


for (int i = 0; i < row; i++) {
	for (int j = 0; j < cols; j++) {
		matrix[i][j]=sc.nextInt();		
		}
}


System.out.println("Displaying elements in matrix: ");
for (int i = 0; i < row; i++) {
for (int j = 0; j < cols; j++) {
    System.out.print(matrix[i][j]+" ");		
	}
System.out.println();
}


System.out.println("Displaying and counting even and odd number in matrix: ");
for (int i = 0; i < row; i++) {
for (int j = 0; j < cols; j++) {
	if(matrix[i][j]%2==0) {
		countEven++;
		System.out.println("Even number is: "+matrix[i][j]);
	}else {
		countOdd++;
		System.out.println("Odd number is: "+matrix[i][j]);}	
	}
}

System.out.println("Frequency of even number is: "+countEven);
System.out.println("Frequency of odd number is: "+countOdd);
sc.close();	
    }
}
