package basic;

import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try {
			int b = 42/a; //generate arithmetic exception where a is zero
			try { //nested try block
				if(a==1)
					a = a/(a-a); //generate arithmetic exception when a is 1
				if(a==2) {
					int c[]= {1};
					c[42]=99; //generate ArrayInexOutOfBoundsException when a is 2
				}
			}//nested try
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds: "+e);
			}
		}//outer try
		catch(ArithmeticException e) {
			System.out.println("Divide by Zero : "+e);
		}
		System.out.println("Exception is handled");

	}

}
