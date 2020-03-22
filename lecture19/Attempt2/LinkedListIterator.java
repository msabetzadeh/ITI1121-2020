import java.util.NoSuchElementException;

class LinkedListIterator<E> implements Iterator<E> {
	private Node<E> current;
	private LinkedList<E> myList;

	LinkedListIterator(LinkedList<E> myList) {
		this.myList = myList;
		current = null;
	}

	public boolean hasNext() {
		return ((current == null && myList.head != null) || 
				(current != null && current.next != null));
	}

	public E next() {
		if (current == null) {
			current = myList.head;
		} else {
			current = current.next;
		}
		if (current == null) {
			throw new NoSuchElementException();
		}

		return current.value;
	}
}