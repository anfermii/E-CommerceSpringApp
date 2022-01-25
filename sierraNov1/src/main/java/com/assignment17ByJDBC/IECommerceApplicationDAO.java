package com.assignment17ByJDBC;

import java.util.List;

public interface IECommerceApplicationDAO {
	List<Customer> getCustomers();
	List<Product> getOrders();
	int addCustomer(Customer cust);
	int addSeller(Product pro);
}
