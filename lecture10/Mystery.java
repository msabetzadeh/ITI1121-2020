import java.util.Stack;

public class Mystery {
	public static void main( String[] args ) {
		Stack<String> stack = new Stack<String>();
		for ( int i=0; i<args.length; i++ )
			stack.push( args[ i ] );
		while ( ! stack.empty() )
			System.out.println( stack.pop() );
	}
}
