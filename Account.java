package constructorMethodOverloading;

public class Account {
	
	 int accountNumber;
	 String accountHolderName;
	 double balance;
	 String type;
	 
	 Account(int accountNum,String accountHolderNme,double bal,String typ){  // Paramaterised Constructor
			
			this.accountNumber=accountNum;
			this.accountHolderName=accountHolderNme;
			this.balance=bal;
			this.type=typ;
	 }
	 Account(int accountNumber,String AccountHolderName){
		 this.accountNumber=accountNumber;
		 this.accountHolderName=AccountHolderName;
		 balance=5000;
		 type="Current";
	 }
	
}
