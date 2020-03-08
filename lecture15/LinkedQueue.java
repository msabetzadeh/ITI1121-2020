public class LinkedQueue<T> implements Queue<T> {

	private static class Elem<E> {
		private E value;
		private Elem<E> next;

		private Elem(E value, Elem<E> next) {
			this.value = value;
			this.next = next;
		}
	}

	Elem<T> front, rear;

	public LinkedQueue() {
		this.front = this.rear = null;
	}

	public void enqueue(T value) {

		// Create a new linked list element
		Elem<T> newElem = new Elem<T>(value, null);

		// If the queue is empty, the new element will be both front and rear
		if (this.isEmpty()) {
			this.front = this.rear = newElem;
			return;
		}

		// Add the new element to the end of the queue and update rear
		this.rear.next = newElem;
		this.rear = newElem;
	}

	public T dequeue() {

		// If the queue is empty, then return null.
		if (this.isEmpty())
			return null;

		// Save current front and move front one element ahead
		Elem<T> elem = this.front;
		this.front = this.front.next;

		// If front becomes null, then the queue is empty and therefore rear has to be
		// set to null too
		if (this.front == null)
			this.rear = null;

		return elem.value;
	}

	public boolean isEmpty() {
		// If front is null, then the list is empty
		return this.front == null;
	}

	public boolean hasSingleElement() {
		if (isEmpty()) {
			return false;
		}

		if (front.next == null)
			return true;

		return false;
	}

	public String toString() {
		String res = "[";
		if (!isEmpty()) {
			Elem<T> elem = front;
			res = res + elem.value;
			elem = elem.next;
			while (elem != null) {
				res = res + ", " + elem.value;
				elem = elem.next;
			}
		}
		res = res + "]";

		return res;
	}

	public static void main(String[] args) {
		Queue<String> q = new LinkedQueue<String>();

		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("E");

		System.out.println("Initial queue [front ... rear]: " + q);

		System.out.println("First dequeued element: " + q.dequeue());
		System.out.println("Second dequeued element: " + q.dequeue());
		System.out.println("Third dequeued element: " + q.dequeue());

		System.out.println("Queue empty? " + q.isEmpty());

		System.out.println("Queue after three dequeues: " + q);

		System.out.println("Fourth dequeued element: " + q.dequeue());

		System.out.println("Let\'s put an element in: F");

		q.enqueue("F");

		System.out.println("Queue after adding F:" + q);

		System.out.println("Fifth dequeued element: " + q.dequeue());

		System.out.println("Sixth dequeued element: " + q.dequeue());

		System.out.println("Queue after sixth dequeue: " + q);

		System.out.println("Queue empty? " + q.isEmpty());

		System.out.println("Enqueue another element: G");

		q.enqueue("G");

		System.out.println("New queue: " + q);

		// What follows has nothing to do with queues :) It relates to a side discussion during the lecture.
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 3; j++)
				for (int k = 0; k < 2; k++) {
					System.out.println(i + ", " + j + ", " + k);
					System.out.println("hello!");
				}
	}
}
