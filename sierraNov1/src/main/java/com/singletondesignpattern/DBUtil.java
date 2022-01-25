package com.singletondesignpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	/*
	synchronized static Connection getDBConnection() {
	 	Connection connection=null;
			if (connection==null) {
				try {
					//step1 : Register/load the driver
					DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
					//step2: Get the connection from Database
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sierranov1", "root", "root");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return connection;
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			
			throw new CloneNotSupportedException();
		}*/
	synchronized static Connection getDBConnection() {
		Connection connection=null;
		if(connection==null) {
			try {
				//step1 : Register/load the driver
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				//step2: Get the connection from Database
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sierranov1", "root", "root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return connection;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}
}
