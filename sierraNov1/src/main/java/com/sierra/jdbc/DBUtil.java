package com.sierra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection getDBConnection() {
		Connection connection=null;
		try {
			//step1 : Register/load the driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//step2: Get the connection from Database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sierranov1", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
