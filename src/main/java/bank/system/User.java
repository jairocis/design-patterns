package bank.system;

public class User {

	private String name;
	private int age;
	private int salary;
	private int pension;
	private Account account;
	private CreditCard creditCard;
	private DebitCard debitCard;
	
	public User(String name, int age, int salary, int pension, Account account, CreditCard creditCard, DebitCard debitCard) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.pension = pension;
		this.account = account;
		this.creditCard = creditCard;
		this.debitCard = debitCard;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public int getPension() {
		return pension;
	}

	public Account getAccount() {
		return account;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public DebitCard getDebitCard() {
		return debitCard;
	}
	
	
	
}
