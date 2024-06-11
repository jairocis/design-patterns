package bank.system.gold;

import bank.system.Account;

public class GoldAccount implements Account {

	@Override
	public double getInteres() {
		return 1.5;
	}

	@Override
	public String getGif() {
		return "Seguro";
	}

}
