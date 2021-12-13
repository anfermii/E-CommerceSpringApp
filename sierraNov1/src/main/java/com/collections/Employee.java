package com.collections;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private int deptId;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, double salary, int deptId) {
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		this.deptId=deptId;
	}


	public int getEmpId() {
		return empId;
	}
	
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
		
}
