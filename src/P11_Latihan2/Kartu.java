package P11_Latihan2;

//Interface Kartu mendefinisikan kontrak untuk otentikasi dan enkripsi
public interface Kartu {

    // Method abstrak untuk otentikasi PIN, mengembalikan nilai boolean
    public boolean otentikasi(String pin);

    // Method abstrak untuk mengenkripsi PIN, mengembalikan string hasil enkripsi
    public String encode(String pin);
}
