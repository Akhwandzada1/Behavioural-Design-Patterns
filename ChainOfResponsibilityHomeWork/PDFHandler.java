package ChainOfResponsibilityHomeWork;

public class PDFHandler extends BaseHandler {
	String name;

	public PDFHandler(String name) {
		super(name);
		this.name=name;
	}

	@Override
	public void Handle(File file) {
		if(file.gettype()==FileType.PDF)
			System.out.println("Processing and saving pdf file... by Adobe Acrobat");
		else if(nextHandler!=null) {
			System.out.println("Adobe Acrobat forwards request to VLC Player");
			nextHandler.Handle(file);
		}
	}
	
}
