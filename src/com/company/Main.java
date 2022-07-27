package com.company;

import java.sql.Connection;
import java.sql.Statement;

public class Main  {

    public static void main(String[] args) {
        Txt txt = new Txt("0000016B40D8EA3001000000000000000000000000000000");
        txt.converter();

        String text = txt.getTxt();
        String date = txt.getDat();
        Integer angle = txt.getAngle();
        Integer altitude = txt.getAltitude();
        Integer speed = txt.getSpeed();
        Integer longitude = txt.getLongitude();
        Integer latitude = txt.getLatitude();
        Integer priority = txt.getPriorité();
        Integer satellite = txt.getSatellites();






                String insertFields = "INSERT INTO hex(txt,priority,longitude,latitude,altitude,angle,satellites,speed,datee) VALUES('";

                String insertValues = text + "','" + priority + "','"  + longitude + "' ,'" + latitude + "','" + altitude + "','"+angle+"','"+ satellite+"','"+speed+"','"+date+"');";

                String insertToRegister = insertFields + insertValues;

                System.out.println(insertToRegister);
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


