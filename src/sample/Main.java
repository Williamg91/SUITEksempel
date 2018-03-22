package sample;

import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main extends Application {

    static Database db = new Database();

    public static void main(String[] args)


    {
        // db = new Database();
        //db.insertResults();

//Panelclass pc = new Panelclass();

        ArrayList<Double> al = db.indsaetrandomfyld(10);


       // db.insertResults(2018, al);
        db.getResults(2018);


        // javaFXLogic(args);


    }


    static void javaFXLogic(String[] args) {

        System.out.println("Main online");

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //   FXMLLoader root = new FXMLLoader(Main.class.getResource("sample.fxml"));
        //parent
        AnchorPane scene = null;
        try {
            scene = FXMLLoader.load(getClass().getResource("sample.fxml"));
        } catch (Exception ITE) {
            ITE.printStackTrace();
        }


        stage.setTitle("SUIT");

        Image icon = new Image("http://icons.iconarchive.com/icons/th3-prophetman/game/256/GDI-icon.png");
        stage.getIcons().add(icon);
        try {
            stage.setScene(new Scene(scene));
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        //stage.setScene(root);
        stage.show();


    }
}
