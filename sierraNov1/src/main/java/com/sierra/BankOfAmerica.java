package com.sierra;



interface ChaseBanks {
	
    int getBalance();
    int BankA=1000;
    int BankB=1500;
    int BankC=2000;

}
class BankA {
	  public int getBalance(){
		return 1000;
	 }
 }
class BankB {
	 public int getBalance(){
			return 0;
		 }
}
class BankC {
	 public int getBalance(){
			return 0;
		 }
}
public class BankOfAmerica {

	public static void main(String[] args) {
		BankA a1 = new BankA();
		a1.getBalance();
		System.out.println(a1.getBalance());
		
		BankB b1 = new BankB();
		b1.getBalance();
		System.out.println(b1.getBalance());
		
		BankC c1 = new BankC();
		c1.getBalance();
		System.out.println(c1.getBalance());
		
		
		

	}

}
