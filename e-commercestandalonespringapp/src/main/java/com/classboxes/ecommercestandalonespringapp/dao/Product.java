package com.classboxes.ecommercestandalonespringapp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="PRO_ID")
	private int pro_Id;
	@Column(name="PRONAME")
	private String proName;
	@Column(name="PROPRICE")
	private double proPrice;
	@Column(name="PROQUANTITY")
	private int proQuantity;
	@Column(name="CUST_ID")
	private int cust_Id;
	public int getPro_Id() {
		return pro_Id;
	}
	public void setPro_Id(int pro_Id) {
		this.pro_Id = pro_Id;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public int getProQuantity() {
		return proQuantity;
	}
	public void setProQuantity(int proQuantity) {
		this.proQuantity = proQuantity;
	}
	public int getCust_Id() {
		return cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}	
}
