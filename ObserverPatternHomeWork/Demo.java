package ObserverPatternHomeWork;

public class Demo {

	public static void main(String[] args) {
		Commentary commentary = new Commentary();
		Subscriber subscriber = new SMSSubscriber("Ahmed Ali [Abbottabad]");
		commentary.subscribe(subscriber);
		Subscriber subscriber2 = new SMSSubscriber("Irfan Khan [London]");
		commentary.subscribe(subscriber2);
		commentary.setDescription("Welcome to live Soccer match");
		commentary.setDescription("Current score 0-0");
		commentary.unSubscribe(subscriber2);
		commentary.setDescription("It’s a goal!!");
		commentary.setDescription("Current score 1-0");
		Subscriber subscriber3 = new SMSSubscriber("Marrie Smith [Berlin]");
		commentary.subscribe(subscriber3);
		commentary.setDescription("It’s another goal!!");
		commentary.setDescription("Half-time score 2-0");
	}
}