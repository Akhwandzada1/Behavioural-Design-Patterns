package CommandPattern;

public class CloseFileCommand implements Command {
	FileSystemReceiver receiver;
	public CloseFileCommand(FileSystemReceiver receiver) {
		this.receiver=receiver;
	}
	@Override
	public void execute() {
		receiver.closeFile();
	}
}
