package com.hibernateDAOpractice;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class MyApp {

	public static void main(String[] args) {
		/*Session session = HibernateDBUtil.getDBSession();  // get the session object
		session.beginTransaction();    //making transaction active
//		Employee employee=session.get(Employee.class, 108);   // getting employee info whose id is 108
//		System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary());
		Criteria criteria = session.createCriteria(Employee.class); //criteria is best in retrieving the data from DB
		List<Employee> list = criteria.list();
		for (Employee employee : list) {
			System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID());
		}
		
		session.close(); 
  */
		// getting the data from database
//		IEmployeeDAO empDAO= new EmployeeDAO();
//		List<Employee> empList = empDAO.getEmployees();
		/*for (Employee employee : empList) {
			System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID());		
		}*/
		//Lambda Expression
 //empList.forEach((employee)-> System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID()));
		//addEmployee()
		/*Scanner scan=new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("enter eid");
		employee.setEmpID(scan.nextInt());
		
		System.out.println("enter emp name");
		employee.setName(scan.next());
		
		System.out.println("enter salary");
		employee.setSalary(scan.nextDouble());
		
		System.out.println("enter password");
		employee.setPassword(scan.next());
		
		System.out.println("enter dept id");
		employee.setDeptID(scan.nextInt());
		scan.close();
		IEmployeeDAO empDAO= new EmployeeDAO();
		empDAO.addEmployee(employee);
		System.out.println("success");*/
		//findEmployeeById()
       Scanner scan=new Scanner(System.in);
		System.out.println("enter eid");
		IEmployeeDAO empDAO= new EmployeeDAO();
		Employee employee = empDAO.findEmployeeByID(scan.nextInt());
		System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID());
	    scan.close();
		// get Native SQL
	    /*IEmployeeDAO empDAO= new EmployeeDAO();
		List<Employee> empList = empDAO.getEmployees();
		empList.forEach((employee)-> System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID()));
	*/
		//JOINS
	/*	IEmployeeDAO empDAO= new EmployeeDAO();
		List<Employee> empList = empDAO.getEmployees();
		empList.forEach((employee)-> System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID()+"\t"+employee.getDept().getDeptName()));
	
		*/
	}

}
