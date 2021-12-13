package com.collection.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MyCollectionAppPractice {

	public static void main(String[] args) {
		
//		IEmployeeDAO empDAO = new EmployeeDAO();
//		 List<Employee> empList = empDAO.getEmployees();
//		 for (Employee employee : empList) {
//			System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId());
//		}
		
//		IEmployeeDAO empDAO = new EmployeeDAO();
//		 List<Employee> empList = empDAO.getEmployees();
//		 Iterator empListIterator = empList.iterator();
//		 while(empListIterator.hasNext()) {
			 //Employee employee=empListIterator.next();
			 //System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId());
		
		//queue
		
		// Map
		IEmployeeDAO empDAO = new EmployeeDAO();   
		empDAO.addEmployeesWithMap(101, new Employee(101,"101name", 1010, 10));
		int size = empDAO.addEmployeesWithMap(102, new Employee(102,"102name", 1020, 20));
		System.out.println("the size of map"+size);
		
		Employee employee = empDAO.updateEmployeesWithMap(101, 101010);
		System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId());
	
		
	   }
	}


