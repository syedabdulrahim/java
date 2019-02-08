package com.ilp.tcs;

public class account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private String type;
	
	
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
	/*
	account(account account){  // copying contents of one object to other using constructor
		
		this.accountHolderName=account.accountHolderName;
		this.accountNumber=account.accountNumber;
		this.balance=account.balance;
		this.type=account.type;
		
	}*/
	
	int getaccountNumber() {                                 //getter
		return this.accountNumber;
	}
	
	String getsccountHolderName() {                            //getter
		return this.accountHolderName;
	}
	
	double getbalance() {										//getter
		return this.balance;
	}
	
	String gettype() {											//getter						
		return this.type;
	}
	
	 void setaccountNumber(int num){                            // Setter
		this.accountNumber=num;
	}
	
	 void setaccounterHolderName(String name) {					// Setter
		 this.accountHolderName=name;
		 }
	 void setbalance(double bal) {									// Setter
		 this.balance=bal;
	 }
	void settype(String typ) {										// Setter
		this.type=typ;
	}
	
}
