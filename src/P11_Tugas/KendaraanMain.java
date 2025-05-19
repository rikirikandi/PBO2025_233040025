package P11_Tugas;

// Kelas utama untuk menjalankan program
public class KendaraanMain {
    public static void main(String[] args) {
        // Membuat objek dari kelas MobilListrik
        MobilListrik tesla = new MobilListrik();

        // Memanggil method-method yang telah diimplementasikan
        tesla.nyalakanMesin();      // output: Mobil listrik dinyalakan.
        tesla.jenisBahanBakar();    // output: Bahan bakar: Listrik.
        tesla.matikanMesin();       // output: Mobil listrik dimatikan.
    }
}

