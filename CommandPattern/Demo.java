package CommandPattern;

public class Demo {

	public static void main(String[] args) {
		FileSystemReceiver receiver;
		Command command;
		FileInvoker invoker;
		String osName=System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		if(osName.contains("windows")) {
			receiver=new WindowsFileSystemReceiver();
		}
		else {
			receiver=new UnixFileSystemReceiver();
		}
		command=new OpenFileCommand(receiver);
		invoker=new FileInvoker(command);
		invoker.execute();
		command=new CloseFileCommand(receiver);
		invoker=new FileInvoker(command);
		invoker.execute();
		command=new WriteFileCommand(receiver);
		invoker=new FileInvoker(command);
		invoker.execute();
		
		
	}

}
