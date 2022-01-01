package ChainOfResponsibility;

public interface Dispenser {
	public void setNext(Dispenser dispenser);
	public void dispense(Currency currency);

}
