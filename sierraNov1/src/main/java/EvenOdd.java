import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the numbers");
		int num = sc.nextInt();
		int oddSum=0;
		int evenSum=0;
    for(int i=0;i< num;i++) {
    	if(i % 2 ==0) {
    		evenSum=evenSum+i;i++;
    		oddSum= evenSum+i;i++;
    		 System.out.println("sum of the even numbers are:" + (evenSum));
    		    System.out.println("sum of the odd numbers are:" + (oddSum));
    			
    	}
    	
    	else {
    		
    		System.out.println("No answer");
    	}
    	
    }
   
	}

}