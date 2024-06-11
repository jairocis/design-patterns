package grouping.elements;

abstract class BaseElement implements Element {

	private final String name;
	private int x;
    private final int y;
    private boolean isSelected;
    
	public BaseElement(String name, int x, int y, boolean isSelected) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.isSelected = isSelected;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public void setLevel(int level) {
		x=level;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void select() {
		isSelected = true;
		
	}

	@Override
	public void unSelect() {
		isSelected = false;
	}

	@Override
	public boolean isSelected() {
		return isSelected;
	}
	
	@Override
	public void paint(int level) {
		System.out.println("  ".repeat(level).concat(getName()));
	}
	

}
