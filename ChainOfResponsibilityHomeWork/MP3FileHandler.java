package ChainOfResponsibilityHomeWork;

public class MP3FileHandler extends BaseHandler {
	String name;

	public MP3FileHandler(String name) {
		super(name);
		this.name=name;
	}

	@Override
	public void Handle(File file) {
		if(file.gettype()==FileType.MP3)
			System.out.println("Processing and saving MP3 file... by VLC Media Player");
		else if(nextHandler==null) {
			System.out.println("File not supported");
		}
		
	}
	
}
