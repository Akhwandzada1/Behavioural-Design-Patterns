package ChainOfResponsibilityHomeWork;

public class TextFileHandler extends BaseHandler {
	String name;
	public TextFileHandler(String name) {
		super(name);
		this.name=name;
	}
	@Override
	public void Handle(File file) {
		if(file.gettype()==FileType.TXT)
			System.out.println("Processing and saving doc file... by Notepad++");
		else if(nextHandler!=null) {
			System.out.println("Notepad++ forwards request to MS Word");
			nextHandler.Handle(file);
		}
		
	}
}
