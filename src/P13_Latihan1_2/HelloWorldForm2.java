package P13_Latihan1_2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame {
    public HelloWorldForm2() {
        JLabel label = new JLabel("HelloWorld!");
        add(label);

        setTitle("Form HelloWorld");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Tidak ada setVisible(true) di sini
    }
}

