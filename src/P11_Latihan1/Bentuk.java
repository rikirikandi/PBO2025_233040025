package P11_Latihan1;

//Kelas abstrak Bentuk sebagai superclass
public abstract class Bentuk {
    // Konstanta PHI untuk perhitungan luas lingkaran/tabung
    protected double PHI = 3.14;

    // Atribut jari-jari, dapat diakses oleh subclass
    protected int jari2;

    // Konstruktor untuk inisialisasi jari-jari
    public Bentuk(int jari2) {
        super();              // memanggil konstruktor superclass (Object)
        this.jari2 = jari2;   // menyimpan nilai jari2
    }

    // Method abstrak untuk menghitung luas, harus dioverride oleh subclass
    public abstract double luas();

    // Getter untuk mendapatkan nilai jari2
    public int getJari2() {
        return jari2;
    }

    // Setter untuk mengubah nilai jari2
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}