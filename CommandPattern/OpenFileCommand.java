package CommandPattern;

public class OpenFileCommand implements Command {
	FileSystemReceiver receiver;
	
	public OpenFileCommand(FileSystemReceiver receiver) {
		this.receiver=receiver;
	}
	@Override
	public void execute() {
		receiver.openFile();
	}
}
