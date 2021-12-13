package com.sierra;
class Parent1{
	int number=1000;
	int addition(int num1, int num2) {
		return num1+num2;
	}
}
class Child1 extends Parent1{
  int division(int num1, int num2) {
   return num1/num2;  
  }
}
 //Multilevel Inheritance
//class A{}
//class B extends A{}
//class c extends B{}
//class A{
//	
//}
//class B{
//	
//}
//class C extends A,B { // Multiple Inheritance is not allowed in Java
//	
//}
public class InheritanceDemo {

	public static void main(String[] args) {
		
     Child1 child = new Child1();
     System.out.println(child.number);
     System.out.println(child.addition(20,30));
     System.out.println(child.division(50,25));
	}

}
