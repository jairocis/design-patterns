package grouping;

import java.util.ArrayList;
import java.util.List;

import grouping.elements.Element;
import grouping.elements.ElementsGroup;

public class CompositeElements {

	ElementsGroup appElemts = new ElementsGroup("app element group", 0, 0, false);
	
	public void loadElements(Element...elements) {
		appElemts.add(elements);
	}
	
	public Element group(String name, Element a, Element b ) {
		ElementsGroup newGroup = new ElementsGroup(name, 0, 0, false);
		//newGroup.add(null); 

		List<Element> elementGroup = new ArrayList<>();
		elementGroup.add(a);
		elementGroup.add(b);
		newGroup.add(elementGroup);
		
		appElemts.remove(a);
		appElemts.remove(b);
		appElemts.add(newGroup);
		return newGroup;
	}
	
	public void paint() {
		appElemts.paint(0);
	}
	
	
}
