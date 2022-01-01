package ChainOfResponsibility;

public class Demo {

	public static void main(String[] args) {
		DispenserChain chain=new DispenserChain();
		Currency currency=new Currency(5500);
		chain.dispense(currency);

	}

}
