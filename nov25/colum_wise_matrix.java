import java.util.Scanner;
public class colum_wise_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int[][] matrix=new int[2][2];
		int row=matrix.length;
		int cols=matrix[0].length;

	
		System.out.print("enter elements of matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		//displaying  matrix columns wise
		System.out.println("displaying  matrix elements columns wise" );
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print( matrix[i][j]+" ");
                sc.close();
			}
		}
    }
}