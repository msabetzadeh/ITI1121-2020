public class SinglyLinkedList<E> implements List<E> {

    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node( T value, Node<T> next ) {
            this.value = value;
            this.next = next;
		} 
	}
	
    private Node<E> head;
    private Node<E> tail;

	public void addLast( E t ) {
    	Node<E> newNode = new Node<E>( t, null );
    	if ( head == null ) {
        	head = newNode;
        	tail = head;
    	} else {
        	tail.next = newNode;
        	tail = tail.next;
    	}
	}

	public E removeFirst() {
		// preconditions? 
    	Node<E> nodeToDelete = head;
    	E result = nodeToDelete.value;
    	head = head.next;
    	nodeToDelete.value = null; // scrubbing
    	nodeToDelete.next = null;
    	if ( head == null ) {
        	tail = null;
		}
    	return result;
	}
}


