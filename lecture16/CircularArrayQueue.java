import java.util.Arrays;

public class CircularArrayQueue<E> implements Queue<E> {

	private static final int MAX_QUEUE_SIZE = 3;
	private E[] q;
	private int front, rear;

	@SuppressWarnings("unchecked")
	public CircularArrayQueue() {
		q = (E[]) new Object[MAX_QUEUE_SIZE];
		front = 0;
		rear = -1;
	}

	public boolean isEmpty() {
		return rear == -1;
	}

	public void enqueue(E o) throws QueueFullException {
		
		if (isFull()) {
			throw new QueueFullException("The queue is full!");
		} else {
			rear = (rear + 1) % MAX_QUEUE_SIZE;
			q[rear] = o;
		}
	}

	public E dequeue() throws QueueEmptyException {
		E elem = null;

		if (isEmpty()) {
			throw new QueueEmptyException("The queue is empty!");
		} else {
			elem = q[front];
			q[front] = null;
			front = (front + 1) % MAX_QUEUE_SIZE;

			//if ((front == 0 && rear == MAX_QUEUE_SIZE - 1) || (front == rear + 1)) {
			if (Math.abs(rear - front + 1) % MAX_QUEUE_SIZE == 0) {
				// Queue got emptied as a result of dequeuing; reset front and rear to initial values
				front = 0;
				rear = -1;
			}
		}
		return elem;
	}

	public boolean isFull() {
		// return (rear != -1) && ((front == 0 && rear == MAX_QUEUE_SIZE - 1) || (front == rear + 1));
		return (rear != -1) && Math.abs(rear - front + 1) % MAX_QUEUE_SIZE == 0;
	}

	public String toString() {
		return Arrays.toString(q) + "(front: " + front + ", rear: " + rear + ")";
	}

	public static void main(String[] args) {

		CircularArrayQueue<Integer> queue = new CircularArrayQueue<Integer>();
		
		queue.enqueue(1);
		
		queue.enqueue(2);
		
		queue.enqueue(3);

		System.out.println(queue);

		queue.dequeue();

		queue.dequeue();

		System.out.println(queue);

		queue.enqueue(4);

		System.out.println(queue);

		queue.enqueue(5);

		System.out.println(queue);

		// Run the following at your peril!
		// queue.enqueue(6);

		queue.dequeue();
		
		System.out.println(queue);

		queue.dequeue();

		System.out.println(queue);

		queue.dequeue();

		System.out.println(queue);

		// Run the following at your peril!
		// queue.dequeue();
		
		queue.enqueue(6);
		
		queue.enqueue(7);
		
		queue.enqueue(8);

		System.out.println(queue);
	}

}