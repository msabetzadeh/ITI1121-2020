public class TestLinkedStack {

	public static void main( String[] args ) {
		
		Stack<String> stack = new LinkedStack<String>();
		
		for (int i = 0; i < args.length; i++)
			stack.push(args[i]);
			
		//System.out.println("PEEK: " + stack.peek());
		//System.out.println("PEEK: " + stack.peek());

		//System.out.println(stack);

		while (!stack.isEmpty() )
			System.out.println(stack.pop());		
	}
}
