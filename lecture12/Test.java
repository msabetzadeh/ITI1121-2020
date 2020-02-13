import java.util.StringTokenizer;

class Token {
    private static final int INTEGER = 1;
    private static final int SYMBOL = 2;
    private int iValue;
    private String sValue;
    private int type;
    
    public Token( int iValue ) {
        this.iValue = iValue;
        type = INTEGER;
    }
    public Token( String sValue ) {
        this.sValue = sValue;
        type = SYMBOL;
    }
    public int iValue() { return iValue;}
    public String sValue() { return sValue; }
    public boolean isInteger() { return type == INTEGER; }
    public boolean isSymbol() { return type == SYMBOL; }
    
    public String toString () {
		if (type == INTEGER) {
			return iValue + " (INTEGER)";
		}
		
		return sValue + " (SYMBOL)";
	}

}

class Reader {
	StringTokenizer st;
	
	public Reader(String expression) {
		st = new StringTokenizer(expression);
	}
	
	public boolean hasMoreTokens() {
		return st.hasMoreTokens();
	
	}
	
	public Token nextToken() {
		if (!st.hasMoreTokens()) {
			return null;
		}
		
		String s = st.nextToken();
		
		if (s.matches("-?\\d+")) {
			return new Token(Integer.parseInt(s));
		}

		return new Token(s);
/*		
		//Alternative implementation but bad practice!
		try {
			return new Token(Integer.parseInt(s));
		}
		catch (Exception ex) {
			return new Token(s);
		}
*/			
	}	
}

class Test {

	public static int eval( Token op, int l, int r ) {
    	int result = 0;
    	if ( op.sValue().equals( "+" ) )
        	result = l + r;
    	else if ( op.sValue().equals( "-" ) )
        	result = l - r;
    	else if ( op.sValue().equals( "*" ) )
        	result = l * r;
    	else if ( op.sValue().equals( "/" ) )
        	result = l / r;
    	else
        	System.err.println( "not a valid symbol" );
    	return result;
	}

	public static int execute( String expression ) {
    	Token op = null; int l = 0, r = 0;
    	Reader reader = new Reader( expression );
    
	    l = reader.nextToken().iValue();
    
    	while ( reader.hasMoreTokens() ) {
        	op = reader.nextToken();
        	r = reader.nextToken().iValue();
        	l = eval( op, l, r );
		}
		
		return l; 
	}
	
    public static void scan( String expression ) {
	    Reader reader = new Reader (expression);
        while ( reader.hasMoreTokens() ) {
            System.out.println( reader.nextToken() );
		} 
	}
	
    public static void main( String[] args  ) {
    	String expression = " 3 + 4 * 567  ";
    	
    	scan(expression);
    	
    	int r = execute(expression);
    	
    	System.out.println("Result: " + r);
    } 
}