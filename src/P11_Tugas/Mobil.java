package P11_Tugas;

// Abstract class Mobil yang mengimplementasikan interface Kendaraan
// dan menambahkan method abstrak baru bernama jenisBahanBakar()
public abstract class Mobil implements Kendaraan {
    // Method ini harus diimplementasikan oleh subclass
    abstract void jenisBahanBakar();
}

