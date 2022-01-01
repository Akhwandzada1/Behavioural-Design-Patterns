package ChainOfResponsibilityHomeWork;

public interface Handler {
	public void setNext(Handler handler);
	public void Handle(File file);
	public String getName();
}
