package Lti.Bank;

public class CurrentTranscation extends Transaction {

	private double overdraft;

	public CurrentTranscation() {

	}

	public CurrentTranscation(String type, double amount, double balance, double overdraft) {
		super(type, amount, balance);
		this.overdraft = overdraft;
	}

	public String toString() {

		return type + "\t" + amount + "\t" + balance + "\t" + overdraft;

	}

}