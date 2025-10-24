package tugasjobsheet7;
import java.util.Scanner;

public class Parkir09 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tarifMobil = 3000;
    int tarifMotor = 2000;
    int tarifMaksimal = 12500;
    int totalPendapatan = 0;

System.out.println("===Program Pembayaran Parkir===");

while (true) {
    System.out.println("\nMasukkan jenis kendaraan (mobil/motor, atau 0 untuk berhenti)");
    String jenis = sc.next();

if (jenis.equalsIgnoreCase("0")) {
    System.out.println("Perhitungan selesai!");
    break;
}

if (jenis.equalsIgnoreCase("Mobil") || jenis.equalsIgnoreCase("Motor")) {

System.out.print("Masukkan durasi parkir (jam): ");
int durasi = sc.nextInt();

int totalBayar;
if (durasi > 5) {
    totalBayar = tarifMaksimal;
} else if (jenis.equalsIgnoreCase("Mobil")) {
    totalBayar = durasi * tarifMobil;
} else { 
    totalBayar = durasi * tarifMotor;
}

 System.out.println("Total bayar parkir: Rp " +totalBayar);
    totalPendapatan += totalBayar;

} else {
    System.out.println("Jenis kendaraan tidak dikenal!");
    continue;
}
}

System.out.println("\nTotal pendapatan parkir hari ini: Rp " +totalPendapatan);

}
}