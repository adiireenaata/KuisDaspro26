Syahira Auriga Adirenata/264107060132/SIB1D/
import java.util.Scanner;
public class Soal226 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah ruang baca: ");
        int jumlahRuangBaca = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        
        if (jumlahRuangBaca > 0 && jumlahHari > 0) {
            int nomorRuangBaca = 1;
            double totalPengunjung = 0;

            while (nomorRuangBaca <= jumlahRuangBaca) {
                System.out.println("Ruang Baca " + nomorRuangBaca);
                double RataRatapengunjungHarian = 0;

                for (int hari = 1; hari <= jumlahHari; hari++) {
                    double pengunjung = 0;

                    do {
                        System.out.print(" Jumlah pengunjung pada hari " + hari + ": ");
                        pengunjung = sc.nextDouble();

                        if (pengunjung < 0) {
                            System.out.println(" Jumlah pengunjung tidak boleh negatif. Ulangi input!");
                        }
                    } while (pengunjung < 0);

                    RataRatapengunjungHarian += pengunjung;
                }

                System.out.println("Total pengunjung Ruang Baca " + nomorRuangBaca
                        + ": " + RataRatapengunjungHarian);
                totalPengunjung += RataRatapengunjungHarian;
                nomorRuangBaca++;
            }

            System.out.println("==============================");
            System.out.println("Total pengunjung semua ruang baca: " + totalPengunjung);
            System.out.println("Rata-rata pengunjung per ruang baca: " + (totalPengunjung / jumlahRuangBaca));
            System.out.println("Ruang paling ramai: " + (totalPengunjung / jumlahRuangBaca));
            System.out.println("Hari paling ramai: " + (totalPengunjung / jumlahHari));
        }
    }
}
