package com.classboxesproject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BankingMenuDAO implements IBankingMenuDAO{
	@Override
	public int addcreateAccount(Customer cust, Account acc) {
		Connection connection=ProjectDBUtil.getDBConnection();
		int createAccountInserted = 0;
		int cust_Id=0;
		
		try {
			connection.setAutoCommit(false);
			try {//step3
				PreparedStatement prepareStatement = connection.prepareStatement("insert into CUSTOMER(FIRSTNAME,LASTNAME,PASSWORD,PHONENUMBER,EMAIL) values(?,?,?,?,?)");
					prepareStatement.setString(1, cust.getFirstName());
					prepareStatement.setString(2, cust.getLastName());
					prepareStatement.setString(3, cust.getPassword());
					prepareStatement.setInt(4, cust.getPhoneNumber());
					prepareStatement.setString(5, cust.getEmail());
			     	cust_Id = prepareStatement.RETURN_GENERATED_KEYS;
					//step4
					createAccountInserted=prepareStatement.executeUpdate();
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			Random rand = new Random();
		    int acc_Num=rand.nextInt(1000);
			try {
				PreparedStatement prepareStatement = connection.prepareStatement("insert into Account(ACC_NUM,ACC_TYPE,AMOUNT) values(?,?,?)");
			    prepareStatement.setInt(1, acc.getAcc_Num());
			    prepareStatement.setString(2, acc.getAcc_Type());
				prepareStatement.setDouble(3, acc.getAmount());
				createAccountInserted=prepareStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				PreparedStatement prepareStatement = connection.prepareStatement("insert into Customer_Account(CUST_ID,ACC_Num) values(?,?)");
			     prepareStatement.setInt(1, cust_Id);
			     prepareStatement.setInt(2, acc_Num);
				createAccountInserted=prepareStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		

	return createAccountInserted;
	}

	@Override
	public int creditMoney( int acc_Num, double amount) {
		Connection connection = ProjectDBUtil.getDBConnection();
		
		int creditInserted = 0;
		
		
	    try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select AMOUNT from ACCOUNT where acc_Num="+acc_Num+" ");
			
			double balance=0;
			if(resultSet.next()) {
				balance=resultSet.getDouble("amount");
				System.out.println("balance is:"+ balance);
			}
			PreparedStatement prepareStatement = connection.prepareStatement("update account set amount=? where acc_Num=?");
	        prepareStatement.setDouble(1,balance+amount);
	        prepareStatement.setInt(2, acc_Num);
	        creditInserted = prepareStatement.executeUpdate();
	       connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return creditInserted;
		
	}
	@Override
	public int debitMoney(int acc_Num, double amount) {
		Connection connection = ProjectDBUtil.getDBConnection();
		 int debitInserted = 0;
		
		try {
			
		  Statement statement = connection.createStatement();
		  ResultSet resultSet = statement.executeQuery("select AMOUNT from ACCOUNT where acc_Num ='"+acc_Num+"' ");
		   double balance=0;
			if(resultSet.next()) {
			  balance=resultSet.getDouble("amount");
			   }
		 PreparedStatement prepareStatement = connection.prepareStatement("update account set amount=? where acc_Num=?");
	     prepareStatement.setDouble(1, balance-amount);
	     prepareStatement.setInt(2, acc_Num);
	     debitInserted = prepareStatement.executeUpdate();
	     connection.close();
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return debitInserted;	
	}
	
	@Override
	public int addtransferMoney(int from_Acc, int to_Acc, double amountTransaction) {
		int to_AccInserted=0;
		Connection connection=ProjectDBUtil.getDBConnection();

			
			try {
				connection.setAutoCommit(false);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select amount from account where acc_Num='"+from_Acc+"' ");
				double fro_AccBalance=0;
				if(resultSet.next()) {
				  fro_AccBalance=resultSet.getDouble("amount");
				   }
				System.out.println("from account balance:"+ fro_AccBalance);
				System.out.println("from acc_Num:"+ from_Acc);
				Statement statement1 = connection.createStatement();
				double to_AccBalance=0;
				ResultSet resultSet1 = statement1.executeQuery("select amount from account where acc_Num='"+to_Acc+"' ");
				//double to_Accbalance=0;
				if(resultSet1.next()) {
				  to_AccBalance=resultSet1.getDouble("amount");
				   }
				
				 System.out.println("to account balance:"+ to_AccBalance);
				 System.out.println("to acc_Num:"+ to_Acc);
				PreparedStatement prepareStatement = connection.prepareStatement("update account set amount=? where acc_Num=?");
				double amount1=fro_AccBalance-amountTransaction;
				 System.out.println("amount1:"+ amount1);
			     prepareStatement.setDouble(1,amount1 );
			     prepareStatement.setInt(2, from_Acc);
			    int  fro_AccInserted = prepareStatement.executeUpdate();
			     
			     PreparedStatement prepareStatement1 = connection.prepareStatement("update account set amount=? where acc_Num=?");
			     double amount2=to_AccBalance + amountTransaction;
			     prepareStatement1.setDouble(1,amount2);
			      prepareStatement1.setInt(2, to_Acc);
			     to_AccInserted = prepareStatement1.executeUpdate();
			     connection.commit();
			      
			   
			} catch (Exception e) {
				System.out.println("some problem in the main transaction");
				try {
					connection.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		
 
		
		
		return to_AccInserted;
	}




}


	

