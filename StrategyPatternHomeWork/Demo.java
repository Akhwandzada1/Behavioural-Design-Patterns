package StrategyPatternHomeWork;

public class Demo {

	public static void main(String[] args) {
		String text="Hello! how are you? hoping that you are feeling good";
		TextFormatter lowercaseFormatter=new LowerTextFormatter();
		TextFormatter upperCaseFormatter=new CapTextFormatter();
		TextEditor editor1=new TextEditor(lowercaseFormatter);
		editor1.publishText(text);
		TextEditor editor2=new TextEditor(upperCaseFormatter);
		editor2.publishText(text);
	}
}