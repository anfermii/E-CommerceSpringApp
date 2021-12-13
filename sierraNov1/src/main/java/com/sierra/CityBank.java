package com.sierra;

public abstract class CityBank implements Bank{
	

	public static void main(String[] args) {
		

	}

	@Override
	public int createAccount(String name, int id, String pan) {
		// TODO Auto-generated method stub
		System.out.println("account is created");
		return 0;
	}

	@Override
	public boolean creditAmount(int accountNum, double Amount) {
		// TODO Auto-generated method stub
		System.out.println("amount is created");
		return false;
	}

	@Override
	public boolean transferAmount(int fromAccount, int toAccount, double Amount) {
		// TODO Auto-generated method stub
		System.out.println("amount is transferred");
		return false;
	}

	

}
