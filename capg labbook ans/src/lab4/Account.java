package lab4;

public class Account {

		long accNum;
		double balance;
		Person1 accHolder;
		
		public void deposit(double amt){
			balance=balance+amt;
			System.out.println("current bal after depositing "+amt+" is:"+balance);

	    }
		public void withdraw(double amt) {
			balance=balance+amt;
			System.out.println("current bal after withdrawing "+amt+" is:"+balance);
		}
		public double getBalance() {
			return balance;
		}
		public Account(long accNum, double balance, Person1 accHolder) {
			super();
			this.accNum = accNum;
			this.balance = balance;
			this.accHolder = accHolder;
		}
}
