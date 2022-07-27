package com.company;

public class Main  {

    public static void main(String[] args) {
        Txt txt = new Txt("0000016B40D8EA3001000000000000000000000000000000");
        txt.converter();

        txt.getDat();
        txt.getAngle();
        txt.getAltitude();
        txt.getSpeed();
        txt.getLongitude();
        txt.getLatitude();
        txt.getPriorité();
        txt.getSatellites();

        String date = txt.getDat();

        System.out.println(date);

    }
}
