package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FrameController implements Runnable {
    Database db = new Database();
    private List<Double> scores = db.indsaetrandomfyld(300);
    private JPanel graphPanel = new TegnGra(scores);


    JFrame ramme;


    public FrameController(JFrame ramme) {
        this.ramme = ramme;
        ramme.setSize(1000, 500);
        ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.run();

    }


    public void visMinGraf(boolean koer) {
        if (koer) {


            JFrame ost = new JFrame("graf");
            ost.setSize(1000, 500);
            ost.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ost.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            //standard opsætning
            scores = db.indsaetrandomfyld(99);
            //Erklær mit array til at være det her...99 random værdier
            graphPanel = new TegnGra(scores);
            ost.add(graphPanel);
            ost.setVisible(true);
            ost.setLocation(0, ramme.getHeight());
            ramme.setLocation(0, 0);
//tilføj til min ramme et nyt panel med de tegnede værdier. Det er bare et arraylist
            run();

        }
    }


    @Override
    public void run() {
        System.out.println("run startet");
        Timer t = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                graphPanel = new TegnGra(scores);

                graphPanel.repaint();
                System.out.println("Repainted");
            }
        }
        );
        t.start();

    }
}
