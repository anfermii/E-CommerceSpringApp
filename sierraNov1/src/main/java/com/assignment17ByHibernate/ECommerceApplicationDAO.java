package com.assignment17ByHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ECommerceApplicationDAO implements IECommerceApplicationDAO{

	@Override
	public List<Product> getOrders() {
		Session session = HibernateDBUtil.getDBSession();
		session.beginTransaction();
		Query query = session.createQuery("from Product");
		List<Product>orderList = query.getResultList();
		session.close();
		return orderList;
	}

	@Override
	public List<Customer> getProducts() {
	 Session session = HibernateDBUtil.getDBSession();
	 session.beginTransaction();
	 Query query = session.createQuery("from Customer");
	 List customerList = query.getResultList();
	 return customerList;
	}

	@Override
	public void addSeller(Product seller) {
	Session session = HibernateDBUtil.getDBSession();
	Transaction transaction = session.beginTransaction();
	session.saveOrUpdate(seller);
	transaction.commit();
	session.close();	
	}

	@Override
	public void addCustomer(Customer customer) {
		Session session = HibernateDBUtil.getDBSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(customer);
		transaction.commit();
		session.close();
	}
	@Override
	public List<Product> getOrdersJoinWith() {
		Session session=HibernateDBUtil.getDBSession();
		session.beginTransaction();
		Query query = session.createQuery("from Product");
		List<Product> orderList = query.getResultList();
		return orderList;
	}

}
