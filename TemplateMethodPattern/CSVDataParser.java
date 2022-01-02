package TemplateMethodPattern;

public class CSVDataParser extends DataParser {
	@Override
	public void readData() {
		System.out.println("Reading data from CSV file");	
	}
	@Override
	public void processData() {
		System.out.println("Looping thorugh loaded CSV file");
	}
	@Override
	public void writeData() {
		System.out.println("Writing data to CSV file");
		
	}
}
