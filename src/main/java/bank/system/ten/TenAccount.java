package bank.system.ten;

import bank.system.Account;

public class TenAccount implements Account {

	@Override
	public double getInteres() {
		return 1;
	}

	@Override
	public String getGif() {
		return "Reproductor CD";
	}

}
