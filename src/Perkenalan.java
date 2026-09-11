public class Perkenalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Umur Anda: ");
        Int umur = scanner.nextInt();

        System.out.println("Halo " + nama + ", umur Anda " + umur + " Tahun.");


    }
}
