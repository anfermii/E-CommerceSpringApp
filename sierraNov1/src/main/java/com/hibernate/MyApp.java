package com.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class MyApp {

	public static void main(String[] args) {
		Session session = HibernateDBUtil.getDBSession();  // get the session object
		session.beginTransaction();    //making transaction active
//		Employee employee=session.get(Employee.class, 108);   // getting employee info whose id is 108
//		System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary());
		Criteria criteria = session.createCriteria(Employee.class); //criteria is best in retrieving the data from DB
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID());
		}
		
		session.close(); 

	}

}
