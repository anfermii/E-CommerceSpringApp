package com.sierra;

public interface Bank {
  double rateOfInterest=11.9;
         int createAccount(String name,int id,String pan);
         boolean creditAmount(int accountNum, double Amount);
         boolean transferAmount(int fromAccount,int toAccount, double Amount);
         String[] miniStatement(int AccountNum);
         
         static void educationLoan() {
        System.out.println("this is educaion loan from govt"); 
         }
         static void m1() {
        	 
         }
         
         public static void main(String[] args) {
			Bank cityBank = new CityBankChild();
			cityBank.createAccount("Naresh", 101, "101pan");
			cityBank.creditAmount(101, 1000);
			cityBank.miniStatement(101);
			cityBank.transferAmount(102, 101, 100);
			Bank.educationLoan();
		}
}
