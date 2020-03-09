public interface Queue<E> {
	public abstract boolean isEmpty();

	public abstract void enqueue(E o) throws QueueFullException;

	public abstract E dequeue() throws QueueEmptyException;
}