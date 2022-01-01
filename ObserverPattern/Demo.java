package ObserverPattern;

public class Demo {
	public static void main(String[] args) {
		Person Ahmed=new Person("Ahmed");
		Person Abdullah=new Person("Abdullah");
		WhiteShirt shirt=new WhiteShirt();
		shirt.subscribe(Abdullah);
		shirt.subscribe(Ahmed);
		shirt.setInStock(true);
	}

}
