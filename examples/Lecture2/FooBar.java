public class FooBar {
	public static void main(String[] args) {
		try {
			System.out.println(doSomething(Integer.parseInt(args[0])));
		}
		catch (NumberFormatException e) {
			System.out.println("Input parameter must be a string.");
		}
	}
	
	private static String doSomething(int x) {
		x += 3;
		if (x > 0) {
			return "Quant";
		}
		else if (x == 0) {
			return "0";
		}
		else {
			return "Quint";
		}
	}
}