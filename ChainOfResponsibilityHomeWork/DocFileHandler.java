package ChainOfResponsibilityHomeWork;

public class DocFileHandler extends BaseHandler {
	String name;

	public DocFileHandler(String name) {
		super(name);
		this.name=name;
	}

	@Override
	public void Handle(File file) {
		if(file.gettype()==FileType.DOC)
			System.out.println("Processing and saving doc file... by MS Word");
		else if(nextHandler!=null) {
			System.out.println("MS Word forwards request to Adobe Acrobat");
			nextHandler.Handle(file);
		}
	}
}
