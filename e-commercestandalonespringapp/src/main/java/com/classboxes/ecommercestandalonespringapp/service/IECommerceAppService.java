package com.classboxes.ecommercestandalonespringapp.service;

import java.util.List;
import java.util.Optional;

import com.classboxes.ecommercestandalonespringapp.dao.Customer;
import com.classboxes.ecommercestandalonespringapp.dao.Product;

public interface IECommerceAppService {
List<Product> getProducts();
Product addProduct(Product pro);
List<Customer> getCustomers();
Customer addCustomer(Customer cust);
//void findProductById(int pro_Id);
Optional<Product> findProductById(int pro_Id);
Optional<Customer> findCustomerById(int cust_Id);
}
