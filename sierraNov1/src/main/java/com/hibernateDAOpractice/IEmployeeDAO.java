package com.hibernateDAOpractice;

import java.util.List;

public interface IEmployeeDAO {
 List<Employee> getEmployees();
 void addEmployee(Employee employee);
 int updateEmployee(Employee employee);
 Employee findEmployeeByID(int employeeID);
 Employee deleteEmployeeByID(int employeeID);
 List<Employee> getEmployeesWithJoin();
}
