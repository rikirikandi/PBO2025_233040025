package Pertemuan9;

public class InheritanceMain {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", (2020));
        System.out.println("Merk: " + mobil1.getMerk());
        System.out.println("Tahun : " + mobil1.getTahun());
    }
}
