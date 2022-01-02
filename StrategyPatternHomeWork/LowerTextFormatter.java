package StrategyPatternHomeWork;

public class LowerTextFormatter implements TextFormatter {
	
	public LowerTextFormatter() {
		
	}
	@Override
	public void format(String text) {
		System.out.println("Converting given text to lower format "+text.toLowerCase());
	}
}
