package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.util.Vector;
import java.awt.Toolkit.*;

public class Panelclass extends JFrame {

    double[] data;
    private JPanel panel1;
    private JButton startProgramButton;
    private JTextField øvreTextField;
    private JTextField nedreTextField;
    private JPanel graphPanel;
    private JTextField a1234561234TextField;
    private JButton afslutPatientButton;
    public JSplitPane splitter;
    private JTextField textField1;
    private JLabel pulsLabel;
    private JLabel tempLabel;
    private JList list1;
    public JButton fireItUpButton;

    public Panelclass() {
        FrameController fc = new FrameController(this);
        this.setSize(1200, 600);
        this.setTitle("SUIT");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


//        setupLists();
        this.setContentPane(panel1);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        this.setLocation(0, 100);
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
                CardLayout cl (= graphPanel.getLayout();
                //We utilize the CardLayout for adding and showing a new TegnGra panel as a Card. This Card gets repainted.
                fc.visMinGraf(true, graphPanel, graphPanel);
                Panelclass.super.setSize(splitter.getDividerLocation() + 100, Panelclass.super.getHeight());

            }
        });


    }


}
