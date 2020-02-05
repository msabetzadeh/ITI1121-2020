public class Pair<X,Y> {
	private X first;
	private Y second;
/*
	public Pair() {
		first = null;
		second = null;
	}
*/
	public Pair( X a, Y b ) {
		first = a;
		second = b;
	}
	
	public X getFirst() { return first; }
	
	public Y getSecond() { return second; }
	
	public void setFirst( X arg ) { first = arg; }
	
	public void setSecond( Y arg ) { second = arg; }
}
