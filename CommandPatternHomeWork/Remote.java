package CommandPatternHomeWork;
public class Remote {
	Device device;
	Command command;
	
	public Remote(Device device) {
		
	}
	public void setDevice(Device device) {
		this.device=device;
	}
	public void pressOnButton() {
		command=new TurnOnCommand(device);
		command.execute();
	}
	public void pressOffButton() {
		command=new TurnOffCommand(device);
		command.execute();
	}
	public void pressUndoButton() {
		if(command==null)
			System.out.println("No Operation to undo");
		else
			command.undo();
	}
}
