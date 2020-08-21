package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius for the circle: ");

        if (!input.hasNextDouble()) {
            System.out.println("You entered invalid radius for the circle.");
        } else {
            double radius = input.nextDouble();

            while (radius < 0) {
                System.out.println("Please enter a positive number for the radius: ");
                radius = input.nextDouble();
            }

            Double area = Circle.getArea(radius);
            System.out.println("Area of the circle is :" + area);
        }
    }
}
