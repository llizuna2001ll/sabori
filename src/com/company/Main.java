package com.company;

import java.sql.Connection;
import java.sql.Statement;

public class Main  {

    public static void main(String[] args) {
        Txt txt = new Txt("0000016B40D8EA3001000000000000000000000000000000");
        txt.converter();

        String text = txt.getTxt();
        String date = txt.getDat();
        String angle = txt.getAngle();
        String altitude = txt.getAltitude();
        String speed = txt.getSpeed();
        String longitude = txt.getLongitude();
        String latitude = txt.getLatitude();
        String priority = txt.getPriorité();
        String satellite = txt.getSatellites();

        System.out.println(text);




                String insertFields = "INSERT INTO hex(priority,longitude,latitude,altitude,angle,satellites,speed,date) VALUES(";

                String insertValues = text + "','" + priority + "','"  + longitude + ",'" + latitude + "," + altitude + ","+angle+","+ satellite+","+speed+","+date+"')";

                String insertToRegister = insertFields + insertValues;

                try {
                    DataBaseConnection connectNow = new DataBaseConnection();
                    Connection connectDB = connectNow.getConnection();

                    Statement statement = connectDB.createStatement();
                    statement.executeUpdate(insertToRegister);

                } catch (Exception e) {
                    e.printStackTrace();
                    e.getCause();
                }


            }
}


