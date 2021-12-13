package com.assignment;

public class Ass4MatrixMultiplication {

	public static void main(String[] args) {
		//Creating matrices
		int a [][]= {{1,1,1},
				{2,2,2},
				{3,3,3}};
		int b [][]= {{1,1,1},
				{2,2,2},
				{3,3,3}};
		
		//creating another matrix to store 2 multiplication of matrices
		int c [][] = new int[3][3]; // 3 rows, 3 columns 
		
		//multiplying and printing multiplication of 2 matrices
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j]=0;
				for (int k = 0; k< c.length; k++) {
					c[i][j]=a[i][k]*b[j][k];
				}// end of the k loop
				System.out.print(c[i][j]+ ""); //printing matrix element
			} // end of the j loop
			System.out.println();	//new line 
		}

	}
}
