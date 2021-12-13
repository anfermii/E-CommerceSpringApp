package com.sierra;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		/*int arr1[] = new int[4];
		arr1[0] = 5;
		arr1[1] = 10;
		arr1[2] = 15;
		arr1[3] = 25;
		
		
	   System.out.println("size of the array is:" + arr1.length);
		for( int i:arr1) {
			System.out.println(i);
		}
			
		//2nd way of creating array
		int arr2[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i:arr2) {
			System.out.println(i+ ""); 
		} */
		/*// 2-D
	
		int arr3[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int[] is:arr3) {
			for(int is2:is) {
				System.out.print(is2+"\t");// makes each array to be print horizontally being have gap
			}
			System.out.println("\n"); // ("\n") makes the inner array elements to be the next vertical line 
		}
		
		//3-D
		 int arr4 [][][]= {{{12,32},{45,43}},{{45,878},{23,2}}};
		System.out.println(arr4[1][1][0]);
		//000,001
		//010,011
		//100,101
		//
		/// string
		String str1=new String("Welccome to String");  // heap
		String str4=new String("Welccome to String");  // heap
		System.out.println(str1==str4);  // false
		System.out.println(str1);
		
		//2nd way of String object=String Literal=if the content is same it will not create new object
		String str2="Hello this is String literal";  //SCP
		String str3="Hello this is String literal";
		String str5="Welccome to String";
		
		System.out.println(str2==str3); //true   ==operator checks for both content and address/reference
		
		System.out.println(str1==str5); //false
		System.out.println(str1.equals(str5)); //true
		
		System.out.println(str1.charAt(4));
	   // System.out.println(str1.concat(bye));*/
		
int arr2[]= {30,430,122,3434,565,343,87};  //1-D
		
		Arrays.sort(arr2);
		System.out.println("\n");
		for (int i : arr2) {   //after sorting
			System.out.print(i+"\t");
		}  
		System.out.println("\n");
		System.out.println("bin search:"+Arrays.binarySearch(arr2, 30));
	}
	

}

