package ObserverPatternHomeWork;

public class SMSSubscriber implements Subscriber {
	
	private String userInfo;
	public SMSSubscriber(String userInfo) {
		this.userInfo=userInfo;
	}
	@Override
	public void update(String message) {
		System.out.println(userInfo+" "+message);
	}
	@Override
	public String toString() {
		return "SMSSubscriber [userInfo=" + userInfo + "]";
	}
	
}