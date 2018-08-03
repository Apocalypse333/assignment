package Lti.Bank;

public interface Bank {
	void summary();
	double getBalance();
	
	void deposit(double amount);
	void witdraw(double amount) throws BalanceException;
	
	void statement();
	
	int INIT_ACNT_NO = 1001;
	
	double MIN_SAV_BAL = 1000;
	double INIT_CURR_BAL = 5000;
	double OVERDRAFT_AMT = 10000;
	}
