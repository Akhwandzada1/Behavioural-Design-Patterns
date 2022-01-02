package StrategyPattern;

public class PayPalStrategy implements PaymentStrategy {
	private String name;
	private String cardNumber;
	private String cardPIN;
	private String dateOfExpiry;
	
	public PayPalStrategy(String name, String cardNumber, String cardPIN, String dateOfExpiry) {
		this.name=name;
		this.cardNumber=cardNumber;
		this.cardPIN=cardPIN;
		this.dateOfExpiry=dateOfExpiry;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount +" Rupees paid using PayPal");
	}
}
