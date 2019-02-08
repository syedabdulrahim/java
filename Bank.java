package com.ilp.tcs;

public class Bank {

	public static void main(String[] args) {
		account account1=new account();
		/*
		 * account1.accountNumber=123; account1.accountHolderName="abdul";
		 * account1.balance=100; account1.type="current";
		 */		
		account account2 =new account(12345,"saif",200,"current");
		account account3=new account(account2);
		/*
		 * account2.accountNumber=456; account2.accountHolderName="rahim";
		 * account2.balance=200; account2.type="Savings";
		 */
		 
		System.out.println(account1.accountNumber);
		System.out.println(account1.accountHolderName);
		System.out.println(account1.balance);
		System.out.println(account1.type);
		
		
		System.out.println(account2.accountNumber);
		System.out.println(account2.accountHolderName);
		System.out.println(account2.balance);
		System.out.println(account2.type);
		
		
		System.out.println(account3.accountNumber);
		System.out.println(account3.accountHolderName);
		System.out.println(account3.balance);
		System.out.println(account3.type);
		

	}

}
