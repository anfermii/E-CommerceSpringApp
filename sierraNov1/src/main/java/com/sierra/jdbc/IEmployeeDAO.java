package com.sierra.jdbc;

import java.util.List;
import java.util.Properties;
import java.util.Queue;


public interface IEmployeeDAO {
	List<Employee> getEmployees();
	int addEmployee(Employee emp);
	List<Integer> addEmployees(List<Employee> emp);
	int addEmployeesWithQueue(Queue<Employee> emp);
	Employee findEmployeeById(int eid);
	int addEmployeesWithMap(int key, Employee emp);
	Employee updateEmployeeSalaryWithMap(int eid, double salary);
	Properties getEmployeesWithProperties();
}
