package grouping.elements;

import java.util.List;

public class Point extends BaseElement {

	public Point(String name, int x, int y, boolean isSelected) {
		super(name, x, y, isSelected);
	}

	@Override
	public List<Element> getGroup() {
		return List.of(this);
	}

}
