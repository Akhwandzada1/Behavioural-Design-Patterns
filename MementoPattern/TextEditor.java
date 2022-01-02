package MementoPattern;

public class TextEditor {
	private String fileName;
	private StringBuilder content;
	public TextEditor(String fileName) {
		this.fileName=fileName;
		this.content=new StringBuilder();
	}
	public String toString() {
		return this.content.toString();
	}
	public void write(String s) {
		content.append(s);
	}
	public Memento save() {
		return new Memento(this.fileName,this.content);
	}
	public void undoToLastSaved(Object obj) {
		Memento memento=(Memento) obj;
		this.fileName=memento.fileName;
		this.content=memento.content;
	}
	private class Memento{
		private String fileName;
		private StringBuilder content;
		
		public Memento(String fileName,StringBuilder content) {
			this.fileName=fileName;
			this.content=new StringBuilder(content);
			
		}
	}
}
