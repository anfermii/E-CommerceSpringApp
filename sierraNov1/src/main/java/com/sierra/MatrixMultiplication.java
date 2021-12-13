package com.sierra;

public class MatrixMultiplication {

	public static void main(String[] args) {
	int a[][]={{1,1,1},{2,2,2},{3,3,3}};
	int b[][]={{1,1,1},{2,2,2},{3,3,3}};
	
	int c[][]= new int[3][3]; 
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c.length; j++) {
			c[i][j]=0;
			for (int k = 0; k < c.length; k++) {
				c[i][j]=a[i][k]*b[j][k];	
			
		}
			System.out.print(c[i][j]+ "");
	}
	
        System.out.println();
	}

	}
}
