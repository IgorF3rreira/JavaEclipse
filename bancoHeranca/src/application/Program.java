package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		Account acc2 = new SavingAccount(1001, "Alex", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAcount(1001, "Alex", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
