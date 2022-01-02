package StrategyPatternHomeWork;

public class TextEditor {
	TextFormatter formatter;
	public TextEditor(TextFormatter formatter) {
		this.formatter=formatter;
	}
	public void publishText(String text) {
		formatter.format(text);
	}
}
