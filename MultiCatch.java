package basic;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		System.out.println("try - catch - finally");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int a = sc.nextInt();
		String s = null;
		try {
			System.out.println(s.length());
			int b = 42/a; //raised ArithmeticException when value is zero
			int c[]= {1};
			c[42]=99; //raised ArrayIndexOutOfBoundsException 
		}
		catch(ArithmeticException e) {
			System.out.println("Divided by Zero : "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds : "+e);
		}
		catch(Exception e) {//to handle unexpected exceptions
			System.out.println(e);
		}
		System.out.println("Exception is Handled");
	}

}
