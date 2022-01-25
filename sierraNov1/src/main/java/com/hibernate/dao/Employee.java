package com.hibernate.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	    @ManyToOne //the relation between employee and department in many to one 
	    @JoinColumn(name="DEPT_ID",insertable=false,updatable=false )
	    private Department dept;
	    //gettter and setter methods
		public int getEmpID() {
			return empID;
		}
		public Department getDept() {
			return dept;
		}
		public void setDept(Department dept) {
			this.dept = dept;
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
