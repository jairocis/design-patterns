package help.handler;

public class Application implements CommandHelp {

	private final Scream scream;
	private static Application instance;
	
	private Application(Scream scream) {
		super();
		this.scream = scream;
	}

	public static Application getInstance(Scream scream) {
		if(instance == null) {
			instance = new Application(scream);
		}
		return instance;
	}
	
	@Override
	public void help() {
		scream.help();
	}

}
