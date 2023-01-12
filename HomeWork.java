package javacore;

import java.util.Scanner;
import java.lang.Math;

public class HomeWork {
    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        r= sc.nextDouble();
        System.out.println("Diameter = " + (r*2));
        System.out.println("Perimeter = " + (r*2*Math.PI));
        System.out.println("Area = " + (Math.PI*(r*r)));

    }
}
