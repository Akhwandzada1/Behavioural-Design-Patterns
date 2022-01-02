package MediatorHomeWork;

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements Party {
	
	private final List<PartyMember> members;
	
	public PartyImpl() {
		members=new ArrayList<PartyMember>();
	}
	@Override
	public void addMember(PartyMember partymember) {
		members.add(partymember);
		partymember.joinedParty(this);
	}
	@Override
	public void act(PartyMember partymember,Action action) {
		for(PartyMember member:members) {
			if(member.equals(partymember)) {
				member.partyAction(action);
			}
		}
	}
}
