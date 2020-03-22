
public class CompareToAverage {
	public static void main(String[] args) {
		int sum = 0;
		int n = 0;

		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			l.addLast(i);
		}

		Iterator<Integer> i = l.iterator();
		while (i.hasNext()) {
			Integer v = i.next();
			sum += v.intValue();
			n++;
		}
		i = l.iterator();
		while (i.hasNext()) {
			Integer v = i.next();
			if (v.intValue() > (sum / n)) {
				System.out.println(v + " is greater than average");
			}
		}

	}
}
