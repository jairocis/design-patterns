package bank.system;

import bank.system.user.UserBuilder;

public class BankSystemMain {

	public static void main(String...arg) {
		
		User joven = UserBuilder.builder().name("Andres").age(20).build();
		print(joven);
		User gold = UserBuilder.builder().name("Roberto").age(72).pension(4800000).build();
		print(gold);
		User ten = UserBuilder.builder().name("Sandra").age(38).salary(7800000).build();
		print(ten);
		User standard1 = UserBuilder.builder().name("Armando").age(38).build();
		print(standard1);
		User standard2 = UserBuilder.builder().name("Sonia").age(79).build();
		print(standard2);
		
	}

	private static void print(User user) {
		System.out.println("name :"+user.getName());
		System.out.println("   account :"+user.getAccount().getClass());
		System.out.println("   gif :"+user.getAccount().getGif());
		System.out.println("   debit card :"+user.getDebitCard().getClass());
		System.out.println("   credit card :"+ (user.getCreditCard()==null ? "N/A" : user.getCreditCard().getClass()));
		System.out.println();
		
	}
	
}
