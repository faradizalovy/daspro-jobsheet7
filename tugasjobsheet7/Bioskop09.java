package tugasjobsheet7;
import java.util.Scanner;

public class Bioskop09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalSemua = 0;
        String lanjut = "";

    System.out.println("===Program Penjualan Tiket Bioskop===");

    do {
        System.out.print("Masukkan jumlah tiket yang dibeli (masukkan 0 untuk berhenti): ");
        jumlahTiket = sc.nextInt();

    if (jumlahTiket < 0) {
        System.out.println("Jumlah tiket tidak valid! Masukkan kembali. \n");
        continue;
    }

    if (jumlahTiket == 0) {
        System.out.println("Penjualan selesai.\n");
        break;
    }

    double diskon = 0;
    if (jumlahTiket > 10) {
        diskon = 0.15;
    } else if (jumlahTiket > 4) {
        diskon = 0.10;
    }

    double totalHarga = jumlahTiket * hargaTiket * (1 - diskon);
    totalSemua += totalHarga;

    System.out.println("Total harga pembelian: Rp " +(int) totalHarga);
    if (diskon > 0) {
        System.out.println("Anda mendapat diskon " +(int) (diskon * 100)+ "%");
    }

    System.out.print("\nApakah ingin memasukkan transaksi lain? (ya/tidak): ");
    sc.nextLine();
    lanjut = sc.nextLine();

} while (lanjut.equalsIgnoreCase("ya"));

System.out.println("\nTotal penjualan tiket hari ini: Rp " +totalSemua);

        
    }
}

