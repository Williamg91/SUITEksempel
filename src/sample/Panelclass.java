package sample;

import javax.swing.*;

public class Panelclass extends JFrame {

    double[] data;
    private JPanel panel1;
    private JButton startButton;

    public Panelclass(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.setContentPane(panel1);

        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);


    }

}
