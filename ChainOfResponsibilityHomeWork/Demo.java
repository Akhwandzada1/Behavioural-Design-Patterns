package ChainOfResponsibilityHomeWork;


public class Demo {

	public static void main(String[] args) {
		Handler textHandler = new TextFileHandler("Notepad++");
		Handler docHandler = new DocFileHandler("MS Word");
		Handler pdfHandler = new PDFHandler("Adobe Acrobat");
		Handler mp3Handler = new MP3FileHandler("VLC Media Player");
		
		textHandler.setNext(docHandler);
		docHandler.setNext(pdfHandler);
		pdfHandler.setNext(mp3Handler);
		File file = null;
		file = new File("Abc.doc", "C:", FileType.DOC);
		textHandler.Handle(file);
		System.out.println("--------------------------");
		file = new File("Def.pdf", "C:", FileType.PDF);
		textHandler.Handle(file);
		System.out.println("--------------------------");
		file = new File("Ghi.txt", "C:", FileType.TXT);
		textHandler.Handle(file);
		System.out.println("--------------------------");
		file = new File("Jkl.mp3", "C:", FileType.MP3);
		textHandler.Handle(file);
		System.out.println("--------------------------");
		file = new File("Mno.gif", "C:", FileType.GIF);
		textHandler.Handle(file);


	}

}
