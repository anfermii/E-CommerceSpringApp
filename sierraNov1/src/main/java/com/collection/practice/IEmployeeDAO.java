package com.collection.practice;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public interface IEmployeeDAO {
 List<Employee>getEmployees();
 void addEmployee(Employee emp);
 List<Integer> addEmployees(List<Employee> emp);
 int addEmployeesWithQueue(Queue<Employee> empQueue);
 Employee findEmployeeById(int eid);
 int addEmployeesWithMap(int key, Employee emp);
 Employee updateEmployeesWithMap(int eid, double salary);
}
