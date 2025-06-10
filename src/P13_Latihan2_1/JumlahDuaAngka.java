package P13_Latihan2_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JumlahDuaAngka extends JFrame implements ActionListener {
    private JTextField fieldAngka1, fieldAngka2;
    private JButton tombolJumlah;

    public JumlahDuaAngka() {
        // Komponen input
        fieldAngka1 = new JTextField(10);
        fieldAngka2 = new JTextField(10);
        tombolJumlah = new JButton("Jumlahkan");

        // Menambahkan listener ke tombol
        tombolJumlah.addActionListener(this);

        // Layout
        setLayout(new FlowLayout());
        add(new JLabel("Angka 1:"));
        add(fieldAngka1);
        add(new JLabel("Angka 2:"));
        add(fieldAngka2);
        add(tombolJumlah);

        // Set properti frame
        setTitle("Penjumlah Dua Angka");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(fieldAngka1.getText());
            int angka2 = Integer.parseInt(fieldAngka2.getText());
            int hasil = angka1 + angka2;

            JOptionPane.showMessageDialog(this, "Hasil: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
        }
    }

    public static void main(String[] args) {
        new JumlahDuaAngka();
    }
}


