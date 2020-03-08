public interface Queue<E> {
	public abstract boolean isEmpty();

	public abstract void enqueue(E o);

	public abstract E dequeue();
}