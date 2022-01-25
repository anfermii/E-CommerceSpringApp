package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//entity/model/POJO
//ORM   Object Relational Mapping maps Java properties with database properties
@Entity
@Table(name="employee")
public class Employee {
	    @Id
	    @Column(name="EMP_ID")
		private int empID;
	    @Column(name="EMPNAME")
		private String name;
	    @Column(name="SALARY")
		private double salary;
	    @Column(name="PASSWORD")
		private String password;
	    @Column(name="DEPT_ID")
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
