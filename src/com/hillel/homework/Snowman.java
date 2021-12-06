package com.hillel.homework;

public class Snowman {

    public static void main(String[] args) {
        double r1 = 1.0;
        double r2 = 0.5;
        double r3 = 0.2;


        double volume1 = (float) 4 / 3 * (Math.PI) * Math.pow(r1, 3);
        double volume2 = (float) 4 / 3 * (Math.PI) * Math.pow(r2, 3);
        double volume3 = (float) 4 / 3 * (Math.PI) * Math.pow(r3, 3);

        double allVolume = volume1 + volume2 + volume3;
        double weight = allVolume / 0.7;

        System.out.println(weight);
    }
}