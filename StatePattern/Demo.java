package StatePattern;

public class Demo {
	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new OnState();
		State tvStopState = new OffState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();

	}

}
