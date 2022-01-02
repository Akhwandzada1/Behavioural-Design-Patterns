package VisitorPatternHomeWork;

import java.util.ArrayList;

public class ShoppingCart{
	private ArrayList<Element> items=new ArrayList<Element>();
	
	public void addItem(Element element) {
		items.add(element);
	}
	
	public double calculatePayable() {
		PayableVisitor visitor=new PayableVisitor();
		for(Element item: items) {
			item.accept(visitor);
		}
		double payeable = visitor.getTotalPayableForCart();
		return payeable;
	}
}
