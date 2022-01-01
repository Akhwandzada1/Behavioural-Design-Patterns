package ObserverPattern;

import java.util.ArrayList;

public class WhiteShirt implements Publisher {
	
	private boolean inStock=false;
	private ArrayList<Subscriber> subscribers=new ArrayList<Subscriber>();
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock=inStock;
		notifySubscribers();
	}
	
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
		
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
		
	}

	@Override
	public void notifySubscribers() {
		System.out.println("Notifying all subscribers when shirt will be avaliable");
		for(Subscriber s:subscribers) {
			s.update();
		}
		
	}
	
}
