
public class StackInspector<E> {
	private Stack<E> stack;

	public StackInspector(Stack<E> stack) {
		this.stack = stack;
	}

	public int findLast(E elem) {
		Stack<E> reverseCopy = new LinkedStack<E>();
		E temp = null;
		int loc = -1;
		int index = -1;

		while (!stack.isEmpty()) {
			loc++;

			reverseCopy.push(temp = stack.pop());

			if (temp.equals(elem)) {
				index = loc;

			}
		}

		while (!reverseCopy.isEmpty()) {
			stack.push(reverseCopy.pop());
		}

		return index;
	}

	public static void main(String args[]) {
		Stack<String> stack;
		stack = new LinkedStack<String>();
		stack.push("one");
		stack.push("two");
		stack.push("one");
		stack.push("two");
		stack.push("three");
		StackInspector<String> inspector;
		inspector = new StackInspector<String>(stack);
		System.out.println("Stack at the beginning: " + stack);
		System.out.println(inspector.findLast("one"));
		System.out.println(inspector.findLast("two"));
		System.out.println(inspector.findLast("three"));
		System.out.println(inspector.findLast("four"));
		System.out.println("Stack at the end: " + stack);
	}
}