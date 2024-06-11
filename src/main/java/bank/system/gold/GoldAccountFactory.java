package bank.system.gold;

import bank.system.Account;
import bank.system.AccountFactory;
import bank.system.CreditCard;
import bank.system.DebitCard;

public class GoldAccountFactory implements AccountFactory {

	@Override
	public Account createAccount() {
		return new GoldAccount();
	}

	@Override
	public DebitCard createDebitCard() {
		return new GoldDebitCard();
	}

	@Override
	public CreditCard createCreditCard() {
		return new GoldCreditCard();
	}

}
