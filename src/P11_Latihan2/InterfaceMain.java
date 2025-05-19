package P11_Latihan2;

//Kelas utama untuk menjalankan program interface
public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kode bank dan PIN
        KartuElektronik kartu = new KartuElektronik("IF111", "123");

        // Menampilkan hasil otentikasi dengan input PIN "123"
        System.out.println("Otentikasi: " + kartu.otentikasi("123"));

        // Menampilkan hasil encode dari PIN
        System.out.println("Enkripsi PIN: " + kartu.encode("123"));
    }
}
