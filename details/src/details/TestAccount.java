package details;

import Lti.Bank.AccountFactory;
import Lti.Bank.BalanceException;
import Lti.Bank.Bank;

public class TestAccount {

	public static void main(String[] args) {

		Bank sav = AccountFactory.openAccount("savings", "Polo");

		sav.summary();

		sav.deposit(2000);

		sav.deposit(4000);

		try {
			sav.witdraw(3000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}

		try {
			sav.witdraw(7000);
		} catch (BalanceException e) {
//			e.printStackTrace();  // for Developers to troubleshoot
			System.out.println(e); // for logging purpose
//			System.out.println(e.getMessage()); // for end-users
			
		}

		sav.statement();

	

		
	}

}