package ChainOfResponsibilityHomeWork;

public class File {
	private final String name;
	private final String path;
	private FileType filetype;
	
	public File(String name,String path,FileType filetype) {
		this.name=name;
		this.path=path;
		this.filetype=filetype;
	}
	public String getName() {
		return name;
	}
	public FileType gettype() {
		return filetype;
	}
	public String getPath() {
		return path;
	}
}
