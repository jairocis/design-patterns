package grouping;

import grouping.elements.Circle;
import grouping.elements.Element;
import grouping.elements.ElementsGroup;
import grouping.elements.Line;
import grouping.elements.Point;
import grouping.elements.Rectangle;

public class CompositeElementsMain {
	public static void main(String...args) {
		CompositeElements compositeElements = new CompositeElements();
		
		Rectangle rectangle = new Rectangle("simple rectangle", 0, 0, false);
		Circle circle = new Circle("simple circle", 0, 0, false);
		
		ElementsGroup circleAndX = new ElementsGroup("Circlen and lines", 0, 0, false);
		circleAndX.add( new Circle("base circle", 0, 0, false), new Line("line horizontal", 0, 0, false), new Line("line vertical", 0, 0, false));
		
		ElementsGroup face = new ElementsGroup("circle face", 0, 0, false);
		face.add( new Circle("base circle", 0, 0, false), new Point("right eye", 0, 0, false), new Point("left eye", 0, 0, false), new Line("mouth", 0, 0, false)  );
		
		compositeElements.loadElements( rectangle,circle,circleAndX,face);
		compositeElements.paint();
		System.out.println("--------------------------------");
		Element rectangleCircule = compositeElements.group("rectangle-circle", rectangle, circle);
		compositeElements.paint();
		System.out.println("--------------------------------");
		Element new3 = compositeElements.group("new group 3", rectangleCircule, circleAndX);
		compositeElements.paint();
		
	}
}
