public class Smoothing {

	private static void testSmooth(double[] a) {
		if (a == null) {
			System.out.println("Not a valid value, null, for the method testSmooth.");
			return;
		}
		System.out.print("Running testSmooth on: ");
		printArray(a);
		smooth(a);
		System.out.print("After smoothing: ");
		printArray(a);
	}

	private static void printArray(double[] a) {

		StringBuffer buffer;

		if (a == null || a.length == 0)
			System.out.println("[]");

		buffer = new StringBuffer();

		buffer.append("[");
		buffer.append(a[0]);
		for (int i = 1; i < a.length; i++) {
			buffer.append(", ");
			buffer.append(a[i]);
		}

		buffer.append("]");

		System.out.println(buffer.toString());

	}

	private static void smooth(double[] a) {

		double[] b;

		if (a == null || a.length == 0 || a.length == 1)
			return;

		b = new double[a.length];

		for (int i = 0; i < a.length; i++)
			b[i] = a[i];

		// We know that the length is >= 2 here.
		a[0] = (b[0] + b[1]) / 2;

		for (int i = 1; i < a.length - 1; i++)
			a[i] = (b[i - 1] + b[i] + b[i + 1]) / 3;

		a[a.length - 1] = (b[a.length - 1] + b[a.length - 2]) / 2;
	}

	public static void main(String args[]) {
		double[] test;
		test = new double[] { 0.0, 5.0, 0.0, 5.0 };
		Smoothing.testSmooth(test);

		test = new double[] { 0.0, 5.0, 5.0, 0.0 };
		Smoothing.testSmooth(test);

		test = new double[] { 0.0 };
		Smoothing.testSmooth(test);

		test = new double[] { 0.0, 1.0 };
		Smoothing.testSmooth(test);

		test = new double[] { 2.0, 3.0, 1.0, 5.0 };
		Smoothing.testSmooth(test);

		test = null;
		Smoothing.testSmooth(test);
	}
}