package com.sierra;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Welcome to String");//heap
		//System.out.println(str1);
		String str4 = new String("Welcome to String");//heap
		//System.out.println(str1==str4);
		
        
	    String str2 = "Hello this is string Literal";//SCP
	    String str3 = "Hello this is string Literal";
	    //System.out.println(str2==str3);
	    String str5 = new String("Welcome to String");
//	    System.out.println(str4==str5);//false
//	    System.out.println(str4.equals(str5));
//	    System.out.println(str4.charAt(0));
//	    System.out.println(str1.concat(str2));
//	    System.out.println(str1+str2);
//	    System.out.println(str1.length());
//	    System.out.println(str1.indexOf("W"));
//	    str1.concat("bye");
//	    System.out.println(str1.concat("bye"));
//	    System.out.println(str1);
	    System.out.println(str1.toLowerCase());
	    System.out.println(str1.toUpperCase());
	    
	
	}

}
