public class FooBar {
	public static void main(String[] args) {
		System.out.println(doSomething(Integer.parseInt(args[0])));
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