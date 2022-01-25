package com.classboxesproject;

import java.util.Random;

class Account {
		private int acc_Num;
		private String acc_Type;
		private double amount;
		
		
		public Account() {
			super();
			Random rand= new Random();
			acc_Num=rand.nextInt(1000);
		}
		public int getAcc_Num() {
			return acc_Num;
		}
		public void setAcc_Num(int acc_Num) {
			this.acc_Num = acc_Num;
		}
		public String getAcc_Type() {
			return acc_Type;
		}
		public void setAcc_Type(String acc_Type) {
			this.acc_Type = acc_Type;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
	   
	}
