package Lti.Bank;

public class Current extends Account {

	protected double overdraft = 10000;

	public Current() {
	}

	public Current(String holder) {
		super(holder, 5000);
	}

	@Override
	public void witdraw(double amount) throws BalanceException {
		if (amount < (balance + overdraft)) {
			if(balance<5000) {
				balance -= amount;
			}
		
		}
		else if ((balance + overdraft) < amount)
			
			System.out.println("Insuficient funds");
	}

	@Override
	public void deposit(double amount) {
	}

}
