import java.util.Scanner;
import java.util.Random;

public static void main(String[] args) {

    java.util.Random rand = new java.util.Random();

    Scanner in = new Scanner(System.in);

    int rollCount = 1;
    String playAgain = "n";

    int die1;
    int die2;
    int die3;
    int sum;

    // Print header
    System.out.printf("%-8s%-8s%-8s%-8s%-8s%n",
            "Roll", "Die1", "Die2", "Die3", "Sum");
    System.out.println("------------------------------------------------");

    do {
        do {


            die1 = rand.nextInt(6) + 1; // generates a random number between 1 and 6
            die2 = rand.nextInt(6) + 1; // generates a random number between 1 and 6
            die3 = rand.nextInt(6) + 1; // generates a random number between 1 and 6

            sum = die1 + die2 + die3;


            // Print roll results
            System.out.printf("%-8d%-8d%-8d%-8d%-8d%n",
                    rollCount++, die1, die2, die3, +sum);

            rollCount++;

        } while (!(die1 == die2 && die2 == die3)); // continue rolling until all three dice show the same number


        System.out.print("Do you want to roll again? (Y/N): ");
        playAgain = in.nextLine();
        playAgain = playAgain.toUpperCase(); // forced to be a capital letter


    }
        while (playAgain.equals("Y")) ; // continue rolling until the user decides to stop


}