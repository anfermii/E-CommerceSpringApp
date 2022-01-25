package com.hibernate.dao;

import java.util.List;

public interface IEmployeeDAO {
 List<Employee> getEmployees();
 void addEmployee(Employee employee);
 int updateEmployee(Employee employee);
 Employee findEmployeeByID(int empID);
 Employee deleteEmployeeByID(int empID);
 List<Employee> getEmployeesWithJoin();
}
