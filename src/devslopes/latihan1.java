package devslopes;

import java.util.Scanner;

public class latihan1 {
	public static void main(String [] args) {
		Scanner scInput = new Scanner(System.in);
		int iAge;
		System.out.println("Your Age: "); iAge = scInput.nextInt();
		System.out.println("Your age is " + (iAge * 365) + " Days");
	}
}
