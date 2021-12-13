package com.sierra;

public class Welcome {
	//1. keywords/reserved words (there are 50 keywords in Java) and uses to write line up code
		//2. datatypes = type+size
		//3.variables & structure/syntax
		char number;
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Java");
		
		//datatypes = 8 primitive datatypes (byte,short,char,int, long, double, float, boolean) + userdefined datatype non primitive like class, inteface
		
		byte num1=127;   // 1byte = 8 bits -128  to 127, default value = 0
		
		short num2=10;  // 2 bytes   -32768 to 32767 , default value = 0
		
		char num3=40000;  // holds a single character  = 2 bytes, default is space
		System.out.println(num3);
		
		int num4=10;  // 4 bytes , default value = 0 , default value = 0
		long num5=100;  // 8 bytes , default value = 0 , default value = 0
		
		double salary=1000.203; // 8 bytes     floating point repre
		float empSalary=2000.3423f;  //4 bytes     floating point repre
		
		boolean check;        // logical representation, def value=false 
		
		num2=num1;
		num1=(byte)num2;  //type casting
		System.out.println("num2 value:"+num2);
	

	}

}
