package com.sierra;
class Operation{
	int addition(int num1, int num2) {
		return num1+num2;
	}
	
	double addition(double num1, double num2) {
		return num1+num2;
	}
	
}
class ArthimeticOperation extends Operation{
	int addition(int num1, int num2) {
		return num1+num2 +10;
	}
	
	double addition(double num1, double num2) {
		return num1+num2+100;
	}
	String addition(String  num1, String num2) {
		return num1+num2;
	}
}
	class AdditionOperation extends ArthimeticOperation {
		int addition(int num1, int num2) {
			return num1+num2 +10+10;
		}
		
		double addition(double num1, double num2) {
			return num1+num2+100 +100;
		}
	}

public class PolymorphismDemo {
 // static polymorhims or compile or overloading
	public static void main(String[] args) {
		ArthimeticOperation ao = new AdditionOperation();	
		//System.out.println(ao.addition(10,35));
	    AdditionOperation ao1 = (AdditionOperation) new ArthimeticOperation();
	    System.out.println(ao1.addition(10,35));
	}

}
