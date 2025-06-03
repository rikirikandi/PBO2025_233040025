package P14_Tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("233040025", "Riki");
        Mahasiswa m2 = new Mahasiswa("233040040", "Marchiko");

        m1.displayInfo();
        System.out.println();
        m2.displayInfo();

        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}

