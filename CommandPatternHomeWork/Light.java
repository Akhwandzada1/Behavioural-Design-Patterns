package CommandPatternHomeWork;

public class Light implements Device {
	
	public Light() {
		
	}
	@Override
	public void start() {
		System.out.println("Light is turned on");
	}
	@Override
	public void stop() {
		System.out.println("Light is turned off");
	}
}
