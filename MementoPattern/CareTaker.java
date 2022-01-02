package MementoPattern;

public class CareTaker {
	private Object snapshot;
	public void save(TextEditor editor) {
		this.snapshot=editor.save();
	}
	public void undo(TextEditor editor) {
		editor.undoToLastSaved(snapshot);
	}
}