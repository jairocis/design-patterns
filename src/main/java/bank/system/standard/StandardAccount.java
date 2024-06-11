package bank.system.standard;

import bank.system.Account;

public class StandardAccount implements Account {

	@Override
	public double getInteres() {
		return 0.5;
	}

	@Override
	public String getGif() {
		return null;
	}

}
