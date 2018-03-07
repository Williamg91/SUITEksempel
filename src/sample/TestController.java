package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.EventListener;

public class TestController {

    @FXML
    SplitPane.Divider splitdivider;
    LineChart lineChart;
    HBox hBox;
    VBox vBox;

    Database db = new Database();


    public TestController() {




    }

    public void tilpasDivider(SplitPane.Divider divider) {
        this.splitdivider = divider;

        System.out.println("shit du trykkede på mig");
    }


}
