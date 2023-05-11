package basic;

public class RethrowingDivide {
	public static void divide() {
		int x,y,z;
		try {
			x = 6;
			y = 0;
			z = x/y;
			System.out.println(x + "/" + y + "=" + z);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught in Divide()");
			System.out.println("Cannot divide by Zero in Intezer Division");
			throw e; // rethrows an Exception
		}
	}

	public static void main(String[] args) {
		System.out.println("Start of main()");
		try {
			divide();
		}
		catch(ArithmeticException e) {
			System.out.println("Rethrown Exception caught in main()");
			System.out.println(e);
		}
	}

}
