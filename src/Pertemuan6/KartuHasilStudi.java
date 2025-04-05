package Pertemuan6;

import Pertemuan5.Latihan2.Matakuliah;
import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public KartuHasilStudi(String semester){
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMataKuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display(){
        StringBuilder sb = new StringBuilder();
        for( Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }
    public void hitungIps(){
        double totalBobot = 0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalBobot += mk.getIndex() * mk.getSKS();
            totalSKS += mk.getSKS();
        }

        if (totalSKS > 0) {
            this.ips = totalBobot / totalSKS;
        } else {
            this.ips = 0;
        }
    }

    public double getIps() {
        return ips;
    }

    public String getSemester() {
        return semester;
    }
}
