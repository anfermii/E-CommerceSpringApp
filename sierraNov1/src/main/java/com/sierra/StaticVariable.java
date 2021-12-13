package com.sierra;

public class StaticVariable {
 static int num=20;
   static int num7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StaticVariable.num=30;
        System.out.println("result:" + num);
        StaticVariable.num=40;
        System.out.println("result1:" + num);
        //StaticVariable.method();
       // System.out.println("result2:" + num2);
        //StaticVariable obj3 =new StaticVariable();
        //obj3.method(2, 2.2);
        
       //System.out.println("result7:" + num7);
        System.out.println(StaticVariable.num7);
        }
  static void method(int num3, double num4) {
	  System.out.println("This is an answer ");
	  
  }
  static void method1() {
	  int num2;
	  num7=3000;
	  
	  //System.out.println("result3:" + num2);
	  //int num2 = 10;
	//System.out.println("result3:" + num2);
	  
  }
  static {
	  System.out.println("This is static block ");
	  
  }
}
