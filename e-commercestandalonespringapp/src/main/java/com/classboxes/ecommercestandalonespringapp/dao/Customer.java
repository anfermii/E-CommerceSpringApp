package com.classboxes.ecommercestandalonespringapp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
@Column(name="CUST_ID")
private int cust_Id;
@Column(name="CUST_FNAME")
private String cust_FName;
@Column(name="CUST_LNAME")
private String cust_LName;
@Column(name="PHONENUMBER")
private int phoneNumber;
@Column(name="EMAIL")
private String email;
public int getCust_Id() {
	return cust_Id;
}
public void setCust_Id(int cust_Id) {
	this.cust_Id = cust_Id;
}
public String getCust_FName() {
	return cust_FName;
}
public void setCust_FName(String cust_FName) {
	this.cust_FName = cust_FName;
}
public String getCust_LName() {
	return cust_LName;
}
public void setCust_LName(String cust_LName) {
	this.cust_LName = cust_LName;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
