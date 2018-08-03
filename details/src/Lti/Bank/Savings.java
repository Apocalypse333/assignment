package Lti.Bank;



public class Savings extends Account {



	public Savings() {

	}



	public Savings(String holder) {

		super(holder, MIN_SAV_BAL);

	}



	@Override

	public void witdraw(double amount) throws BalanceException {



		if (amount <= (balance - MIN_SAV_BAL)) {



			balance -= amount;

			txns[idx++] = new Transaction("Dr", amount, balance);

		} else

			throw new BalanceException("Insufficient funds!");



	}



}