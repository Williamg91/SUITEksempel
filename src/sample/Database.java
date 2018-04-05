package sample;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.sql.*;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Database {

    String user, pass, url;
    ArrayList<Double> al;
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

    //Insert an arraylist of any size of data, with an ID. Can be called recurring.
    public void insertResults(int personID, ArrayList<Double> al) {
        this.al = al;


        try (PreparedStatement ps = conn.prepareStatement("insert into hospital.vaerdier values(?,?) ")) {

            for (double value : al
                    ) {
                ps.setInt(1, personID);
                ps.setDouble(2, value);
                ps.addBatch();
            }
            ps.executeBatch();


//I parentesen skal der indføres SQL syntax. Dvs. hvad skal der ske i databasen? Med fordel kan det laves i MySQL workbench
            //for så bare at copypastes.
        } catch (SQLException exDe) {
            exDe.printStackTrace();
            System.out.println("Data insertion failed, Writing to file instead");
            //Backup til at gemme i fil.
          /*  try {
                FileWriter fw = new FileWriter("Backupdata.txt", true);

                for (double value : al) {
                    fw.write("Personid:" + personID + ", value :" + value + ",dato:" + LocalDateTime.now() + "\n");

                }
                fw.close();
                System.out.println("lol, ses");
                System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }*/
        }


    }


    ArrayList<Double> indsaetrandomfyld(int size) {

        ArrayList<Double> gylle = new ArrayList<>();
        // System.out.println("Gylles indhold:");

        double min, max;
        min = 35.5;
        max = 38.5;
        Random r = new Random();
        for (int i = 0; i < size; i++) {

            gylle.add(min + (max - min) * r.nextDouble());

            //   System.out.println(gylle.get(i));
        }

        return gylle;
    }

    public ArrayList<Double> getResults(int id) {
//Hvad er så smartest; at have en tabel med undersøgelser, som så er knyttet til en tabel med værdier, der har en fremmednøgle, som forbinder målinger med undersøgelser, og igen med patient?
        al = new ArrayList();
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM hospital.vaerdier where idvaerdier =" + id;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(rs.getDouble(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Skaffet fra db:");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        return al;

    }
/*
    public double[][] getFiles(String fil1, String fil2) {
        double[][] results = null;
        //tid, value

        try {
            Scanner s = new Scanner(new File(fil1));

            ArrayList<Double> list1 = new ArrayList<>();
            while (s.hasNext()){
                list1.add(Double.parseDouble(s.next()));
            }
            s.close();
            s = new Scanner(new File(fil2));
            ArrayList<Integer> list2 = new ArrayList<>();
            while (s.hasNext()){
                list2.add(Integer.parseInt(s.next()));
            }//Parse vores int

            double[] tid = new double[list2.size()];


            double[] values = new double[list1.size()];


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        return results;


    }
*/
}
