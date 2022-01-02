package StrategyPattern;

public class Demo {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("Code complete",120);
		Item item2 = new Item("Design patterns in java: a practical tutorial",100);
		cart.addItem(item1);
		cart.addItem(item2);
		cart.setPaymentMethod(new PayPalStrategy("Hamid Shaukat Amin", "0027","6699","10/22"));
		cart.checkOut();
		cart.setPaymentMethod(new CreditCardStrategy("Hamid Shaukat Amin", "0016", "9874", "10/21"));
		cart.checkOut();
	}
}