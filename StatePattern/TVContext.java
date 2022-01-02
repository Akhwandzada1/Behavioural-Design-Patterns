package StatePattern;

public class TVContext {
	private State state;
	
	public void setState(State state) {
		this.state=state;
	}
	public State getState() {
		return state;
	}
	public void doAction() {
		state.doAction();
	}
}
