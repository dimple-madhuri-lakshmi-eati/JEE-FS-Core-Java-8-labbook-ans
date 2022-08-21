package lab4;

public class CurrentAccount extends Account{
	public CurrentAccount(long accNum, double balance, Person1 accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	double overdraft_limit=20000;
	public void withdraw(double amt) {
		if(amt>overdraft_limit) {
			System.out.println("over draft limit is exceeded !!");
		}
		else {
			balance=balance-amt;
			System.out.println("current bal after withdrawing "+amt+" is:"+balance);
		}
	}
}
