package help.handler;

public class ApplicationMain {
	
	private static ApplicationFactory factory = new ApplicationFactory();
	
	public static void main(String... arg) {
		
		CommandHelp helper = factory.create();
		
		helper.help();
		
	}
}
