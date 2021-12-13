package com.sierra;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
//additional methods here not in the previous append(just add),insert(put data in a specific location),reverse, etc.... 	          
 // toString is a method which convert stringBuffer to string or vice versa
				//String str1= "Java FullStack course";
		StringBuffer sbuffer = new StringBuffer("Java FullStack course");
		//System.out.println(sbuffer);
//        sbuffer.append("in November");
//        System.out.println(sbuffer);
//        String str1 = sbuffer.toString();
//        StringBuffer sbuffer = str1.toString();?
	//additional methods here not in the previous append(just add),,insert(put data in a specific location),reverse, etc.... 	
		
//		StringBuilder sbuilder = new StringBuilder("Welcome to Full stack couse ");
//		sbuilder.append( "and meanstack");
//		System.out.println(sbuilder);
//		//System.out.println(sbuilder.reverse());
//		System.out.println(sbuilder.substring(2,5));
//		System.out.println(sbuilder.capacity());
		
		//StringTokenizer splits the given string intoTokens
//		StringTokenizer stokenizer = new StringTokenizer("Hi claasmate and how is going on the class");
//		
//		System.out.println(stokenizer.countTokens());
//		while(stokenizer.hasMoreTokens()){
//		System.out.println(stokenizer.nextToken());
//	}
// StringJoiner sjoiner = new  StringJoiner(",","[","]");
// sjoiner.add("This");
// sjoiner.add("is");
// sjoiner.add("November");
// sjoiner.add("Batch");
// System.out.println(sjoiner);
		StringJoiner joiner = new StringJoiner(",","[","}");
		joiner.add("hi");
		joiner.add("how");
		joiner.add("are");
		joiner.add("you?");
 System.out.println(joiner);
}
}
