package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panelclass extends JFrame {

    double[] data;
    private JPanel panel1;
    private JButton startProgramButton;
    private JTextField øvreTextField;
    private JFormattedTextField Cpr;
    private JTextField nedreTextField;
    private JPanel graphPanel;
    private JComboBox comboBox1;
    public JButton fireItUpButton;

    public Panelclass() {
        this.setSize(800, 500);
        this.setTitle("SUIT");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        this.setContentPane(panel1);

        this.setLocationRelativeTo(null);
     //   this.pack();
        this.setVisible(true);




        øvreTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(øvreTextField.getText().equals("Øvre"));
                øvreTextField.setText("");

            }
        });
        nedreTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(nedreTextField.getText().equals("Nedre"));
                nedreTextField.setText("");

            }
        });
    }

}
