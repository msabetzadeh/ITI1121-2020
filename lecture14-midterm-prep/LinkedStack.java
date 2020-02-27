public class LinkedStack<T> implements Stack<T> {

	private class Elem {
		private T value;
		private Elem next;

		private Elem(T value, Elem next) {
			this.value = value;
			this.next = next;
		}
	}

	private Elem top; // Instance variable

	public LinkedStack() {
		this.top = null;
	}

	public void push(T value) {
		// create a new element and make this new element's "next" point to the current
		// top
		Elem temp = new Elem(value, top);

		// update top
		top = temp;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public T peek() {
		if (!isEmpty()) {
			return top.value;
		}

		return null;
	}

	public T pop() {
		T value = null;

		if (!isEmpty()) {
			value = top.value;

			// update the top to point to the next element
			top = top.next;
		}

		return value;
	}

	public String toString() {
		String res = "[";
		if (top != null) {
			Elem p = top;
			res = res + p.value;
			p = p.next;
			while (p != null) {
				res = res + "," + p.value;
				p = p.next;
			}
		}
		res = res + "]";

		return res;
	}
}