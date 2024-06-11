package help.handler;

public class Scream implements CommandHelp {

	private final Button button;
	
	public Scream(Button button) {
		this.button = button;
	}

	@Override
	public void help() {
		button.help();
	}

}
