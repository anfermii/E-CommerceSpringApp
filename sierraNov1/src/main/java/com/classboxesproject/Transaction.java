package com.classboxesproject;

import java.sql.Date;

public class Transaction {
	private int transaction_Id;
	private int from_Acc;
	private int to_Acc;
	private double AmountTransaction;
	private Date dateOfTransaction;
	public int getTransaction_Id() {
		return transaction_Id;
	}
	public void setTransaction_Id(int transaction_Id) {
		this.transaction_Id = transaction_Id;
	}
	public int getFrom_Acc() {
		return from_Acc;
	}
	public void setFrom_Acc(int from_Acc) {
		this.from_Acc = from_Acc;
	}
	public int getTo_Acc() {
		return to_Acc;
	}
	public void setTo_Acc(int to_Acc) {
		this.to_Acc = to_Acc;
	}
	
	public double getAmountTransaction() {
		return AmountTransaction;
	}
	public void setAmountTransaction(double amountTransaction) {
		AmountTransaction = amountTransaction;
	}
	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

}
