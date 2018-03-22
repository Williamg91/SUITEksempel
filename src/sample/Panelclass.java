package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.util.Vector;

public class Panelclass extends JFrame {

    double[] data;
    private JPanel panel1;
    private JButton startProgramButton;
    private JTextField øvreTextField;
    private JTextField nedreTextField;
    private JPanel graphPanel;
    private JTextField a1234561234TextField;
    private JButton afslutPatientButton;
    private JList list1;
    public JButton fireItUpButton;

    public Panelclass() {
        this.setSize(900, 600);
        this.setTitle("SUIT");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setupLists();
        this.setContentPane(panel1);

        this.setLocationRelativeTo(null);
        //   this.pack();
        this.setVisible(true);




/*
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
        */
        startProgramButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

            }
        });


    }

    private void setupLists() {
        JCheckBox knap1 = new JCheckBox("Sensor I");
        JCheckBox knap2 = new JCheckBox("Sensor 2");

        DefaultListModel dlm = new DefaultListModel();
        list1.setModel(dlm);list1.add(knap1);
        list1.add(knap2);


    }


}
