package bank.system.standard;

import bank.system.Account;
import bank.system.AccountFactory;
import bank.system.CreditCard;
import bank.system.DebitCard;

public class StandardAccountFactory implements AccountFactory {

	@Override
	public Account createAccount() {
		return new StandardAccount();
	}

	@Override
	public DebitCard createDebitCard() {
		return new StandardDebitCard();
	}

	@Override
	public CreditCard createCreditCard() {
		return null;
	}

}
