package com.sierra;
@FunctionalInterface
interface Addition{
	int add(int num1, int num2);
}
/*
class AdditionImpl implements Addition{

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}  */

public class LamdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/*
				Addition addition=new Addition() {
					@Override
					public int add(int num1, int num2) {
						// TODO Auto-generated method stub
						return num1+num2;
					}
				};
				addition.add(300, 500);
				*/
				
				// ()->{}
//				Addition addition=(num1,num2)->{return num1+num2;};  // implementaion   Lambda Expression
				Addition addition=(num1,num2)->(num1+num2);  // implementaion   Lambda Expression
				System.out.println(addition.add(100, 300));  // useage
				

	}

}
