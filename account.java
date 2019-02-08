package com.ilp.tcs;

public class account {
	int accountNumber;
	String accountHolderName;
	double balance;
	String type;
	
	account(){                              //default constructor
		accountNumber=1234;
		accountHolderName="abdul";
		balance=100;
		type="savings";
	}
	
	account(int accountNum,String accountHolderNme,double bal,String typ){  // Paramaterised Constructor
		
		this.accountNumber=accountNum;
		this.accountHolderName=accountHolderNme;
		this.balance=bal;
		this.type=typ;
		
		
	}
	
	account(account account){  // copying contents of one object to other using constructor
		
		this.accountHolderName=account.accountHolderName;
		this.accountNumber=account.accountNumber;
		this.balance=account.balance;
		this.type=account.type;
		
	}
}
