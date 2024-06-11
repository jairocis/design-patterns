package bank.system.joven;

import bank.system.Account;

public class JovenAccount implements Account {

	@Override
	public double getInteres() {
		return 2;
	}

	@Override
	public String getGif() {
		return "Cd Musica";
	}

}
