public class Cartesian {
	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();

		for (int i = 0; i < 5; i++) {
			l.addLast(i);
		}

		Iterator<Integer> i1 = l.iterator();

		while (i1.hasNext()) {
			Integer val1 = i1.next();

			Iterator<Integer> i2 = l.iterator();

			while (i2.hasNext()) {
				Integer val2 = i2.next();
				System.out.print("(" + val1 + ", " + val2 + ")");
			}
			System.out.println();
		}

	}
}