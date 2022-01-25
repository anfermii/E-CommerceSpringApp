package com.hibernateDAOpractice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class EmployeeDAO implements IEmployeeDAO{

	@Override
	public List<Employee> getEmployees() {
		Session session = HibernateDBUtil.getDBSession();
		session.beginTransaction();
		//Query query = session.createQuery("from Employee");
		//List<Employee> empList = query.getResultList();
		NativeQuery query = session.createSQLQuery("select * from EMPLOYEE");
		query.addEntity(Employee.class);
		List<Employee> empList = query.list();
		session.close();
		return empList;
	}

	@Override
	public void addEmployee(Employee employee) {
		Session session = HibernateDBUtil.getDBSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(employee);
		transaction.commit();
		session.close();
		
	}

	@Override
	public int updateEmployee(Employee employee) {
		
		return 0;
	}

	@Override
	public Employee findEmployeeByID(int employeeID) {
		Session session = HibernateDBUtil.getDBSession();
		session.beginTransaction();
		Query query = session.createQuery("from Employee where empID=?1 ");
		query.setParameter(1, employeeID);
		Employee emp=(Employee) query.getSingleResult();
		session.close();
		return null;
	}

	@Override
	public Employee deleteEmployeeByID(int empID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesWithJoin() {
		Session session = HibernateDBUtil.getDBSession();
		session.beginTransaction();
		Query query = session.createQuery("from Employee");
		List<Employee> empList = query.getResultList();
		session.close();
		return empList;
	}

}
