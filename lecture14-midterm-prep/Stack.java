public interface Stack<E> {
	public abstract boolean isEmpty();

	public abstract void push(E elem);

	public abstract E pop();

	public abstract E peek();
}