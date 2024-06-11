package bank.system.ten;

import bank.system.Account;
import bank.system.AccountFactory;
import bank.system.CreditCard;
import bank.system.DebitCard;

public class TenAccountFactory implements AccountFactory {

	@Override
	public Account createAccount() {
		return new TenAccount();
	}

	@Override
	public DebitCard createDebitCard() {
		return new TenDebitCard();
	}

	@Override
	public CreditCard createCreditCard() {
		return new TenCreditCard();
	}

}
