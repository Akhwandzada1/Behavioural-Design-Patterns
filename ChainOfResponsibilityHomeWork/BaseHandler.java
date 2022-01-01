package ChainOfResponsibilityHomeWork;

public abstract class BaseHandler implements Handler {
	private final String name;
	Handler nextHandler;
	public BaseHandler(final String name) {
		this.name=name;
	}
	@Override
	public void setNext(Handler handler) {
		this.nextHandler=handler;
	}
	public String getName() {
		return name;
	}
}
