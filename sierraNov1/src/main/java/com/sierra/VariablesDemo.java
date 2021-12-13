package com.sierra;

public class VariablesDemo {
	int num1=10; // instance variable (or) non-static
	// memory allocated to the value whenever the object is created
	//any variable declared outside the method and inside the class is instance/non-static variable
	
	static int num2 =20; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariablesDemo obj1=new VariablesDemo();  //num1=10->100 
		//VariableDemo is the class name 
		//obj1 is the identifier of variable
		//VariablesDemo() is constructor
		//new VariablesDemo() is  the object 
		//whenever object is created the memorey will be given for instance varialbe inside the heap
		//we can not directly access non-static members from static are. object is needed to access
		//for every object, a seperate copy of instance variables will be given
		obj1.num1=100;
		System.out.println(obj1.num1);  //100
		obj1.num2 =100;
		
		
		VariablesDemo obj2=new VariablesDemo(); //num1=10
		System.out.println(obj2.num1);  //10
		
		obj2.method1();
	}
	
	void method1() {
		num1=1000;
		System.out.println(num1); //1000

	}

}
