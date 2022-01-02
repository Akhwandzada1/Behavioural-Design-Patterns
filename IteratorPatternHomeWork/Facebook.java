package IteratorPatternHomeWork;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
	
	private List<Profile> friendsProfile=new ArrayList<Profile>();
	private List<Profile> coworkersProfile=new ArrayList<Profile>();
	@Override
	public Iterator getFriendsIterator() {
		Profile[] profiles=new Profile[friendsProfile.size()];
		profiles=friendsProfile.toArray(profiles);
		Iterator iterator=new FacebookIterator(profiles);
		return iterator;
	}
	@Override
	public Iterator getCoworkersIterator() {
		Profile[] profiles=new Profile[coworkersProfile.size()];
		profiles=coworkersProfile.toArray(profiles);
		FacebookIterator iterator=new FacebookIterator(profiles);
		return iterator;
	}
	public void addFriend(Profile profile) {
		friendsProfile.add(profile);
	}
	public void addCoworker(Profile profile) {
		coworkersProfile.add(profile);
	}
}