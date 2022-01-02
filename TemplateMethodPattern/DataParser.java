package TemplateMethodPattern;

public abstract class DataParser {
	public final void TemplateMethod() {
		readData();
		processData();
		writeData();
	}
	public abstract void readData();
	public abstract void processData();
	public abstract void writeData(); 
}