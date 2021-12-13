package com.collection.practice;

public class Employee {
	private int empID;
	private String name;
	private double salary;
	private int deptId;
	public Employee() {
		
	}
	public Employee(int empID,String name,double salary,int deptId) {
		this.empID=empID;
		this.name=name;
		this.salary=salary;
		this.deptId=deptId;
		
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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
