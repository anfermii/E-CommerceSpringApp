package com.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;


public class EmployeeDAO implements IEmployeeDAO{
	 Queue<Employee> employeeQueue=new PriorityQueue<Employee>();
	 Map<Integer,Employee> empMap= new HashMap();
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		employee1.setEmpID(101);
		employee1.setName("measho");
		employee1.setSalary(1000);
		employee1.setDeptId(10);
		
		Employee employee2 = new Employee();
		employee2.setEmpID(102);
		employee2.setName("Shakir");
		employee2.setSalary(2000);
		employee2.setDeptId(11);
		
		Employee employee3 = new Employee();
		employee3.setEmpID(103);
		employee3.setName("Helen");
		employee3.setSalary(1500);
		employee3.setDeptId(12);
		
		Employee employee4 = new Employee();
		employee4.setEmpID(104);
		employee4.setName("James");
		employee4.setSalary(2500);
		employee4.setDeptId(13);
		//assume the data (100 employees) coming from database
		List<Employee> empList = new ArrayList<>();
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addEmployeesWithQueue(Queue<Employee> empQueue) {
		 for (Employee employee : empQueue) {
			employeeQueue.add(employee);
		}
		 return employeeQueue.size();
	}

	@Override
	public Employee findEmployeeById(int eid) {
		// TODO Auto-generated method stub
		Employee emp= new Employee();
		for (Employee employee : employeeQueue) {
			if(employee.getEmpID()==eid) {
				emp.setEmpID(employee.getEmpID());	
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				emp.setDeptId(employee.getDeptId());
		}
		
	}
		return emp;
	}

	@Override
	public Employee updateEmployeesWithMap(int keyId, double salary) {
		// TODO Auto-generated method stub
		Employee employee = empMap.get(keyId);
		employee.setSalary(salary);
		System.out.println(keyId+"\tis updated..");
		return employee;
	}

	@Override
	public int addEmployeesWithMap(int key, Employee emp) {
		empMap.put(key,emp);
		System.out.println("emp\t"+key+"\tis added");
		return empMap.size();
	}
}
