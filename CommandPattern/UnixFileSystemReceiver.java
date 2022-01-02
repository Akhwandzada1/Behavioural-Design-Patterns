package CommandPattern;

public class UnixFileSystemReceiver implements FileSystemReceiver {
	
	public UnixFileSystemReceiver() {
		
	}

	@Override
	public void openFile() {
		System.out.println("Unix is opening the file");
	}

	@Override
	public void closeFile() {
		System.out.println("Unix is closing the file");
	}

	@Override
	public void writeFile() {
		System.out.println("Unix is writing the file");
		
	}

}
