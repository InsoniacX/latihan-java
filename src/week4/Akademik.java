package week4;

import java.util.Scanner;

public class Akademik {
    public static void main(String[] args) {
        int n;
        System.out.print("Masukkan Jumlah data : ");

        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        String[] nim = new String[n];
        String[] nama = new String[n];
        Double[] ipk = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Masukkan NIM :");
            nim[i] = inp.next();
            System.out.println("Masukkan NAMA :");
            nama[i] = inp.next();
            System.out.println("Masukkan IPK :");
            ipk[i] = inp.nextDouble();
        }

        // Display student data
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.println("NIM: " + nim[i] + ", Nama: " + nama[i] + ", IPK: " + ipk[i]);
        }
    }
}