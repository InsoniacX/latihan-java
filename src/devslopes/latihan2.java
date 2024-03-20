package devslopes;

import java.util.Scanner;

public class latihan2 {
	public static void main(String [] args) {
		Scanner scInput = new Scanner(System.in);
		int iAngkaPertama, iAngkaKedua;
		
		System.out.println("Masukkan Nomor Pertama : "); iAngkaPertama = scInput.nextInt();
		System.out.println("Masukkan Nomor Kedua : "); iAngkaKedua = scInput.nextInt();
		
		int result = iAngkaPertama + iAngkaKedua;
		
		if (result < 100) {
			System.out.println(result + "\nTrue");
		} else {
			System.out.println(result + "\nFalse");
		}
	}
}
