package com.assignment17ByHibernate;

import java.util.List;

public interface IECommerceApplicationDAO {
	List<Product> getOrders();
	List<Customer> getProducts();
	void addSeller(Product seller);
	void addCustomer(Customer customer);
	List<Product>getOrdersJoinWith();
}
