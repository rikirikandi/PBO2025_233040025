package P11_Latihan2;

//KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {
    // Atribut untuk menyimpan kode bank dan PIN yang tersimpan
    private String kodeBank;
    private String pin;

    // Konstruktor untuk mengisi kode bank dan PIN
    public KartuElektronik(String kodeBank, String pin) {
        super();             // memanggil konstruktor superclass (Object)
        this.kodeBank = kodeBank; // menyimpan kode bank
        this.pin = pin;           // menyimpan PIN
    }

    // Implementasi method otentikasi dari interface Kartu
    @Override
    public boolean otentikasi(String pinInput) {
        // Bandingkan input PIN dengan PIN yang tersimpan
        if (pin.equals(pinInput)) {
            return true;  // Jika sama, otentikasi berhasil
        } else {
            return false; // Jika tidak sama, gagal
        }
    }

    // Implementasi method encode dari interface Kartu
    @Override
    public String encode(String pin) {
        // Simulasi enkripsi sederhana: balikkan string PIN
        String hasil = "";
        for (int i = pin.length() - 1; i >= 0; i--) {
            hasil += pin.charAt(i);
        }
        return hasil;
    }
}
