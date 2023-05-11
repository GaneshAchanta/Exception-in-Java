package basic;

import java.util.Scanner;
//program without exception handling
public class Test {

	public static void main(String[] args) {
		System.out.println("File Opened");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int fno = sc.nextInt();
		System.out.println("Enter the second number");
		int sno = sc.nextInt();
		int div=fno/sno;
		System.out.println("Dividion = "+div );
		System.out.println("File is closed");
		System.out.println("Program End");

	}

}
