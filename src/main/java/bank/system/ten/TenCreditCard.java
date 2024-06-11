package bank.system.ten;

import bank.system.CreditCard;
import bank.system.User;

public class TenCreditCard implements CreditCard {

	private static final int BASE_QUOTA = 18000;

	@Override
	public int getQuota(User user) {
		return (int) (BASE_QUOTA + (user.getSalary() * 0.6));
	}

	@Override
	public int getCost() {
		return 0;
	}

}
