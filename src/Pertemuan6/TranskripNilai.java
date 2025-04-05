package Pertemuan6;


import Pertemuan5.Latihan2.Matakuliah;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk ;
    private List<KartuHasilStudi> kartuHasilStudi;
    private  Mahasiswa mahasiswa;

    public TranskripNilai (Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;

        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public double hitungIPK(){
        double totalBobot = 0;
        int totalSKS = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIps(); // Hitung IPS untuk setiap semester
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalBobot += mk.getIndex() * mk.getSKS();
                totalSKS += mk.getSKS();
            }
        }

        if (totalSKS > 0) {
            this.ipk = totalBobot / totalSKS;
        } else {
            this.ipk = 0;
        }

        return this.ipk;
    }

    public void addKHS (KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display (){
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);

        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println("IPS semester "+ khs.getSemester() + " : " + khs.getIps());
            System.out.println(khs.display());
        }
    }
}
