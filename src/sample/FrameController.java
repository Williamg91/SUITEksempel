package sample;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FrameController {

     private List<Double> scores;
JFrame ramme;


    public FrameController(JFrame ramme) {
        this.ramme=ramme;
        ramme.setSize(500, 500);


    }



    public  void fireItUp(JButton knap){
        JFrame ramme = new JFrame();
        ramme.setSize(900,600);
        ramme.add(new TegnGra(scores));
        ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramme.setVisible(true);

    }


}
