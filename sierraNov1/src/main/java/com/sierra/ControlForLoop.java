package com.sierra;

import java.util.Scanner;

public class ControlForLoop {

	public static void main(String[] args) {
		/*Scanner sc = new  Scanner(System.in);
		System.out.println("Please enter the range");
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		for ( int i = 0; i<num; i++) {
		System.out.println(i);
		sum=sum+i;}
		System.out.println("sum of the given numbers:" + sum);
		  // while loop
		int in =0;
		while(in <num) {
			System.out.println(in);
			in++;
			
			//do while 
			int num1=0;
			do {
				System.out.println(num1);
				num1++;
			}while(num1<num);
			
		}*/
		// for each 
					int arr[]= { 1,19,5,7,9,11,13,15,3};
					for(int i:arr) {
						System.out.println(i);
					}

	}
	
}


