package IteratorPattern;

public class ConcreteTV implements TV {
	
	private String[] channels= {"CNN","RT","BBC","ABC","CNBC","FOX News"};
	private Iterator iterator;
	
	public ConcreteTV() {
		iterator=new ConcreteIterator();
	}
	@Override
	public Iterator getIterator() {
		return iterator;
	}
	public class ConcreteIterator implements Iterator{
		private int index=0;

		@Override
		public boolean hasNext() {
			if(index>=channels.length)
				return false;
			else
				return true;
		}
		@Override
		public String next() {
			return channels[index++];
		}
		
	}
	

	
}
