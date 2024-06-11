package grouping.elements;

import java.util.List;

public interface Element {
	int getX();
	void setLevel(int level);
	void select();
	void unSelect();
	boolean isSelected();
	List<Element> getGroup();
	String getName();
	void paint(int x);

}
