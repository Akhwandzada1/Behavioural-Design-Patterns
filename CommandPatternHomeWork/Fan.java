package CommandPatternHomeWork;

public class Fan implements Device {
	
	public Fan() {
	}
	@Override
	public void start() {
		System.out.println("Fan is turned on");
	}
	@Override
	public void stop() {
		System.out.println("Fan is turned off");
	}
}
