package com.sierra;

public class OperatorsDemo {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num++); //post Increment no effect at the beginning 
		System.out.println(num);   // increase by one from the above
		System.out.println(num--);//post decrement no effect at the beginning 
		System.out.println(num); // decrease by one from the above
		
	
		
		System.out.println(--num);  //num1=9   pre incr/decr = operation followed by assignment
		System.out.println(++num); //10
	}

}
