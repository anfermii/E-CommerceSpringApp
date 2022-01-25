package com.classboxes.ecommercestandalonespringapp;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.classboxes.ecommercestandalonespringapp.dao.Customer;
import com.classboxes.ecommercestandalonespringapp.dao.Product;
import com.classboxes.ecommercestandalonespringapp.service.ECommerceAppService;

@SpringBootApplication
public class ECommercestandalonespringappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(ECommercestandalonespringappApplication.class, args);
		System.out.println("here is the answer");
		/*ECommerceAppService eCommerceAppService = container.getBean(ECommerceAppService.class);
	   List<Product> list = eCommerceAppService.getProducts();
	    for (Product product : list) {
	    	 System.out.println(product.getPro_Id()+"\t"+product.getProName()+"\t"+product.getProPrice()+"\t"+product.getProQuantity()+"\t"+product.getCust_Id());
		}
	    
	     Scanner sc = new Scanner(System.in);
	    Product pro = new Product();
	    System.out.println("enter product id");
	    pro.setPro_Id(sc.nextInt());
	    System.out.println("enter product name");
	    pro.setProName(sc.next());
	    System.out.println("enter product price");
	    pro.setProPrice(sc.nextDouble());
	    System.out.println("enter product quantity");
	    pro.setProQuantity(sc.nextInt());
	    System.out.println("enter customer  id");
	    pro.setCust_Id(sc.nextInt());
	    Product product = eCommerceAppService.addProduct(pro);
	    System.out.println(product.getPro_Id()+"\t"+product.getProName()+"\t"+product.getProPrice()+"\t"+product.getProQuantity()
	    +"\t"+product.getCust_Id()); 
	    // get customer
	    List<Customer> list = eCommerceAppService.getCustomers();
	    for (Customer customer : list) {
System.out.println(customer.getCust_Id()+"\t"+customer.getCust_FName()+"\t"+customer.getCust_LName()+"\t"+customer.getPhoneNumber()+"\t"+customer.getEmail());			
		}
	    Scanner sc = new Scanner(System.in);
	    Customer cust = new Customer();
	    System.out.println("enter cust id");
	    cust.setCust_Id(sc.nextInt());
	    System.out.println("enter cust fname ");
	    cust.setCust_FName(sc.next());
	    System.out.println("enter cust lname");
	    cust.setCust_LName(sc.next());
	    System.out.println("enter cust phone");
	    cust.setPhoneNumber(sc.nextInt());
	    System.out.println("enter cust email");
	    cust.setEmail(sc.next());
	    Customer customer = eCommerceAppService.addCustomer(cust);
System.out.println(customer.getCust_Id()+"\t"+customer.getCust_FName()+"\t"+customer.getCust_LName()+"\t"+customer.getPhoneNumber()+"\t"+customer.getEmail());	
	   	
	   Optional<Product> pro = eCommerceAppService.findProductById(1);
	   if(pro.isPresent()) {
	  Product product = pro.get();
	    	 System.out.println(product.getPro_Id()+"\t"+product.getProName()+"\t"+product.getProPrice()+"\t"+product.getProQuantity()+"\t"+product.getCust_Id());
		}
	  Optional<Customer> cust = eCommerceAppService.findCustomerById(21);
	    if(cust.isPresent()) {
	    	Customer customer = cust.get();
	    	System.out.println(customer.getCust_Id()+"\t"+customer.getCust_FName()+"\t"+customer.getCust_LName()+"\t"+customer.getPhoneNumber()+"\t"+customer.getEmail());
	    }*/ 
	   }
	}


