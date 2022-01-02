package MediatorPattern;

public abstract class BaseComponent {
	protected Mediator mediator;
	public BaseComponent() {
		
	}
	public void setMediator(Mediator mediator) {
		this.mediator=mediator;
	}
}
