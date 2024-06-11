package grouping.elements;

import java.util.List;

public class Circle extends BaseElement {

	public Circle(String name, int x, int y, boolean isSelected) {
		super(name, x, y, isSelected);
	}

	@Override
	public List<Element> getGroup() {
		return List.of(this);
	}
}
