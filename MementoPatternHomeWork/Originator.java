package MementoPatternHomeWork;

public class Originator {
	CareTaker careTaker;
	private double x;
	private double y;
	private String lastUndoSavePoint;
	
	public Originator(double x,double y,CareTaker careTaker) {
		this.x=x;
		this.y=y;
		this.careTaker=careTaker;
		createSavePoint("Initial");
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void createSavePoint(String savePointName) {
		careTaker.saveMemento(new Memento(this.x,this.y),savePointName);
		lastUndoSavePoint=savePointName;
	}
	public void undo() {
		setOriginatorState(lastUndoSavePoint);
	}
	public void undo(String savePointName) {
		setOriginatorState(savePointName);
	}
	public void undoAll() {
		setOriginatorState("Initial");
		careTaker.clearSavepoints();
	}
	private void setOriginatorState(String savePointName) {
		Memento mem = (Memento)careTaker.getMemento(savePointName);
		this.x = mem.getX();
		this.y = mem.getY();
	}
	@Override
	public String toString(){
		return "X: "+x+", Y: "+y;
	}
	private class Memento{
		private double x;
		private double y;
		public Memento(double x, double y){
			this.x = x;
			this.y = y;
		}
		public double getX(){
			return x;
		}
		public double getY(){
			return y;
		}
	}
}