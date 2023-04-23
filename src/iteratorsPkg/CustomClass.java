package iteratorsPkg;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomClass implements Iterable {

	LinkedList<String> linkedList = new LinkedList<>();

	public CustomClass(LinkedList<String> linkedList) {
		this.linkedList = linkedList;
	}

	class CustomIterator implements Iterator<String> {

		private int index;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < linkedList.size();
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			return linkedList.get(index);
		}

	}

	@Override
	public Iterator<String> iterator() {
		return linkedList.iterator();
	}

}
