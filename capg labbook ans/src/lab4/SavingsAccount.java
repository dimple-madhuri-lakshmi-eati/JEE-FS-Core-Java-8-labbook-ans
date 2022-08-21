package lab4;

public class SavingsAccount extends Account{
	
	public SavingsAccount(long accNum, double balance, Person1 accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	final double min_Bal=500;
	public void withdraw(double amt) {
		if(amt>min_Bal) {
			System.out.println("Insufficient Balance!!");
		}
		else {
			balance=balance-amt;
			System.out.println("current bal after withdrawing "+amt+" is:"+balance);
		}
	}

}
