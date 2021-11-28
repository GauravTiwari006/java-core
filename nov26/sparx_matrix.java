import java.util.Scanner;
public class sparx_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[3][3];
		int row=matrix.length;
		int cols=matrix[0].length;
        int count=0;
		
		System.out.println("Enter elements in matrix: ");
		

	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			matrix[i][j]=sc.nextInt();		
			}
	}
	
	

	int size=row*cols;
	
	
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < cols; j++) {
			if(matrix[i][j]==0) {
				count++;}
			}
		}
	
	if(count>(size/2)) {
		System.out.println("Given matrix is sparse matrix");
	}else {
		System.out.println("Given matrix is not sparse matrix");
        sc.close();
	}
    }
}