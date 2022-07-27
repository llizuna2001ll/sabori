package com.company;

import java.text.SimpleDateFormat;

public class Txt {
    String txt;
    String dat;
    String priorité;
    String Longitude;
    String Latitude;
    String Altitude;
    String Angle;
    String Satellites;
    String Speed;

    public Txt(String txt) {
        this.txt = txt;
    }

    SimpleDateFormat format1 =new SimpleDateFormat("E dd MM yyyy HH:mm:ss");

    public String getTxt() {
        return txt;
    }

    public String getDat(){
        dat = dat.replace("null", "");
        long dec= Long.parseLong(dat, 16);
        SimpleDateFormat format1 =new SimpleDateFormat("E dd MM yyyy HH:mm:ss");

         System.out.println(format1.format(dec));
         return dat;
    }

    public String getPriorité()  {
        priorité = priorité. replace("null", "");
        System.out.println(Integer.parseInt(priorité,16));
        return priorité;
    }

    public String getLongitude() {
        Longitude = Longitude. replace("null", "");
        System.out.println(Integer.parseInt(Longitude,16));
        return Longitude;
    }

    public String getLatitude() {
        Latitude = Latitude. replace("null", "");
        System.out.println(Integer.parseInt(Latitude,16));
        return Latitude;
    }

    public String getAltitude() {
        Altitude = Altitude. replace("null", "");
        System.out.println(Integer.parseInt(Altitude,16));
        return Altitude;
    }

    public String getAngle() {
        Angle = Angle. replace("null", "");
        System.out.println(Integer.parseInt(Angle,16));
        return Angle;
    }

    public String getSatellites() {
        Satellites = Satellites. replace("null", "");
        System.out.println(Integer.parseInt(Satellites,16));
        return Satellites;
    }

    public String getSpeed() {
        Speed = Speed. replace("null", "");
        System.out.println(Integer.parseInt(Speed,16));
        return Speed;
    }

    public void converter(){
        for(int i=0;i<txt.length();i++){
            if(i<16){
                this.dat=this.dat + this.txt.charAt(i);
            }
            else if(i>15 && i<18){
                this.priorité=this.priorité+this.txt.charAt(i);
            }
            else if (i>17 && i<26){
                this.Longitude=this.Longitude+this.txt.charAt(i);
            }
            else if (i>25 && i<34){
                this.Latitude=this.Latitude+txt.charAt(i);
            }
            else if (i>33 && i<38){
                this.Altitude=this.Altitude+txt.charAt(i);
            }
            else if (i>37 && i<42){
                this.Angle=this.Angle+txt.charAt(i);
            }
            else if (i>41 && i<46){
                this.Satellites=this.Satellites+txt.charAt(i);
            }
            else {
                this.Speed=this.Speed+this.txt.charAt(i);
            }
        }


    }
}
