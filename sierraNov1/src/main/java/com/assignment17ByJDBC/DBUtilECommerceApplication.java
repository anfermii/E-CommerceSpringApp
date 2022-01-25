package com.assignment17ByJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtilECommerceApplication {
		static Connection getDBConnection() {
			Connection connection=null;
			try {
				//step1
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				//step2:
				 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ass17ecommerceapplication", "root", "root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;	
	}

}
