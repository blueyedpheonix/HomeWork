package entities;

import utils.idGenerator;

public class Account {
	private final int ID;
	private double balance;
	
	public Account(double balance) {
		this.ID = idGenerator.getAccountID();
		this.balance = balance;
	}
	
	public Account() {
		this(0);
	}

	public double getBalance() {
		return balance;
	}
	public int getID() {
		return ID;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
