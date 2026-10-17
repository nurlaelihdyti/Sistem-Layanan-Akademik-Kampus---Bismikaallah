import java.util.Scanner;

public class DemoSistem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        DaftarAntrian daftar = new DaftarAntrian();
        int pilih;

        do {
            System.out.println("\n=== ANTRIAN AKADEMIK KAMPUS ===");
            System.out.println("      1. Tambah antrian          ");
            System.out.println("      2. Tampilkan antrian       ");
            System.out.println("      3. Layani antrian          ");
            System.out.println("      0. Keluar                  ");
            System.out.print("      Pilih: ");
            pilih = Integer.parseInt(sc.nextLine()); 

            switch (pilih) {
                case 1:
                    System.out.println("\n=== ANTRIAN AKADEMIK KAMPUS ===");
                    System.out.print("    Nama mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("    Keperluan      : ");
                    String keperluan = sc.nextLine();
                    System.out.print("    Tanggal        : ");
                    String tanggal = sc.nextLine();
                    daftar.tambah(new Antrian(nama, keperluan, tanggal));
                    System.out.println("\n    --Berhasil ditambahkan!--");
                    System.out.println("================================");
                    break;
                case 2:
                    daftar.tampil();
                    break;
                case 3:
                    daftar.layani();
                    break;
                case 0:
                    System.out.println("\n================================");
                    System.out.println(" Terima kasih, Antrian Selesai!");
                    System.out.println("================================\n");
                    break;
                default:
                    System.out.println("-------------------------------");
                    System.out.println("     Pilihan tidak valid!");
                    System.out.println("-------------------------------");
            }
        } while (pilih != 0);
        sc.close();
    }
}