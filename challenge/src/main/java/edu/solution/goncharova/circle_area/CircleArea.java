package edu.solution.goncharova.circle_area;

import java.util.Locale;
import java.util.Scanner;

public class CircleArea {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]){

        input.useLocale(Locale.US);
        System.out.print("Input: ");
        double length = input.nextDouble();
        double area = (length * length)/(4 * Math.PI);
        System.out.println("Output: " + roundAvoid(area,9));
    }
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}