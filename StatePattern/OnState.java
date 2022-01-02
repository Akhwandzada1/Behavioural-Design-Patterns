package StatePattern;

public class OnState implements State {
	@Override
	public void doAction() {
		System.out.println("TV is on");
	}
}