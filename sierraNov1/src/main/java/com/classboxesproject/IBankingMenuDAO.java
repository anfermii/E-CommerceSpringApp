package com.classboxesproject;

import java.util.List;

public interface IBankingMenuDAO {

	int addcreateAccount( Customer cust, Account acc);
	int creditMoney( int acc_Num,double amount);
	int debitMoney( int acc_Num,double amount);
	int addtransferMoney(int from_Acc, int to_Acc,double amountTransaction );

}
