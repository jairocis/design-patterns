package help.handler;

public class ApplicationFactory {

	public Application create() {
		return Application.getInstance( new Scream( new Button() ));
	}
	
}
