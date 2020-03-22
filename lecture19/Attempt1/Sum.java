public class Sum {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			l.addLast(i);
		}

		int sum = 0;

		Iterator<Integer> i = l.iterator();

		while (i.hasNext()) {
			Integer v = i.next();
			sum += v.intValue();
		}
		System.out.println("sum = " + sum);
	}
}