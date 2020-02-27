// From 2017 Exam

public class Indexed1 {
	int index;
	String value;

	public Indexed1(int index, String value) {
		this.index = index;
		this.value = value;

	}

	public int getIndex() {
		return index;
	}

	public String getValue() {
		return value;
	}

	public boolean equals(Indexed1 other) {

		if (other == null)
			return false;

		if (this.index != other.index)
			return false;

		if (this.value == null || other.value == null) {
			return this.value == null && other.value == null;
		}

		return this.value.equals(other.value);

	}

	// Not part of the exam
	static public boolean isSameAs(Indexed1 a, Indexed1 b) {

		if (a == null || b == null) {
			return a == null && b == null;
		}

		if (a.index != b.index)
			return false;

		if (a.value == null || b.value == null) {
			return a.value == null && b.value == null;
		}

		return a.value.equals(b.value);
	}

	public static void main(String args[]) {

		Indexed1 a = new Indexed1(1, "Test");
		//Indexed1 a = new Indexed1(1, "Test");
		//Indexed1 b = null;
		Indexed1 b = new Indexed1(1, null);

		System.out.println(a.equals(b));

		System.out.println(isSameAs(a, b));
	}
}