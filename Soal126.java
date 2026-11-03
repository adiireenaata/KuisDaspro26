import java.util.Scanner;
    public class Soal126 {
        public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah mahasiswa: "); 
        int jumlahMahasiswa = sc.nextInt();
            if (jumlahMahasiswa <= 0) {
                System.out.println("Jumlah mahasiswa harus > 0.");
            } else {
                int nomorMahasiswa = 1;
                double rataTertinggi = -1;
                int mahasiswaTerbaik = 0;

                while (nomorMahasiswa <= jumlahMahasiswa) {
                    System.out.println("Mahasiswa " + nomorMahasiswa);
                    double totalNilai = 0;

                    for (int n = 1; n <= 3; n++) {
                        double nilai;

                        do {
                            System.out.print(" Nilai dari Mata Kuliah " + n + ": ");
                            nilai = sc.nextDouble();

                            if (nilai < 0 || nilai > 100) {
                                System.out.println(" Nilai harus 0-100. Ulangi input!");
                            }
                        } while (nilai < 0 || nilai > 100);

                        totalNilai += nilai;
                    }

                    double rataNilai = totalNilai / 3;

                    System.out.println("Mahasiswa " + nomorMahasiswa
                            + ": nilai rata-rata = " + rataNilai);

                    if (rataNilai > rataTertinggi) {
                        rataTertinggi = rataNilai;
                        mahasiswaTerbaik = nomorMahasiswa;
                    }

                    nomorMahasiswa++;
                }

                System.out.println("==============================");
                System.out.println("Mahasiswa terbaik    : " + mahasiswaTerbaik);
                System.out.println("Rata-rata tertinggi : " + rataTertinggi);
                System.out.println("Mahasiswa tuntas    : " + jumlahMahasiswa);
                System.out.println("Mahasiswa remidi    : " + (jumlahMahasiswa - mahasiswaTerbaik));
            }
        }
    }
