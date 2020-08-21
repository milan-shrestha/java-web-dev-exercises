package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven: ");
        Double miles = input.nextDouble();

        System.out.println("Enter gallons of gas consumed: ");
        Double gas = input.nextDouble();

        Double milesPerGallon = miles / gas;
        System.out.println("Your car gives you " + milesPerGallon + " miles/gallon.");
    }
}
