package P11_Tugas;

// Kelas MobilListrik adalah turunan dari kelas abstrak Mobil
// dan harus mengimplementasikan semua method dari interface Kendaraan dan abstract class Mobil
public class MobilListrik extends Mobil {

    // Implementasi method dari interface Kendaraan
    @Override
    public void nyalakanMesin() {
        System.out.println("Mobil listrik dinyalakan.");
    }

    // Implementasi method dari interface Kendaraan
    @Override
    public void matikanMesin() {
        System.out.println("Mobil listrik dimatikan.");
    }

    // Implementasi method abstrak dari kelas Mobil
    @Override
    public void jenisBahanBakar() {
        System.out.println("Bahan bakar: Listrik.");
    }
}

