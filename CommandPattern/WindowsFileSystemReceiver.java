package CommandPattern;

public class WindowsFileSystemReceiver implements FileSystemReceiver {
	
	public WindowsFileSystemReceiver() {
		
	}
	@Override
	public void openFile() {
		System.out.println("Windows is opening the file");
		
	}
	@Override
	public void closeFile() {
		System.out.println("Windows is closing the file");
		
	}
	@Override
	public void writeFile() {
		System.out.println("Windows is writing the file");
	}
}
