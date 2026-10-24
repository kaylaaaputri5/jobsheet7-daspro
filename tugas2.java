import java.util.Scanner;
public class tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jml, bayar;
        int totalTiket = 0, totalPenjualan = 0;

        do {
            System.out.println("Masukkan jumlah tiket(0 untuk selesai): ");
            jml = sc.nextInt();

            if (jml < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!.");
                continue;
            }
            bayar = jml*hargaTiket;
            if (jml > 10) {
                bayar = bayar*15/100;
            } else if (jml > 4) {
                bayar = bayar*10/100;
            }
            if (jml > 0) {
                System.out.println("Total bayar: " + bayar);
            }
            totalTiket += jml;
            totalPenjualan += bayar;
        } while (jml > 0);
        System.out.println("Total tiket yang terjual adalah: " + totalTiket);
        System.out.println("Total penjualan adalah: " + totalPenjualan);
    }
}