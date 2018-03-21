
public class Account {

	private String name;
	private double balance;

	public Account(String s) {

	name = s;
	//balance = 0.0;
	
	}

	public void credit(double i) {

	balance += i;

	}

	public void debit(double i) {

	if (balance - i >= 0) {

	balance -= i;

	}

	else {

	System.out.println("This transaction is not possible!");

	}
	}

	public double showBalance() {

	return balance;

	}

	}
