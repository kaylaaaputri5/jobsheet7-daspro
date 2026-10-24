import java.util.Scanner;
public class tugas1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int hargaTiket = 50000;
      int jumlah, bayar;
      int totalTiket = 0, totalPenjualan = 0;

      do {
         System.out.println("Masukkan jumlah tiket(0 untuk selesai): ");
         jumlah = sc.nextInt();

         if (jumlah < 0) {
            System.out.println("Jumlah tiket tidak valid. Masukkan lagi!.");
            continue;
         }
         bayar = jumlah*hargaTiket;
         if (jumlah > 10) {
            bayar = bayar*85/100;
         } else if (jumlah > 4) {
            bayar = bayar*90/100;
         }
         if (jumlah > 0) {
            System.out.println("Total bayar adalah: " + bayar);
         }
         
         totalTiket += bayar;
         totalPenjualan += jumlah;

      } while (jumlah != 0);
      System.out.println("Total tiket yang terjual adalah: " + totalTiket);
      System.out.println("Total penjualan adalah: " + totalPenjualan);
   }
}