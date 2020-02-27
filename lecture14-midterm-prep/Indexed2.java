// From 2017 Exam

public class Indexed2<T> {
	int index;
	T value;

	public Indexed2(int index, T value) {
		this.index = index;
		this.value = value;

	}

	public int getIndex() {
		return index;
	}

	public T getValue() {
		return value;
	}
	
	public boolean equals(Object other) {
		System.out.println("I'm here!");
		return false;
	}

	public boolean equals(Indexed2<T> other) {

		if (other == null)
			return false;

		if (index != other.index)
			return false;

		return value.equals(other.value);

	}

	public static void main(String args[]) {

		Indexed2<String> a;
		a = new Indexed2<String>(1, "Test");
		Indexed2<String> b = new Indexed2<String>(1, null);

		System.out.println(a.equals(b));
		
		Indexed2<Integer> c = new Indexed2<Integer>(1, 5000);
		Indexed2<Integer> d = new Indexed2<Integer>(1, 5000);
		
		System.out.println(c.equals(d));
		
		System.out.println(c.equals(b));

	}
}
