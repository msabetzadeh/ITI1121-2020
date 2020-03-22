class Node<T> { // <--- Now a top-level class
	T value;
	Node<T> next;

	Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
}
