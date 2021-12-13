package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;

public interface IEmployeeDAO {
	//List<Employee>empList= new ArrayList();
	List<Employee> getEmployee();
	void addEmployee(Employee emp);
	List<Integer> addEmployees(List<Employee> emp);
	int addEmployeesWithQueue(Queue<Employee> emp);
    Employee findEmployeeById(int eid);
    int addEmployeesWithMap(int key,Employee emp); 
    Employee updateEmployeeSalaryWithMap(int eid, double salary);
    Properties getEmployeesWithProperties();

}
