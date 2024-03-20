package soloLearn1;

import java.util.Scanner;

public class Modules {
	public static void main (String [] args) {
		Scanner angka = new Scanner(System.in);
		int x; 
		int y;
		
		System.out.println("Angka Pertama: "); x = angka.nextInt();
		System.out.println("Angka Kedua: "); y = angka.nextInt();
		
		System.out.println("Jumlahnya adalah = " + (x + y));
	}
}
