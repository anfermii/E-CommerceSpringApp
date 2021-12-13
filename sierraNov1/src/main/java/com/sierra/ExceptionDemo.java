package com.sierra;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
	 public TooYoungException() {
	System.out.println("you are too young ");
	}
}

class TooOldException extends RuntimeException{
	public TooOldException() {
		System.out.println(" you are to old to get the chance");
	}
}

public class ExceptionDemo {
	
	static void  ageCheck(int age) {
		if (age < 18) {
			throw new TooYoungException();
		}else if(age > 35) {
			throw new TooOldException();	
		}else {
			System.out.println("Conguratulations");
		}
	}
	
 static int division(int num1, int num2) throws ArithmeticException {
	 String name=null;
	 name.charAt(0);
	 return num1/num2;
 }
  static void operations1(int number1, int number2) throws ArithmeticException {
	  System.out.println(division(number1,number2));
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
//     try {
//		operations1(100,0);
//	} catch (ArithmeticException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//     finally {
//    	 System.out.println("Mandatory");
//     }
//     try {
//     System.out.println(division(10,0));
//     }catch (ArithmeticException e) {
//		// TODO: handle exception
//    	 e.printStackTrace();
//	}

     //System.out.println("hello this is division");
     Scanner sc= new Scanner(System.in);
     System.out.println("please enter the age");
     int age = sc.nextInt();
     try {
     ageCheck(age);
     }catch (TooYoungException e) {
		e.printStackTrace();
	}catch (TooOldException e) {
		e.printStackTrace();
	}
     System.out.println("end");
	}

}
