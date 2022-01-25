package com.hibernate.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class EmployeeHibernateClient {

	public static void main(String[] args) {
	/*	IEmployeeDAO empDAO=new EmployeeDAO();
		List<Employee> empList = empDAO.getEmployees(); // calling DAO method
//Lambda Expression
empList.forEach((employee)-> System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID()));
 */
		// addEmployee()
		/*Scanner scan=new Scanner(System.in);
		Employee employee=new Employee();
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
		IEmployeeDAO empDAO=new EmployeeDAO();
		empDAO.addEmployee(employee);
		System.out.println("success");*/
		
		//findemployeebyId
		/*Scanner scan=new Scanner(System.in);
		System.out.println("enter eid");
		IEmployeeDAO empDAO=new EmployeeDAO();
		Employee employee = empDAO.findEmployeeByID(scan.nextInt());
		System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID());
	*/
		// Native query or native sql
		/*IEmployeeDAO empDAO=new EmployeeDAO();
		List<Employee> empList = empDAO.getEmployees(); // calling DAO method
		//Lambda Expression
		empList.forEach((employee)->System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID()));
		*/
		//addinemployeejoin with
		IEmployeeDAO empDAO=new EmployeeDAO();
		List<Employee> empList = empDAO.getEmployeesWithJoin(); // calling DAO method
		//Lambda Expression
		empList.forEach((employee)->System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID()+"\t"+employee.getDept().getDeptName()));
	
	}

}
