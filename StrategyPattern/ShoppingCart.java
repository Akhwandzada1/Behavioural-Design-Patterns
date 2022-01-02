package StrategyPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
	private List<Item> items=new ArrayList<Item>();
	private PaymentStrategy paymentStrategy;
	public void addItem(Item item) {
		items.add(item);
	}
	public int calculateAmount() {
		Iterator<Item> iterator=items.iterator();
		int total=0;
		while(iterator.hasNext()) {
			total=total+iterator.next().getPrice();
		}
		return total;
	}
	public void setPaymentMethod(PaymentStrategy paymentStrategy) {
		this.paymentStrategy=paymentStrategy;
	}
	public void checkOut() {
		int total=calculateAmount();
		paymentStrategy.pay(total);
	}
}