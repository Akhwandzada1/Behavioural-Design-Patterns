package CommandPatternHomeWork;

public class Demo {
	public static void main(String args[]) {
		Light light = new Light();
		Remote remote = new Remote(light);
		remote.pressOnButton();
		remote.pressUndoButton();
		remote.pressOffButton();
		remote.pressUndoButton();
		Fan fan = new Fan();
		remote.setDevice(fan);
		remote.pressOnButton();
		remote.pressUndoButton();
		remote.pressOffButton();
		remote.pressUndoButton();
	}
}
