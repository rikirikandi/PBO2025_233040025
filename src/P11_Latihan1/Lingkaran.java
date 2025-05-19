package P11_Latihan1;

//Kelas Lingkaran adalah subclass dari Bentuk
public class Lingkaran extends Bentuk {

    // Konstruktor untuk Lingkaran, menerima nilai jari2 dan diteruskan ke superclass
    public Lingkaran(int jari2) {
        super(jari2); // memanggil konstruktor Bentuk
    }

    /*
     * Override method luas dari Bentuk.
     * Rumus luas lingkaran: PHI * r * r
     */
    @Override
    public double luas() {
        return PHI * jari2 * jari2;
    }
}
