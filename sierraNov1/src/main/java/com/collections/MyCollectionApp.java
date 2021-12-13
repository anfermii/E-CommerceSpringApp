package com.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class MyCollectionApp {

	public static void main(String[] args) {	
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("please enter employee Id");
		 int empId= sc.nextInt();
		 
		 Scanner sc1= new Scanner(System.in);
		 System.out.println("please enter employee name");
		 String name= sc1.next();
		 
		 Scanner sc2= new Scanner(System.in);
		 System.out.println("please enter employee salary");
		 double salary= sc2.nextDouble();
		 
		 Scanner sc3= new Scanner(System.in);
		 System.out.println("please enter department  Id");
		 int deptId= sc3.nextInt();
		 
		 
		List<Employee>empList= new ArrayList();
		Employee e= new Employee();
		
		
		e.setEmpId(empId);
		e.setName(name);
		e.setSalary(salary);
		e.setDeptId(deptId);
		
		IEmployeeDAO empDAO = new EmployeeDAO();
		empDAO.addEmployees(empList);
		
		
		//cursors--> extract the data from collection similar to foreach. Enumeration(I), Iterator(I) and ListIterator(I)
				//Enumeration can be applied only on top of Legacy classes
		     
				Enumeration enumeration=stack.elements();
				while(enumeration.hasMoreElements()) {
					System.out.println(enumeration.nextElement());
				}

		IEmployeeDAO empDAO = new EmployeeDAO();
		List<Employee>empList=empDAO.getEmployee();
		for (Employee employee : empList) {
		 System.out.println(employee.getEmpId()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId());	
		}
		
		
		// ListIterator--> this is limited to ListFamily(ArrayList,LinkedList), it is a bidirectional
				ListIterator llistItertor = list.listIterator();
				while (llistItertor.hasNext()) {
					System.out.println(llistItertor.next());	
				}
		//IEmployeeDAO empDAO=new EmployeeDAO();  //creating DAO object
		//List<Employee> empList=empDAO.getEmployees();  //calling DAO method
		//Iterator --> universal cursor. can be applied on all tyeps of collections. but it is unidirectional
		Iterator<Employee> empListIterator=empList.iterator();
		while(empListIterator.hasNext()) {
			Employee employee=empListIterator.next();
			System.out.println(employee.getEmpId()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId());
		}
	
	 Iterator <Employee> empListIterator =empList.iterator();
	 while (empListIterator.hasNext()) {
		Employee employee = (Employee) empListIterator.next();
		
		System.out.println(employee.getEmpId()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId());
	}
		IEmployeeDAO empDAO=new EmployeeDAO();  //creating DAO object
		empDAO.addEmployeesWithMap(101, new Employee(101, "101name", 1010, 10));
		int size = empDAO.addEmployeesWithMap(102, new Employee(102, "102name", 1020, 20));
		System.out.println("the size of map\t"+size);
		
		Employee employee = empDAO.updateEmployeeSalaryWithMap(101, 101010);
		System.out.println(employee.getEmpId()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId());
	   IEmployeeDAO empDAO = new EmployeeDAO();
	   empDAO.addEmployeesWithMap(101,new Employee(101, "101name", 1010, 10));
	   int size =empDAO.addEmployeesWithMap(102 ,new Employee(102, "102name", 1020, 20));
	   System.out.println("the size of map\t"+ size);
	  
	   Employee employee = empDAO.updateEmployeeSalaryWithMap(101,101010);
	   System.out.println(employee.getEmpId()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getDeptId());
		*/
		   IEmployeeDAO empDAO = new EmployeeDAO();
	       Properties employeesData= empDAO.getEmployeesWithProperties();
	   // System.out.println(employeesData.getProperty("101"));
	    System.out.println(employeesData);
	}

}
