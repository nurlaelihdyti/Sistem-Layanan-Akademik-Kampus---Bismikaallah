public class Antrian extends Mahasiswa { // Clas Anak (extends class induk)
    private String keperluan;
    private String tanggal;

    public Antrian(String nama, String keperluan, String tanggal) {
        super(nama);
        this.keperluan = keperluan;
        this.tanggal = tanggal;
    }

    public void tampil(int nomor) {
        System.out.println(nomor + ". " + nama + " | " + keperluan + " | " + tanggal);
    }
}
