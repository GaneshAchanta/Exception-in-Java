package basic;

import java.util.Scanner;
//program with try-catch-finally exception handling
public class Test3 {

	public static void main(String[] args) {
		System.out.println("File Opened");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int fno = sc.nextInt();
		System.out.println("Enter the second number");
		int sno = sc.nextInt();
		try {
		int div=fno/sno;
		System.out.println("Dividion = "+div );
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Don't enter second number as zero");
		}
		finally {
			sc.close();
			System.out.println("Iam finally");
		}
		System.out.println("Exception Handled");
		System.out.println("Program End");

	}

}
