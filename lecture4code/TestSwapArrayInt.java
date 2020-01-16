public class TestSwapArrayInt {
	public static void swap(int[] xs) {
		int[] ys;
		ys = new int[2];
		ys[0] = xs[1];
		ys[1] = xs[0];
		xs = ys;
	}

	public static void main(String[] args) {
		int[] xs;
		xs = new int[2];
		xs[0] = 15;
		xs[1] = 21;
		swap(xs);
		System.out.println(xs[0]);
		System.out.println(xs[1]);
	}
}