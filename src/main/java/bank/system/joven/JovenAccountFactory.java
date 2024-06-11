package bank.system.joven;

import bank.system.Account;
import bank.system.AccountFactory;
import bank.system.CreditCard;
import bank.system.DebitCard;

public class JovenAccountFactory implements AccountFactory {

	@Override
	public Account createAccount() {
		return new JovenAccount();
	}

	@Override
	public DebitCard createDebitCard() {
		return new JovenDebitCard();
	}

	@Override
	public CreditCard createCreditCard() {
		return null;
	}

}
