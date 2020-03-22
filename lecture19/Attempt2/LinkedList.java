import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> { // <--- no longer implements Iterator<E>

	protected Node<E> head; // <--- not private anymore!

	private int size;

	public void addFirst(E elem) {
		if (elem == null) {
			throw new NullPointerException();
		}
		head = new Node<E>(elem, head);
		size++;
	}

	public void addLast(E elem) {
		if (elem == null) {
			throw new NullPointerException();
		}
		if (head == null) {
			head = new Node<E>(elem, null);
		} else {
			Node<E> p = head;
			while (p.next != null) {
				p = p.next;
			}
			p.next = new Node<E>(elem, null);
		}
		size++;
	}

	public void add(E elem, int index) {
		if (elem == null) {
			throw new NullPointerException();
		}
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		if (index == 0) {
			head = new Node<E>(elem, head);
		} else {
			Node<E> p = head;
			for (int i = 0; i < (index - 1); i++) {
				p = p.next;
			}
			p.next = new Node<E>(elem, p.next);
		}
		size++;
	}

	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		Node<E> p = head;
		for (int i = 0; i < index; i++) {
			p = p.next;
		}
		return p.value;
	}

	public E removeFirst() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		E saved = head.value;
		head = head.next;
		size--;
		return saved;
	}

	public E removeLast() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		E saved;
		if (head.next == null) {
			saved = head.value;
			head = null;
		} else {
			Node<E> p = head;
			while (p.next.next != null) {
				p = p.next;
			}
			saved = p.next.value;
			p.next = null;
		}
		size--;
		return saved;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public String toString() {
		String str = "[";
		Node<E> p = head;
		while (p != null) {
			if (p != head) {
				str += ", ";
			}
			str += p.value;
			p = p.next;
		}
		str += "]";
		return str;
	}
	
	public Iterator<E> iterator() {
		return new LinkedListIterator<E>(this);
	}
}
