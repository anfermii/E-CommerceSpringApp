package com.assignment17ByJDBC;

public class Customer {
private int cust_Id;
private String cust_FName;
private String cust_LName;
private int phoneNumber;
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
