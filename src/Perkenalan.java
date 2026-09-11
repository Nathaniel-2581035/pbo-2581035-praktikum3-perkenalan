import java.util.Scanner;

public class Perkenalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Umur Anda: ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan NIM Anda: ");
        int nim = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan Anda: ");
        double tinggi = scanner.nextDouble();

        System.out.print("Masukkan Asal Kota Anda: ");
        String asal_kota = scanner.nextLine();

        System.out.println("Halo " + nama + ", umur Anda " + umur + " Tahun " + );


    }
}
