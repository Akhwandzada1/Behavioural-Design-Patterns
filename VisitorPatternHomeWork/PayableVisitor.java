package VisitorPatternHomeWork;

public class PayableVisitor implements Visitor {
	private double totalPayableForCart;
	@Override
	public void visit(Book book) {
		totalPayableForCart=totalPayableForCart+book.getPrice();
	}
	@Override
	public void visit(CD cd) {
		totalPayableForCart=totalPayableForCart+cd.getPrice();
	}
	public double getTotalPayableForCart() {
		return totalPayableForCart;
	}
}
