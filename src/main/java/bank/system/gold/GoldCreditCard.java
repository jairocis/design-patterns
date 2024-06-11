package bank.system.gold;

import bank.system.CreditCard;
import bank.system.User;

public class GoldCreditCard implements CreditCard {

	@Override
	public int getQuota(User user) {
		return (int) (user.getPension() * 0.6);
	}

	@Override
	public int getCost() {
		return 0;
	}

}
