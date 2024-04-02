package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        while (true) {
            System.out.println("Enter a radius:");
            String userInput = input.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("Error: Empty input. Please enter a valid number.");
                continue;
            }

            try {
                radius = Double.parseDouble(userInput);

                if (radius < 0) {
                    System.out.println("Error: Negative number. Please enter a positive number.");
                    continue;
                }

                break;

            } catch (NumberFormatException e) {
                System.out.println("Error: Non-numeric character. Please enter a valid number.");
            }
        }


        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}

