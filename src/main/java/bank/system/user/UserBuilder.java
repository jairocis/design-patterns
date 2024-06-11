package bank.system.user;

import bank.system.AccountFactory;
import bank.system.User;
import bank.system.gold.GoldAccountFactory;
import bank.system.joven.JovenAccountFactory;
import bank.system.standard.StandardAccountFactory;
import bank.system.ten.TenAccountFactory;

public class UserBuilder {

	private String name;
	private int age = 0;
	private int salary = 0;
	private int pension = 0;
	
	public static UserBuilder builder() {
		return new UserBuilder();
	}
	
	public UserBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public UserBuilder salary(int salary) {
		this.salary = salary;
		return this;
	}
	
	public UserBuilder pension(int pension) {
		this.pension = pension;
		return this;
	}
	
	public User build() {
		
		AccountFactory factory;
		
		if(age < 26) {
			factory = new JovenAccountFactory();
		}else if( age < 65 && salary > 0 ) {
			factory = new TenAccountFactory();
		}else if(age >= 65 && pension > 0) {
			factory = new GoldAccountFactory();
		} else {
			factory = new StandardAccountFactory();
		}
		
		
		return new User(name, age, salary, pension, factory.createAccount(), factory.createCreditCard(), factory.createDebitCard());
	}
	
}
