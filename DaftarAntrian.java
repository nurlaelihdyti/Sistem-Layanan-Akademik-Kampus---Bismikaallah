public class DaftarAntrian {
    private Node head;
    private int jumlah;

    public DaftarAntrian() {
        head = null;
        jumlah = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void tambah(Antrian a) {
        Node baru = new Node(a);
        if (isEmpty()) {
            head = baru;
        } else {
            Node bantu = head;
            while (bantu.next != null) {
                bantu = bantu.next;
            }
            bantu.next = baru;
        }
        jumlah++;
    }

    public void layani() {
        if (isEmpty()) {
            System.out.println("\n=== ANTRIAN AKADEMIK KAMPUS ===");
            System.out.println("       Antrian kosong!");
            System.out.println("-------------------------------");
            return;
        }
        System.out.println("\n=== ANTRIAN AKADEMIK KAMPUS ===");
        System.out.println("         Dilayani: " + head.data.getNama());
        System.out.println("-------------------------------");
        head = head.next;
        jumlah--;
    }

    public void tampil() {
        System.out.println("\n=== ANTRIAN AKADEMIK KAMPUS ===");
        if (isEmpty()) {
            System.out.println("       Antrian kosong!");
            System.out.println("-------------------------------");
            return;
        }
        Node bantu = head;
        int no = 1;
        while (bantu != null) {
            bantu.data.tampil(no);
            bantu = bantu.next;
            no++;
        }
    }
}
