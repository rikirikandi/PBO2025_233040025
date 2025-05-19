package P11_Latihan1;

//Kelas Tabung juga merupakan subclass dari Bentuk
public class Tabung extends Bentuk {
    // Atribut tinggi khusus milik Tabung
    private int tinggi;

    // Konstruktor default (tidak dipakai dalam soal, tapi disiapkan)
    public Tabung() {
        super(0);  // jari-jari default 0
    }

    // Konstruktor utama menerima jari-jari dan tinggi
    public Tabung(int jari2, int tinggi) {
        super(jari2);        // memanggil konstruktor Bentuk
        this.tinggi = tinggi; // menyimpan nilai tinggi
    }

    /*
     * Override method luas dari Bentuk.
     * Rumus luas tabung: 2 * PHI * r * (r + t)
     */
    @Override
    public double luas() {
        return 2 * PHI * jari2 * (jari2 + tinggi);
    }

    // Getter untuk tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Setter untuk tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
