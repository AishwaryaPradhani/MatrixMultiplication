package matrixMulAndAdd;
import java.util.Scanner;

public class MatrixMulAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m,n,p,q, sum=0,i,j,k;
		Scanner integer = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of Matrix1:");
		m=integer.nextInt();
		n=integer.nextInt();
		int matrix1[][] = new int[m][n];
		System.out.println("Enter the elements of Matrix1:");
		for (i=0;i<m;i++) {
			for (j=0;j<n;j++)
				matrix1[i][j] = integer.nextInt()	;
		}
		System.out.println("Enter the number of rows and columns of Matrix2:");
		p=integer.nextInt();
		q=integer.nextInt();
		if(n!=p) {
			System.out.println("Matrix1 and Matrix2 cannot be multilied");
		}
		else {
		int matrix2[][] = new int[p][q];
		int multiply[][]= new int[m][q];
		System.out.println("Enter the elements of Matrix2:");
		for (i=0;i<p;i++) 
			for (j=0;j<q;j++)
				matrix2[i][j] = integer.nextInt()	;
			for (i=0;i<m;i++) {
				for (j=0;j<q;j++)
					for (k=0;k<n;k++) {
						sum+=matrix1[i][k]*matrix2[k][j];
						multiply[i][j]=sum;
						sum=0;
					
					}
		}
			System.out.println("Product of matrix1 and matrix2 is: "); 
			for(i=0;i<m;i++) {
				for(j=0;j<q;j++)
					System.out.print(multiply[i][j] + "\t");
				System.out.print("\n");
			}
}
	}
}
