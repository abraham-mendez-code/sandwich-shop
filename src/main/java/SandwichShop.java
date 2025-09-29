import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        // Declare and initialize the userInput Scanner object to store system input
        Scanner userInput = new Scanner(System.in);

        // Declare and initialize the regularPrice variable to store the regular size price
        double regularPrice = 5.45;

        // Declare and initialize the largePrice variable to store the large size price
        double largePrice = 8.95;

        // Print out message asking user for the size of their sandwich
        System.out.println("Welcome to the Sandwich Shop!\nWhat size will you be ordering today? " +
                "\nAvailable sizes are \'Regular\'(R) and \'Large\'(L): ");

        // Declare and initialize the size variable and store next line of input
        String size = userInput.nextLine();

        // Print out message asking user for their age
        System.out.println("What is your age?: ");
        int age = userInput.nextInt();

        // Declare and initialize cost variable to store the cost
        double cost = 0;

        // Set the price depending on the content of the size variable
        if (size.equalsIgnoreCase("r") || size.toLowerCase().contains("regular")) {

            cost = regularPrice;
            System.out.printf("Your sandwich costs $%.2f.\n", cost);

        } else if (size.equalsIgnoreCase("l") || size.toLowerCase().contains("large")) {

            cost = largePrice;
            System.out.printf("Your sandwich costs $%.2f.\n", cost);

        } else {

            System.out.println("Invalid input please try again.");

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
