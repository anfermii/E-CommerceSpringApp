package com.sierra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		try {
			// Step1: register/load the the driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//step2: Get the connection from Database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sierranov1","root","root");
			//step3: get the statement object which is used to to send SQL queries to the database
			Statement statement = connection.createStatement();
			//step4 : Execute the query
			/*ResultSet resultSet = statement.executeQuery("select EMP_ID,EMPNAME,SALARY,PASSWORD,DEPT_ID from EMPLOYEE");
			 while (resultSet.next()){
			 System.out.println(resultSet.getInt("EMP_ID")+"\t"+resultSet.getString("EMPNAME")+"\t"+resultSet.getFloat("SALARY")+"\t"+resultSet.getString("PASSWORD")+"\t"+resultSet.getInt("DEPT_ID"));
			 }*/
			//step4:
			int count= statement.executeUpdate("insert into EMPLOYEE(EMP_ID,EMPNAME,SALARY,PASSWORD,DEPT_ID) values(105,'105name',1050,'105pwd',12) ");
			System.out.println("records inserted: "+count); 
			 //step5: close the connection
			 connection.close();
		} catch (SQLException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
