package CommandPattern;

public class WriteFileCommand implements Command {
	FileSystemReceiver receiver;
	public WriteFileCommand(FileSystemReceiver receiver) {
		this.receiver=receiver;
	}
	@Override
	public void execute() {
		receiver.writeFile();
	}
}
