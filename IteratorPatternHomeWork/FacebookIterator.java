package IteratorPatternHomeWork;

public class FacebookIterator implements Iterator{
	private int index=0;
	private Profile[] profiles;
	public FacebookIterator(Profile[] profiles) {
		this.profiles=profiles;
	}
	@Override
	public boolean hasMore() {
		if(index>=profiles.length)
			return false;
		else
			return true;
	}
	@Override
	public Profile getNext() {
		return profiles[index++];
	}
}