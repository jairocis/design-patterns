package bank.system;

public interface AccountFactory {

	Account createAccount();
	DebitCard createDebitCard();
	CreditCard createCreditCard();
	
}
