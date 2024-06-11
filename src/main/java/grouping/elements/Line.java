package grouping.elements;

import java.util.List;

public class Line extends BaseElement {

	public Line(String name, int x, int y, boolean isSelected) {
		super(name, x, y, isSelected);
	}

	@Override
	public List<Element> getGroup() {
		return List.of(this);
	}

}
