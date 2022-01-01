package ChainOfResponsibility;

public class RupeesDispenser implements Dispenser {
	
	private int worth;
	private Dispenser dispenser=null;
	
	public RupeesDispenser(int worth) {
		this.worth=worth;
	}
	@Override
	public void setNext(Dispenser dispenser) {
		this.dispenser=dispenser;
		
	}
	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount()>=worth){
			int quotient=currency.getAmount()/worth;
			int remainder=currency.getAmount()%worth;
			System.out.println("I am Rupees "+worth+" dispenser"+" I am dispensing "+quotient+" notes");
			
			if((remainder!=0)&&(dispenser!=null))
				dispenser.dispense(new Currency(remainder));			
		}
		else if(dispenser!=null) {
			dispenser.dispense(currency);
		}
		else {
			System.out.println("The amount "+currency+" cannot be processed");
		}
	}
}