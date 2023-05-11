package basic;

import java.util.Scanner;

public class BalanceException extends Exception {
	public BalanceException(String s) {
		super(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Balance");
		int balance = sc.nextInt();
		try {
			if(balance < 1000) {
				BalanceException be = new BalanceException ("No funds in an account");
				throw be;
			}
			else
				System.out.println("Enjoy the Week End");
		}
		catch(BalanceException e) {
			e.printStackTrace();
		}
		
	}

}
