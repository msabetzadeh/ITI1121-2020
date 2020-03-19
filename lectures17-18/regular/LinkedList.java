public class LinkedList<E> implements List<E> {

    private static class Node<T> {
	private T value;
	private Node<T> prev;
	private Node<T> next;
	private Node(T value, Node<T> prev, Node<T> next) {
	    this.value = value;
	    this.prev = prev;
	    this.next = next;
	}
    }
    
    private Node<E> head;
    private int size;
    
    public LinkedList() {
        head = new Node<E>(null, null, null);
        head.prev = head;
        head.next = head;
        size = 0;
    }

    public int size() {
		return size;
    }
	
    public E get(int pos) {
	
	if (pos < 0 || pos >= size) {
	    throw new IndexOutOfBoundsException(Integer.toString(pos));
	}
	    
	Node<E> p;
	p = head.next;
	    
	while (pos > 0) {
	    p = p.next;
	    pos--;
	}

	return p.value;
    }

    public void add(E element, int pos) {

	if (element == null) {
	    throw new NullPointerException();
	}

	if (pos < 0 || pos > size) {
	    throw new IndexOutOfBoundsException(Integer.toString(pos));
	}
	    
	Node<E> before, after;
	before = head;
	    
	while (pos > 0) {
	    before = before.next;
	    pos--;
	}

	after = before.next;

	before.next = new Node<E>(element, before, after);
	after.prev = before.next;
	
	size++;
    }

    public void remove(int pos) {

	if (pos < 0 || pos >= size) {
	    throw new IndexOutOfBoundsException(Integer.toString(pos));
	}
	    
	Node<E> before, after;
	before = head;
	    
	while (pos > 0) {
	    before = before.next;
	    pos--;
	}

	after = before.next.next;

	before.next = after;
	after.prev = before;
	
	size--;
    }

    public boolean remove(E element) {
	
	if (element == null) {
	    throw new NullPointerException();
	}

	Node<E> p, before, after;
	p = head.next;
	    
	while (p != head && ! p.value.equals(element)) {
	    p = p.next;
	}

	if (p == head) {
	    return false;
	}
	
	before = p.prev;
	after = p.next;

	before.next = after;
	after.prev = before;
	
	size--;

	return true;
    }

    public String toString() {

	StringBuffer b;
	b = new StringBuffer("LinkedList {");

	Node<E> p;
	p = head.next;

	while (p != head) {
	    b.append(p.value);
	    if (p.next != head) {
		b.append(",");
	    }
	    p = p.next;
	}

	b.append("}");

	return b.toString();
    }
    
    
}
