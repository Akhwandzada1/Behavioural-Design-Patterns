package IteratorPattern;

public class Demo {
	public static void main(String[] args) {
		TV tv=new ConcreteTV();
		while(tv.getIterator().hasNext()) {
			System.out.println("You are watching "+tv.getIterator().next()+" now");
		}
		
	}
}
