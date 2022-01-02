package MediatorHomeWork;

public interface Party {
	public void addMember(PartyMember partymember);
	public void act(PartyMember partymember, Action action);
}
