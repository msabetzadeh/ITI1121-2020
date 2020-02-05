class TestString {
	String str1 = "Hello!";
	String str2 = "Hello!";
	
	public static void main (String[] args) {
		TestString str = new TestString();
		if (str.str1 == str.str2) {
			System.out.println("Surprise!");
		}
		String str3 = "Hello!";
		if (str.str1 == str3) {
			System.out.println("Surprise No 2!");
		}
	}

}