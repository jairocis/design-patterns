package grouping.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsGroup extends BaseElement {

	private List<Element> elementGroup = new ArrayList<>();
	
	public ElementsGroup(String name, int x, int y, boolean isSelected) {
		super(name, x, y, isSelected);
	}
	
	public void add(Element...elements) {
		add(Arrays.asList(elements));
	}

	@Override
	public void paint(int level) {
		System.out.println("  ".repeat(level).concat(getName()));
		elementGroup.stream().forEach(e->{e.paint(level+1);});
		System.out.println("  ".repeat(level).concat(getName()));
	}
	
	@Override
	public List<Element> getGroup() {
		return elementGroup;
	}
	
	public void remove(Element e) {
		elementGroup.remove(e);
	}


	public void add(Element element) {
		element.setLevel(getX()+1);
		elementGroup.add(element);
	}

	public void add(List<Element> elementGroup2) {
		elementGroup2.forEach(e->setLevel(getX()+1));
		elementGroup.addAll(elementGroup2);
	}
	
}
