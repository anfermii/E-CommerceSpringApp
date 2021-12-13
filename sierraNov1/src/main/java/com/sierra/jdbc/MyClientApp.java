package com.sierra.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class MyClientApp {

	public static void main(String[] args) {
		//List<Employee> getEmployees();
		IEmployeeDAO empDAO=new EmployeeDAO();
		List<Employee> employeeList = empDAO.getEmployees();
		/*for (Employee employee : employeeList) {
System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID());
		}*/

		//Lambda expression
		/*IEmployeeDAO empDAO=new EmployeeDAO();  // creating DAO object
		List<Employee> employeeList = empDAO.getEmployees();
employeeList.forEach((employee)-> System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID()));
*/
	//streams are used to filter the data (Filtering)
/*IEmployeeDAO empDAO=new EmployeeDAO();  // creating DAO object
List<Employee> employeeList = empDAO.getEmployees();
             //streams are used to filter the data
Stream<Employee> empFilteredList = employeeList.stream().filter(employee-> employee.getSalary()>1100);
empFilteredList.forEach((employee)-> System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID()));
	*/	
		//int addEmployee(Employee emp);
		/*Employee employee=new Employee();
		Scanner scan=new Scanner(System.in);
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
		
		IEmployeeDAO empDAO=new EmployeeDAO();  // creating DAO object
		int recordsInserted = empDAO.addEmployee(employee);  // calling DAO method
		System.out.println("success... Records Inserted are"+recordsInserted);
		*/
		
		//List<Integer> addEmployees(List<Employee> emp);
		/*List<Employee> employeeList=new ArrayList<Employee>();
		Scanner scan=new Scanner(System.in);
		while(true) {
			Employee employee1 = new Employee();
			System.out.println("enter eid");
			employee1.setEmpID(scan.nextInt());
			
			System.out.println("enter emp name");
			employee1.setName(scan.next());
			
			System.out.println("enter salary");
			employee1.setSalary(scan.nextDouble());
			
			System.out.println("enter password");
			employee1.setPassword(scan.next());
			
			System.out.println("enter dept id");
			employee1.setDeptID(scan.nextInt());
			
			employeeList.add(employee1);
			
			System.out.println("Continue?y/n");
			if(scan.next().equals("n")) {
				break;
			}
		}
		scan.close();
		
		IEmployeeDAO empDAO=new EmployeeDAO();  // creating DAO object
		List<Integer> employees = empDAO.addEmployees(employeeList);
		System.out.println("number of emp records inserted:"+employees.size());
		*/
		//Employee findEmployeeById(int eid);
		
	/*	IEmployeeDAO empDAO=new EmployeeDAO();  // creating DAO object
		Scanner scan=new Scanner(System.in);
		System.out.println("enter eid");
		Employee employee = empDAO.findEmployeeById(scan.nextInt());  // calling DAO method
		System.out.println(employee.getEmpID()+"\t"+employee.getName()+"\t"+employee.getSalary()+"\t"+employee.getPassword()+"\t"+employee.getDeptID());
		scan.close();
		*/
		//Callable statement
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
	IEmployeeDAO empDAO=new EmployeeDAO();  // creating DAO object
	int recordsInserted = empDAO.addEmployee(employee);  // calling DAO method
	System.out.println("success... Records Inserted are"+recordsInserted); */
	}

}
