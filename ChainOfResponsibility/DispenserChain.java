package ChainOfResponsibility;

public class DispenserChain {
	Dispenser dispenser;
	
	public DispenserChain() {
		Dispenser Rs500=new RupeesDispenser(500);
		Dispenser Rs1000=new RupeesDispenser(1000);
		Dispenser Rs5000=new RupeesDispenser(5000);
		
		dispenser=Rs5000;
		dispenser.setNext(Rs1000);
		Rs1000.setNext(Rs500);
	}
	public void dispense(Currency currency) {
		if(currency.getAmount()%500==0) 
			dispenser.dispense(currency);
		else
			System.out.println("Entered Amount: "+currency.getAmount()+" is not a multiple of 500");
	}
}
