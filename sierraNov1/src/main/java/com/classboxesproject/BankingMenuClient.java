package com.classboxesproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingMenuClient {

	public static void main(String[] args) {
 IBankingMenuDAO bmDAO = new BankingMenuDAO();
        
        System.out.println("ABC Banking Menu: ");

		System.out.println("1. Create Account ");

		System.out.println("2. Credit Money ");

		System.out.println("3. Debit Money ");

		System.out.println("4. Transfer ");

		

		System.out.println("Please select the option");

		

		Scanner sc = new Scanner(System.in);

		int op = sc.nextInt();

		char response = 'y';
		do {
			switch(op)     {
				case 1:
					
					System.out.println("please enter account creation information...");
					Scanner s = new Scanner(System.in);
					Customer customer = new Customer();
					System.out.println("Enter First Name");
					customer.setFirstName(s.next());
					System.out.println("Enter Last Name");
					customer.setLastName(s.next());
					System.out.println("Enter Password");
					customer.setPassword(s.next());
					System.out.println("Enter Phone Number");
				    customer.setPhoneNumber(s.nextInt());
				    System.out.println("Enter Email");
					customer.setEmail(s.next());
		
					Account account = new Account();
					System.out.println("Enter account type");
					account.setAcc_Type(s.next());
					System.out.println("amount");
					account.setAmount(s.nextDouble());
				
                    IBankingMenuDAO bkDAO= new BankingMenuDAO();
                    int customersInserted = bkDAO.addcreateAccount(customer,account);
                    System.out.println("success... Records Inserted are"+customersInserted);
                    

					break;
				case 2:

					System.out.println("credited creation Information.");
					Scanner sca = new Scanner(System.in);
					Account credit = new Account();
					System.out.println("Enter Accout Number");
					int acc_Num=sca.nextInt();
					System.out.println("Enter Amount credited");
					double amount=sca.nextDouble();
					IBankingMenuDAO bkDAO1= new BankingMenuDAO();;
					int creditInserted = bkDAO1.creditMoney(acc_Num,amount);
					System.out.println("success... Records Inserted are"+creditInserted);
					
					break;
				case 3:

					System.out.println("Debit creation Information...");
					Scanner scan = new Scanner(System.in);
					Account debit = new Account();
					System.out.println("Enter Accout Number");
					int acc_Num1=scan.nextInt();
				
					System.out.println("Enter Amount debited ");
					double amount1 =scan.nextDouble();
					IBankingMenuDAO bkDAO2= new BankingMenuDAO();
					int debitInserted =bkDAO2.debitMoney(acc_Num1,amount1);
				    System.out.println("success... Records Inserted are"+debitInserted);
					
					break;
				case 4:

					System.out.println("transferred creation information");
				    Scanner scann= new Scanner(System.in);
				    Transaction trans = new Transaction();
				    System.out.println("Enter from Account");
				    int from_Acc=scann.nextInt();
				    System.out.println("Enter to Account");
				    int to_Acc=scann.nextInt();
				    System.out.println("Enter Amount of transaction");
				    double amountTransaction=scann.nextDouble();
				    IBankingMenuDAO bkDAO3 = new BankingMenuDAO();
				    int transInserted= bkDAO3.addtransferMoney(from_Acc, to_Acc,amountTransaction );
				    System.out.println("success... Records Inserted are"+transInserted);
					break;	

				default:
			 	System.out.println("Invalid choice, Please try again...");
			}
			System.out.println("Do you want to continue (y/n)");

			char newresponse = sc.next().toLowerCase().charAt(0);

			 if(newresponse != 'n')  {

				 System.out.println("Please select the option again");

			   }
			 else  {

			 	 System.out.println("Good bye, Thank you visit again....");
			 }

			Scanner scanner = new Scanner(System.in);
		op = scanner.nextInt();
			} while(response != 'n'); 

				
		

			op = sc.nextInt(); 
			sc.close();

	}

}
