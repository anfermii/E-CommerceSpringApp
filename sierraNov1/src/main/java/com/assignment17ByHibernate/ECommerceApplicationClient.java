package com.assignment17ByHibernate;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.internal.build.AllowSysOut;

public class ECommerceApplicationClient {

  public static void main(String[] args) {
	  //get List<Seller>n
	/*  IECommerceApplicationDAO seDAO= new ECommerceApplicationDAO();
	  List<Product> orderList = seDAO.getOrders();
	 // List<Seller> orderList = seDAO.getOrders();
	  for (Product seller : orderList) {
		  System.out.println(seller.getPro_Id()+"\t"+seller.getProName()+"\t"+seller.getProPrice()
		  +"\t"+seller.getProQuantity()+"\t"+seller.getCust_Id());	
	}*/
	  //Lambda expression
	 /* orderList.forEach((seller)->System.out.println(seller.getPro_Id()+"\t"+seller.getProName()+"\t"+seller.getProPrice()
	  +"\t"+seller.getProQuantity()+"\t"+seller.getCust_Id()));*/
	  //get List<Customer>
	/*  IECommerceApplicationDAO cuDAO= new ECommerceApplicationDAO();
	  List<Customer> productList = cuDAO.getProducts();
	  productList.forEach((customer)->System.out.println(customer.getCust_Id()+"\t"+customer.getCust_FName()+"\t"+customer.getCust_LName()
	  +"\t"+customer.getPhoneNumber()+"\t"+customer.getEmail()));*/
	  //addSeller
	 /* Scanner sc = new Scanner(System.in);
	  Seller sell = new Seller();
	  System.out.println("enter product id");
	  sell.setPro_Id(sc.nextInt());
	  System.out.println("enter product name");
	  sell.setProName(sc.next());
	  System.out.println("enter product price");
	  sell.setProPrice(sc.nextDouble());
	  System.out.println("enter product Quantity");
	  sell.setProQuantity(sc.nextInt());
	  System.out.println("enter customer Id");
	  sc.close();
	  sell.setCust_Id(sc.nextInt());
	  IECommerceApplicationDAO seDAO= new ECommerceApplicationDAO();
	  seDAO.addSeller(sell);
	  System.out.println("success");*/
	  // addCustomer
	 /* Scanner sc = new Scanner(System.in);
	  Customer cust = new Customer();
	  System.out.println("enter customer Id");
	  cust.setCust_Id(sc.nextInt());
	  System.out.println("enter customer fname");
	  cust.setCust_FName(sc.next());
	  System.out.println("enter customet lname");
	  cust.setCust_LName(sc.next());
	  System.out.println("enter customet phonenumber");
	  cust.setPhoneNumber(sc.nextInt());
	  System.out.println("enter customer email");
	  cust.setEmail(sc.next());
	  sc.close();
	  IECommerceApplicationDAO seDAO= new ECommerceApplicationDAO();
	  seDAO.addCustomer(cust);
	  System.out.println("success");*/
	  
	  //<Seller>Join with
IECommerceApplicationDAO seDAO= new ECommerceApplicationDAO();
 List<Product> orderList = seDAO.getOrdersJoinWith();
 orderList.forEach((seller)->System.out.println(seller.getPro_Id()+"\t"+seller.getProName()+"\t"+seller.getProPrice()
 +"\t"+seller.getProQuantity()+"\t"+seller.getCust_Id()+"\t"+seller.getCust().getCust_FName()+"\t"+seller.getCust().
 getCust_LName()+"\t"+seller.getCust().getPhoneNumber()+"\t"+seller.getCust().getEmail()));

	}

}
