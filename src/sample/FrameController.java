package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FrameController implements Runnable {
    Database db = new Database();
    public int datalimit = 15;

    public List<Double> scores = db.indsaetrandomfyld(datalimit);
    private TegnGra graphPanel = new TegnGra(scores);
    boolean koer;


    JFrame ramme;


    public FrameController(JFrame ramme) {
        this.ramme = ramme;
        ramme.setSize(1000, 500);
        ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public FrameController() {

    }

    Timer t = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            graphPanel.setScores(db.indsaetrandomfyld(datalimit));


            System.out.println("Repainted");
        }
    });

    public void visMinGraf(boolean koer,JPanel target, CardLayout cl) {

        if (koer) {


            JFrame ost = new JFrame("graf");
            ost.setSize(1000, 500);

            ost.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            //standard opsætning

            //Erklær mit array til at være det her...99 random værdier
            graphPanel = new TegnGra(scores);

           graphPanel.setVisible(true);


            ramme.setLocation(0, 0);
            ost.setLocation(0, ramme.getHeight());
//tilføj til min ramme et nyt panel med de tegnede værdier. Det er bare et arraylist
            if (!t.isRunning()) {
                t.start();
                System.out.println("Timer started");
            }
        }
    }


    @Override
    public void run() {
        System.out.println("run startet");

        //t.start();

    }
}
