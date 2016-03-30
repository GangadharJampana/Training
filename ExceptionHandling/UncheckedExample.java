public class UncheckedExample {
	public void divide(int a, int b) {
		int c = 0;
		try {
			c = a/b;
		}
		catch(ArithmeticException kl) {
			System.out.println("b should not be zero");
		}	
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		UncheckedExample ex = new UncheckedExample();
		ex.divide(4, 0);
	}
}
