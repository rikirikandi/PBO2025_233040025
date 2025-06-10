package P13_Latihan1_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    private JLabel label;
    private JButton tombol;

    public HelloWorldForm3() {
        label = new JLabel("HelloWorld!");
        tombol = new JButton("Klik Saya");

        add(label);       // menambahkan label ke form
        add(tombol);      // menambahkan tombol ke form

        setLayout(new java.awt.FlowLayout());  // mengatur layout
        setTitle("Form dengan Button");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tombol.addActionListener(this);  // menambahkan event handler
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Tombol ditekan!");  // aksi saat tombol diklik
    }

    public static void main(String[] args) {
        HelloWorldForm3 form = new HelloWorldForm3();
        form.setVisible(true);
    }
}
