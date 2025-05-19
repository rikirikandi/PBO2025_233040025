package P11_Latihan1;

//Kelas utama (main class) untuk menjalankan program
public class BentukMain {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dengan jari2 = 10
        Lingkaran lingkaran = new Lingkaran(10);

        // Membuat objek Tabung dengan jari2 = 10 dan tinggi = 5
        Tabung tabung = new Tabung(10, 5);

        // Menampilkan informasi Lingkaran
        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + lingkaran.getJari2());
        System.out.println("luas: " + lingkaran.luas());

        System.out.println(); // Baris kosong

        // Menampilkan informasi Tabung
        System.out.println("== Tabung ==");
        System.out.println("jari2: " + tabung.getJari2() + ", Tinggi:" + tabung.getTinggi());
        System.out.println("luas: " + tabung.luas());
    }
}
