public class TestPair {
	public static void main( String[] args ) {
		Pair<String, Integer> p;
		
		p = new Pair<String, Integer>( "ITI", Integer.valueOf(1121));

		//System.out.println(p.getSecond());

		p.setFirst( "session" );

		p.setSecond( 12345 );

		String attribute;
		attribute = new String( "height" );
		Integer value = Integer.valueOf(100);
		p = new Pair<String, Integer>( attribute, value );
	}
}