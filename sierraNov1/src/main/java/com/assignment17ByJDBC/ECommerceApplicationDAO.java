package com.assignment17ByJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ECommerceApplicationDAO implements  IECommerceApplicationDAO{

	@Override
	public List<Customer> getCustomers() {
		Connection connection= DBUtilECommerceApplication.getDBConnection();
		List<Customer> customerList=null;
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select CUST_ID,CUST_FNAME,CUST_LNAME,PHONENUMBER,EMAIL from CUSTOMER");
			customerList= new ArrayList();
			while(resultSet.next()) {
				Customer c= new Customer();
				c.setCust_Id(resultSet.getInt("CUST_ID"));
				c.setCust_FName(resultSet.getString("Cust_FNAME"));
				c.setCust_LName(resultSet.getString("CUST_LNAME"));
				c.setPhoneNumber(resultSet.getInt("PHONENUMBER"));
				c.setEmail(resultSet.getString("EMAIL"));
				customerList.add(c);
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerList;
	}

	@Override
	public List<Product> getOrders() {
		Connection connection= DBUtilECommerceApplication.getDBConnection();
		List<Product> OrderList = null;
		try {
			//step3:
			Statement statement = connection.createStatement();
			//step4:
			ResultSet resultSet = statement.executeQuery("select PRO_ID,PRONAME,PROPRICE,PROQUANTITY,CUST_ID from SELLER");
			OrderList= new ArrayList();
		   while (resultSet.next()) {
			   Product s = new Product();
			   s.setPro_Id(resultSet.getInt("PRO_ID"));
			   s.setProName(resultSet.getString("PRONAME"));
			   s.setProPrice(resultSet.getDouble("PROPRICE"));
			   s.setProQuantity(resultSet.getInt("PROQUANTITY"));
			   s.setCust_Id(resultSet.getInt("CUST_ID"));
			   OrderList.add(s);
		}
		   connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return OrderList;
	}
 
	@Override
	public int addCustomer(Customer cust) {
	Connection connection= DBUtilECommerceApplication.getDBConnection();
	int customerInserted = 0;
	try {
	 PreparedStatement prepareStatement = connection.prepareStatement("insert into CUSTOMER (CUST_ID,CUST_FNAME,CUST_LNAME,PHONENUMBER,EMAIL) values(?,?,?,?,?)");
	 prepareStatement.setInt(1, cust.getCust_Id());   
	 prepareStatement.setString(2, cust.getCust_FName());
	 prepareStatement.setString(3, cust.getCust_LName());
	 prepareStatement.setInt(4, cust.getPhoneNumber());
	 prepareStatement.setString(5, cust.getEmail());
     customerInserted = prepareStatement.executeUpdate();
     connection.close();
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerInserted;
	}

	@Override
	public int addSeller(Product pro) {
	Connection connection= DBUtilECommerceApplication.getDBConnection();
	int sellerInserted = 0;
	try {
		PreparedStatement prepareStatement = connection.prepareStatement("insert into SELLER(PRO_ID,PRONAME,PROPRICE,PROQUANTITY,CUST_ID) values(?,?,?,?,?)");
		prepareStatement.setInt(1, pro.getPro_Id());
		prepareStatement.setString(2, pro.getProName());
		prepareStatement.setDouble(3, pro.getProPrice());
		prepareStatement.setInt(4, pro.getProQuantity());
		prepareStatement.setInt(5, pro.getCust_Id());
		sellerInserted = prepareStatement.executeUpdate();
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		return sellerInserted;
	}
 
}
