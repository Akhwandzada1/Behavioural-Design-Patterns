package ObserverPatternHomeWork;

import java.util.ArrayList;

public class Commentary implements Publisher {
	
	private String description;
	private ArrayList<Subscriber> subscribers=new ArrayList<Subscriber>();
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
		
	}
	@Override
	public void unSubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
		
	}
	@Override
	public void notifySubscribers() {
		for(Subscriber s:subscribers) {
			s.update(description);
		}
	}
	public void setDescription(String description) {
		this.description=description;
		notifySubscribers();
	}
}