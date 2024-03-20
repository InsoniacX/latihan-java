package soloLearn1;

import java.util.Scanner;

public class switchCase {
	public static void main ( String [] args ) {
		Scanner scInput = new Scanner(System.in);
		int day;
		
		System.out.println("Insert day number: "); day = scInput.nextInt();

		switch(day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		}
	}
}
