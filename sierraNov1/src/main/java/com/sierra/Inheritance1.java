package com.sierra;

 class Parent{
	Parent() {
		System.out.println("parent 0-param constructor");
	}
	Parent(String name) {
		System.out.println("parent int-param constructor");
	}
	Parent(double num) {
		System.out.println("parent double-param constructor");
	}
  int num1=10;
   int addition(int num1, int num2 ) {
	return num1+num2+100; 
 }
}
 
 class Child extends Parent{
	 Child(){
		 
		 System.out.println("Child 0-param constructor");
	 }
	 Child(int number ){
		 this();
		 System.out.println("Child int-param constructor");
	 }
	 Child(double number ){
		 this();
		 System.out.println("Child double-param constructor");
	 }
	int num1=100;
	int addition(int num1, int num2 ) {
		return num1+num2; 
	 }
	void division(int num1) {
		this.num1=num1;
		System.out.println(this.num1);
		System.out.println(num1);
		System.out.println(super.addition(10,20));
		System.out.println(addition(10,20));
	}
 }

public class Inheritance1 {

	public static void main(String[] args) {
		Child child = new Child(10);
		System.out.println(child.num1);
//		System.out.println(child.addition(100, 5));
//	     child.division(1000);
	
	}

}
