package com.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
//import java.util.Scanner;

public class EmployeeDAO implements IEmployeeDAO {
	Queue<Employee> employeeQueue=new PriorityQueue<Employee>();
	Map<Integer, Employee> empMap = new HashMap<Integer,Employee>();
	
	@Override
	public List<Employee> getEmployee() {
		Employee employee1= new Employee();
		employee1.setEmpId(101);
		employee1.setName("Measho");
		employee1.setSalary(1000);
		employee1.setDeptId(10);
		
		Employee employee2= new Employee();
		employee2.setEmpId(102);
		employee2.setName("Shakir");
		employee2.setSalary(2000);
		employee2.setDeptId(101);
		
		Employee employee3= new Employee();
		employee3.setEmpId(103);
		employee3.setName("Helen");
		employee3.setSalary(3000);
		employee3.setDeptId(12);
		
		Employee employee4= new Employee();
		employee4.setEmpId(104);
		employee4.setName("Hagos");
		employee4.setSalary(4000);
		employee4.setDeptId(14);
		
		//List<Employee> empList = new ArrayList<Employee>();// creating of an object
		List<Employee> empList = new LinkedList<Employee>();
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		return empList;
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> addEmployees(List<Employee> emp) {
		return null;
		//empList.addAll(emp);
		
		
		

	}

	@Override
	public int addEmployeesWithQueue(Queue<Employee> empQueue) {
		
		
		for (Employee employee : empQueue) {   //extracting the Employee from incoming queue
			empQueue.add(employee);  // adding employee to the main queue
		}
		return empQueue.size();  //returning the number of Employee objects added 
	 
	}
	

	@Override
	public Employee findEmployeeById(int eid) {
		Employee emp= new Employee();
		for (Employee employee : employeeQueue) {
		if(employee.getEmpId()==eid) {
			emp.setEmpId(employee.getEmpId());
			emp.setName(employee.getName());
			emp.setSalary(employee.getSalary());
			emp.setDeptId(employee.getDeptId());
			}
		}
		return emp;
	}

	@Override
	public Employee updateEmployeeSalaryWithMap(int keyId, double salary) {
		// TODO Auto-generated method stub
		Employee employee = empMap.get(keyId);// finding the employee object
		employee.setSalary(salary);   // updating emp salary
		return employee;
	}

	@Override
	public int addEmployeesWithMap(int keyID, Employee emp) { // adding Employee object into Map object
		// TODO Auto-generated method stub
		empMap.put(keyID,emp);
		System.out.println("emp\t"+keyID+"\tis added");
		System.out.println(keyID+"\tis updated..");
		return empMap.size();
	  }

	@Override
	public Properties getEmployeesWithProperties() {
		Properties empProp=new Properties();
		try {
			empProp.load(new FileReader("employees.properties"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empProp;
		
	}
	}

