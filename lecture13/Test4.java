public class Test4 {
	public static void main(String[] args) {

		boolean valid = false;
		int value = -1;
		for (int i = 0; i < args.length && !valid; i++) {
			try {
				value = Integer.parseInt(args[i]);
				valid = true;
			} catch (NumberFormatException e) {
				System.out.println("not a valid number: " + args[i]);
			}
		}
		if (valid) {
			System.out.println("value = " + value);
		} else {
			System.out.println("no valid number was found");
		}
	}
}