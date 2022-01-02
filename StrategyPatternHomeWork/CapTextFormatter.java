package StrategyPatternHomeWork;

public class CapTextFormatter implements TextFormatter {
	@Override
	public void format(String text) {
		System.out.println("Converting text to cap format "+text.toUpperCase());
	}
}
