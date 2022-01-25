package com.classboxes.ecommercestandalonespringapp.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.classboxes.ecommercestandalonespringapp.dao.Customer;
import com.classboxes.ecommercestandalonespringapp.dao.IECommerceAppDAO;
import com.classboxes.ecommercestandalonespringapp.dao.IECommerceAppDAO2;
import com.classboxes.ecommercestandalonespringapp.dao.Product;

@Component
public class ECommerceAppService implements IECommerceAppService {
@Autowired
IECommerceAppDAO ecpDAO;
@Autowired
IECommerceAppDAO2 eccDAO;
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return ecpDAO.findAll();
	}
	@Override
	public Product addProduct(Product pro) {
		// TODO Auto-generated method stub
		return ecpDAO.save(pro);
	}
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return eccDAO.findAll();
	}
	@Override
	public Customer addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return eccDAO.save(cust);
	}
//	@Override
//	public void findProductById(int pro_Id) {
//		
//		
//	}
	@Override
	public Optional<Product> findProductById(int pro_Id) {
		// TODO Auto-generated method stub
		return ecpDAO.findById(pro_Id);
	}
	@Override
	public Optional<Customer> findCustomerById(int cust_Id) {
		// TODO Auto-generated method stub
		return eccDAO.findById(cust_Id);
	}
	

}
