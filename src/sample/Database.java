package sample;

import java.util.ArrayList;
import java.sql.*;


public class Database {

    String user, pass, url;
    ArrayList al;
    Connection conn;

    public Database() {

        try {

            url = "jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false";
            user = "SUIT";
            pass = "Bullshit2018";
            Class.forName("com.mysql.jdbc.Driver").newInstance();


            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection active");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }


    public void insertResults() {

        double[] gylle = indsaetrandomfyld();
        try {


            //insert values
            PreparedStatement stmt = conn.prepareStatement("insert INTO hospital.undersogelser(id,values) values (?,?)");

            for (int i = 0; i < gylle.length; i++) {
                //Dvs. den første kolonne, vi definerer. 1 = første søjle, dvs. hvis første søjle er ID, forsøger den at komme
                //vores indtastede værdi ind på den først fundne søjles plads.
                stmt.setInt(1,0);
                stmt.setDouble(2, gylle[i]);

                stmt.executeUpdate();
                //Det samme nummer, men for søjle 2:
            }


//I parentesen skal der indføres SQL syntax. Dvs. hvad skal der ske i databasen? Med fordel kan det laves i MySQL workbench
            //for så bare at copypastes.
        } catch (Exception exDe) {
            exDe.printStackTrace();
            System.out.println("o fuck, i failed at inserting");
        }
    }

    double[] indsaetrandomfyld() {
        double[] gylle = new double[9];
        System.out.println("Gylles indhold");
        for (int i = 0; i < gylle.length; i++) {
            gylle[i] = Math.random() * 37 + 1;

            System.out.println(i + ":" + gylle[i]);
        }
        return gylle;
    }

    public ArrayList<Double> getResults(int id) {


        return al;

    }


}
