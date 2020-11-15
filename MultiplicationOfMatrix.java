package matrixMulAndAdd;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r1,c1,r2,c2,sum=0,i,j;
Scanner integer = new Scanner (System.in);
System.out.println("Enter the number of rows and columns of Matrix1:");
r1=integer.nextInt();
c1=integer.nextInt();
int matrix1[][]=new int [r1][c1];
System.out.println("Enter the elements of Matrix1:");
for (i=0;i<r1;i++) 
	for (j=0;j<c1;j++)
		matrix1[i][j] = integer.nextInt();
System.out.println("Enter the number of rows and columns of Matrix2:");
r2=integer.nextInt();
c2=integer.nextInt();
int matrix2[][]=new int [r2][c2];
System.out.println("Enter the elements of Matrix2:");
for (i=0;i<r1;i++) 
	for (j=0;j<c1;j++)
		matrix2[i][j] = integer.nextInt();
int Addition[][]= new int[r1][c1];
if(r1==r2) 
{
 if (c1==c2) {
			for (i=0;i<r1;i++) 
				for (j=0;j<c1;j++)
					Addition[i][j]=matrix1[i][j]+matrix2[i][j];
				System.out.println("Addition of matrix1 and matrix2 is: "); 
				for(i=0;i<r1;i++) {
					for(j=0;j<c1;j++)
						System.out.print(Addition[i][j] + "\t");
					System.out.print("\n");	
 }
	}
}
else {
	System.out.println("Addition of matrix1 and matrix2 connot be done "); 
}
	}
}
