package TemplateMethodPattern;

public class Demo {
	
	public static void main(String[] args) {
		CSVDataParser csvdataparser=new CSVDataParser();
		csvdataparser.TemplateMethod();
		System.out.println("**************************");
		DatabaseParser databaseparser=new DatabaseParser();
		databaseparser.TemplateMethod();
	}
}