package CommandPatternHomeWork;

public class TurnOnCommand implements Command {
	Device device;
	
	public TurnOnCommand(Device device) {
		this.device=device;
	}

	@Override
	public void execute() {
		device.start();
		
	}

	@Override
	public void undo() {
		device.stop();
		
	}

}
