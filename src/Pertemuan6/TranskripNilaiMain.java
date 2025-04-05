package Pertemuan6;

import Pertemuan5.Latihan2.Matakuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("Dr.Ir Leony Lidya,MT", "0412106801");
        Dosen dosen2 = new Dosen("Fajar Darmawan, ST., M.Kom", "0402088504");
        Dosen dosen3 = new Dosen("Sandika Galih S.T., M.T.", "0425098502");
        Dosen dosen4 = new Dosen("Siroj Nur Ulum, S.T., M.T.", "2124129103");
        Dosen dosen5 = new Dosen("Ade Sukendar, S.T., M.T.", "0429018502");

        // Create object matakuliah
        Matakuliah mk1 = new Matakuliah("001","Algoritma Pemrograman 1", "B", 3, dosen1);
        Matakuliah mk2 = new Matakuliah("002","Algoritma Pemrograman 2", "A", 3, dosen2);
        Matakuliah mk3 = new Matakuliah("003","PBO", "A", 3, dosen4);
        Matakuliah mk4 = new Matakuliah("004","Rekayasa Perangkat Lunak", "B", 3, dosen5);
        Matakuliah mk5 = new Matakuliah("005","Pemograman Web", "A", 3, dosen3);


        // membuat object khs
        KartuHasilStudi khs = new KartuHasilStudi("2");
        KartuHasilStudi khs2 = new KartuHasilStudi("3");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk5);
        khs2.addMataKuliah(mk4);
        khs2.addMataKuliah(mk3);


        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040025", "Riki");

        // membuat object transkripnilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.addKHS(khs2);

        // Hitung IPK keseluruhan
        transkrip.hitungIPK();

        transkrip.display();
    }

}