package com.hibernate.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public List<Employee> getEmployees() {
		Session session=HibernateDBUtil.getDBSession();  //getting the session object
		session.beginTransaction();  
		//HQL = hibernate query language to represent the queries with java objects
		//from Employee=select *from employee;
		//Query query = session.createQuery("from Employee");  //executing HQL
		//List<Employee> empList = query.getResultList();  // taking the return into List
		//Native Quesry or Native Sql
		NativeQuery query = session.createSQLQuery("select *from EMPLOYEE");
		query.addEntity(Employee.class);
		List<Employee> empList = query.list();
		session.close();
		return empList;
	
	}

	@Override
	public void addEmployee(Employee employee) {
		Session session=HibernateDBUtil.getDBSession();  //getting the session object
		Transaction transaction = session.beginTransaction();   // beginning the transaction
		session.saveOrUpdate(employee);  // saves/update
		transaction.commit();  //commit=perma stores the data
		session.close();	
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee findEmployeeByID(int employeeID) {
		Session session=HibernateDBUtil.getDBSession();  //getting the session object
		session.beginTransaction();  
		//HQL = hibernate query language to represent the queries with java objects
		//from Employee=select *from employee;
		Query query = session.createQuery("from Employee where empID=?1");  //executing HQL
		query.setParameter(1, employeeID);
		Employee emp = (Employee) query.getSingleResult();  // taking the return into Employee Object
		session.close();
		return emp;
		
	}

	@Override
	public Employee deleteEmployeeByID(int empID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesWithJoin() {
		Session session=HibernateDBUtil.getDBSession();  //getting the session object
		session.beginTransaction(); 
		Query query = session.createQuery("from Employee");
		List<Employee> empList = query.getResultList();
		session.close();
		return empList;
	}


	

}
