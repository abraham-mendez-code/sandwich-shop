package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    /*
        EXERCISE 1
        Create a Java application named SandwichShop. This will be a point of sales
        application to calculate the cost of a sandwich.
        Remember: When creating a new Java project, create a new git repository and
        commit your changes often! Don’t forget to push to github.com. Always create
        the Github repository before creating a new Java project.
            Step 1
                Prompt the user for the size of the sandwich (1 or 2):
                a. 1: Regular: base price $5.45
                b. 2: Large: base price $8.95
                Prompt the user for their age:
                a. Student (17 years old or younger) — receive a 10% discount
                b. Seniors (65 years old or older) — receive a 20% discount
                Display the cost of the sandwich to the screen
            Step 2
                1. Ensure all your changes are committed and pushed to GitHub
                2. Send your repository URL to your Instructor

        EXERCISE 2
        Modify the SandwichShop from the last exercise to allow customers to order a
        "loaded" sandwich (double everything).
            Step 1
                Prompt the user for the size of the sandwich (1 or 2):
                a. 1: Regular: base price $5.45
                b. 2: Large: base price $8.95

            Prompt the user if they would like the sandwich "loaded" (yes/no). If so there is
            an additional cost for a loaded sandwich
                a. Regular: $1.00
                b. Large: $1.75

            Prompt the user for their age:
                a. Student (17 years old or younger) — receive a 10% discount
                b. Seniors (65 years old or older) — receive a 20% discount
            Display the cost of the sandwich to the screen

            Step 2
                1. Ensure all your changes are committed and pushed to GitHub
                2. Send your repository URL to your Instructor
     */

    public static void main(String[] args) {

        // Declare and initialize the userInput Scanner object to store system input
        Scanner userInput = new Scanner(System.in);

        // Declare and initialize the regularPrice variable to store the regular size price
        double regularPrice = 5.45;
        double regularLoaded = 1.0;

        // Declare and initialize the largePrice variable to store the large size price
        double largePrice = 8.95;
        double largeLoaded = 1.75;

        // Print out message asking user for the size of their sandwich
        System.out.println("Welcome to the Sandwich Shop!" +
                "\nAvailable sizes:\n\tRegular: $5.45 \n\tLarge: $8.95 ");

        System.out.println("What size would you like?");

        // Declare and initialize the size variable and store next line of input
        String size = userInput.nextLine();



        // Print out message asking user if they want their sandwich loaded
        System.out.println("Would you like your sandwich \'loaded\'?");

        // Declare and initialize the s variable to store user input
        String s =  userInput.nextLine();

        // Declare nad initialize the loaded variable to check if the user wants it loaded
        boolean loaded = s.toLowerCase().contains("yes") || s.toLowerCase().contains("y");

        // Print out message asking user for their age
        System.out.println("What is your age?: ");

        // Declare and initialize the age variable to contain input age
        int age = userInput.nextInt();

        // Declare and initialize cost variable to store the cost
        double cost = 0;

        // Set the price depending on the content of the size variable and if the sandwich is loaded
        if (size.equalsIgnoreCase("r") || size.toLowerCase().contains("regular")) {

            cost = regularPrice;
            System.out.printf("Your sandwich costs $%.2f\n", cost);
            if (loaded) {
                cost += regularLoaded;
                System.out.printf("Your sandwich is loaded for an additional $%.2f\n", regularLoaded);
            }

        } else if (size.equalsIgnoreCase("l") || size.toLowerCase().contains("large")) {

            cost = largePrice;
            System.out.printf("Your sandwich costs $%.2f\n", cost);
            if (loaded) {
                cost += largeLoaded;
                System.out.printf("Your sandwich is loaded for an additional $%.2f\n", largeLoaded);
            }

        } else {

            System.out.println("Invalid size selection.");
            System.exit(0);

        }

        // Apply discount depending on the content of the age variable
        if (age < 18 && cost > 0) {

            cost -= cost * .1;
            System.out.println("Student discount applied 10% off!");
            System.out.printf("Your total is $%.2f", cost);

        } else if (age > 64 && cost > 0) {

            cost -= cost * .2;
            System.out.println("Senior discount applied 20% off!");
            System.out.printf("Your total is $%.2f", cost);

        } else if (cost > 0){

            System.out.println("No discount applied.");
            System.out.printf("Your total is $%.2f", cost);

        }

    }

}
