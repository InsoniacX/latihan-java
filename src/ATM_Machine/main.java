package ATM_Machine;

import java.util.Scanner;

public class main {
	public main (String [] args) {
		Scanner scInput = new Scanner(System.in);
		int iAge;
		System.out.println("Your Age: "); iAge = scInput.nextInt();
		System.out.println("Your age is " + (iAge * 365.25) + "Days");
	}
}

