package bank.system.standard;

import bank.system.DebitCard;

public class StandardDebitCard implements DebitCard {

	@Override
	public int getCost() {
		return 20000;
	}

}
