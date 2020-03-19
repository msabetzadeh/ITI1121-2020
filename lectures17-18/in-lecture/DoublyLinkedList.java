public class DoublyLinkedList<E> // implements List<E>
{
	private static class Node<T> {
		private T value;
		private Node<T> previous; // <--- NEW
		private Node<T> next;

		private Node(T value, Node<T> previous, Node<T> next) { // The order of previous and next not to be mixed up 
			this.value = value;
			this.previous = previous; // <--- NEW
			this.next = next;
		}
	}

	private Node<E> head;
	private Node<E> tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	public E removeLast() {
		// pre-condition: list is not empty
		Node<E> toDelete = tail;
		E savedValue = toDelete.value;

		if (head.next == null) { // special case: list had one element
			head = null;
			tail = null;
		} else {
			tail = tail.previous;
			tail.next = null;
		}

		toDelete.value = null;
		toDelete.next = null;

		return savedValue;
	}

	public void add(int pos, E o) {

		// pre-conditions: object to add is non-null and pos is non-negative
		if (o == null) {
			throw new IllegalArgumentException("null");
		}

		if (pos < 0) {
			throw new IndexOutOfBoundsException(Integer.toString(pos));
		}

		// special case: adding at position 0
		if (pos == 0) {
			head = new Node<E>(o, null, head);

			if (tail == null) { // special case: list was empty
				tail = head;
			} else {
				head.next.previous = head;
			}
		} else { // general case
			Node<E> p = head;
			for (int i = 0; i < (pos - 1); i++) {
				if (p == null) { // invalid pos
					throw new IndexOutOfBoundsException(Integer.toString(pos)); 
				} else {
					p = p.next;
				}
			}
			Node<E> q = p.next;
			p.next = new Node<E>(o, p, q);
			if (p == tail) { // special case: adding at the end of the list
				tail = p.next;
			} else {
				q.previous = p.next;
			}
		}

	}
}