package constructorMethodOverloading;

public class Bank {

	public static void main(String[] args) {
		
		
		
		Account s1=new Account(12345,"Rahim",5000,"Savings");
		Account s2=new Account(12345,"Abdul");
		
		
		System.out.println(s1.accountHolderName);
		System.out.println(s1.accountNumber);
		System.out.println(s1.balance);
		System.out.println(s1.type);
	
		//Bank bank=new Bank();
		
		System.out.println(s2.accountHolderName);
		System.out.println(s2.accountNumber);
		System.out.println(s2.balance);
		System.out.println(s2.type);
		
		
		double totalamt=calculateIntrest(s1.balance,5);
		s1.balance=totalamt;
		
		System.out.println(s1.balance);
		
	}
	public static  double calculateIntrest(double principle,double rate) {
		
		double intrestAmount;
		intrestAmount=principle+principle*rate/100;
		return intrestAmount;
		
	}

	

}
