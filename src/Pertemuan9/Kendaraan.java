package Pertemuan9;

public class Kendaraan {
    protected String merk;
    protected int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }
    public String getMerk() {
        return merk;
    }
    public int getTahun() {
        return tahun;
    }
}

