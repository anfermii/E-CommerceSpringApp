package com.sierra;

public class Person {
      String hand;
      String eye;
      Person(){
    	 System.out.println("object is created");
      }
      Person(int num1){
     	 System.out.println(num1);
       }
      int addition(int num1, int num2) {
    	  int result= num1+num2;
    	   return result;
      }
      void write() {
    	System.out.println("writing with "+hand);  
      }
      void see() {
    	System.out.println("seing by" + eye);  
      }
      public static void main(String[] args) {
		Person naresh = new Person(10);
		Person measho = new Person();
		
		System.out.println(naresh.addition(500, 500));
		naresh.write();
		naresh.see();
		 //System.out.println(measho);
	}
}  
