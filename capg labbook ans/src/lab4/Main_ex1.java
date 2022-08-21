package lab4;

import java.util.Random;

public class Main_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random(); 
		int n = 10000000 + rd.nextInt(900000);
		Account smith=new SavingsAccount(n,2000,new Person1("smith",26));
		Account kathy=new CurrentAccount(n,3000,new Person1("kathy",23));
		smith.deposit(2000);
		kathy.withdraw(2000);
		System.out.println("smith's balance: "+smith.getBalance());
		System.out.println("kathy's balance: "+kathy.getBalance());
	}

}
