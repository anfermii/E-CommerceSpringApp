package com.assignment17ByJDBC;

import java.util.List;
import java.util.Scanner;

public class ECommerceApplicationClient {

	public static void main(String[] args) {
		/*IECommerceApplicationDAO ecaDAO= new ECommerceApplicationDAO();
		List<Customer> customerList = ecaDAO.getCustomers();
		customerList.forEach((customer)->System.out.println(customer.getCust_Id()+"\t"+customer.getCust_FName()+""+customer.getCust_LName()
		+"\t"+customer.getPhoneNumber()+"\t"+customer.getEmail()));

		IECommerceApplicationDAO orDAO = new ECommerceApplicationDAO();
		List<Product> orderList = orDAO.getOrders();
		 orderList.forEach((product)->System.out.println(product.getPro_Id()+"\t"+product.getProName()+"\t"+product.getProPrice()+"\t"+product.getProQuantity()+"\t"+product.getCust_Id()));
		 */
		/*Scanner sn = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println("Enter Cust_Id");
		customer.setCust_Id(sn.nextInt());
		System.out.println("Enter Cust_FName");
		customer.setCust_FName(sn.next());
		System.out.println("Enter Cust_LName");
		customer.setCust_LName(sn.next());
		System.out.println("Enter Phone Number");
		customer.setPhoneNumber(sn.nextInt());
		System.out.println("Enter email");
		customer.setEmail(sn.next());
		IECommerceApplicationDAO cuDAO= new ECommerceApplicationDAO();
		int customerInserted = cuDAO.addCustomer(customer);
		System.out.println("customerInserted records are:"+ customerInserted);*/
	
		Scanner sn = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Enter Pro_Id");
		product.setPro_Id(sn.nextInt());
		System.out.println("Enter product Name");
		product.setProName(sn.next());
		System.out.println("Enter product price");
		product.setProPrice(sn.nextDouble());
		System.out.println("Enter product quantity");
		product.setProQuantity(sn.nextInt());
		System.out.println("cust Id");
		product.setCust_Id(sn.nextInt());
		IECommerceApplicationDAO seDAO= new ECommerceApplicationDAO();
		int sellerInserted = seDAO.addSeller(product);
		System.out.println("sellerInserted records are:"+ sellerInserted);
	}

}
