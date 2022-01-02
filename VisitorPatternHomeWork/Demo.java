package VisitorPatternHomeWork;
public class Demo {
	public static void main(String[] args) {
		CD cd=new CD("Documentary on Gulf War 1991",200);
		Book book=new Book("Blood and Oil",450);
		 ShoppingCart cart=new ShoppingCart();
		 cart.addItem(book);
		 cart.addItem(cd);
		 double TotalPayable=cart.calculatePayable();
		 System.out.println("Total Payable "+TotalPayable);
	}
}
