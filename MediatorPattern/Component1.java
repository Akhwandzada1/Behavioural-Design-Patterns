package MediatorPattern;

public class Component1 extends BaseComponent {
	public void doA() {
		System.out.println("Component1 does A");
		mediator.notify(this, "A");
	}
	public void doB() {
		System.out.println("Component2 does B");
		mediator.notify(this,"B");
	}
}
