package TemplateMethodPattern;

public class DatabaseParser extends DataParser {
	
	@Override
	public void readData() {
		System.out.println("Reading data from database");	
	}
	@Override
	public void processData() {
		System.out.println("Processing data from database");
	}
	@Override
	public void writeData() {
		System.out.println("Writing data to database");
	}
}
