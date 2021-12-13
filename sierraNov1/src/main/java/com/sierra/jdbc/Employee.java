package com.sierra.jdbc;

public class Employee {
	
		private int empID;
		private String name;
		private double salary;
		private String password;
		private int deptID;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getDeptID() {
			return deptID;
		}
		public void setDeptID(int deptID) {
			this.deptID = deptID;
		}
		
}
