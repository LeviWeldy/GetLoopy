import java.util.Scanner;

public static void main(String[] args) {

    String playA;
    String playB;
    String playAgain = "Y";

    Scanner in = new Scanner(System.in);

    do {

//Move for Player A
        System.out.print("Enter move for player A [RPS]: ");
        do {
            playA = in.nextLine();
            playA = playA.toUpperCase(); // forced to be a capital letter
            if (playA.equals("R") || playA.equals("P") || playA.equals("S")) {
                System.out.println("Player A plays: " + playA);
            } else {
                System.out.println("Invalid move for player A, please input [RPS]");
                System.out.print("Enter move for player A [RPS]: ");
            }
        }
        while (!playA.equals("R") && !playA.equals("P") && !playA.equals("S"));

//Move for Player B
        System.out.print("Enter move for player B [RPS]: ");
        do {
            playB = in.nextLine();
            playB = playB.toUpperCase(); // forced to be a capital letter
            if (playB.equals("R") || playB.equals("P") || playB.equals("S")) {
                System.out.println("Player B plays: " + playB);
            } else {
                System.out.println("Invalid move for player B, please input [RPS]");
                System.out.print("Enter move for player B [RPS]: ");
            }
        }
        while (!playB.equals("R") && !playB.equals("P") && !playB.equals("S"));


//Checks to see tie
        if (playA.equals("R") && playB.equals("R")) {
            System.out.println("Rock Vs Rock, It's a tie!");
        } else if (playA.equals("P") && playB.equals("P")) {
            System.out.println("Paper Vs Paper, It's a tie!");
        } else if (playA.equals("S") && playB.equals("S")) {
            System.out.println("Scissors Vs Scissors, It's a tie!");


            //Checks to see if A wins
        } else if (playA.equals("R") && playB.equals("S")) {
            System.out.println("Rock Breaks Scissors!");
            System.out.println("Player A wins!");
        } else if (playA.equals("P") && playB.equals("R")) {
            System.out.println("Paper Covers Rock!");
            System.out.println("Player A wins!");
        } else if (playA.equals("S") && playB.equals("P")) {
            System.out.println("Scissors Cuts Paper!");
            System.out.println("Player A wins!");
        }

        //Checks to see if B wins
        else if (playB.equals("R") && playA.equals("S")) {
            System.out.println("Rock Breaks Scissors!");
            System.out.println("Player B wins!");
        } else if (playB.equals("P") && playA.equals("R")) {
            System.out.println("Paper Covers Rock!");
            System.out.println("Player B wins!");
        } else if (playB.equals("S") && playA.equals("P")) {
            System.out.println("Scissors Cuts Paper!");
            System.out.println("Player B wins!");
        }

        System.out.print("Play again? [Y/N]: ");
        playAgain = in.nextLine();

    }
    while (playAgain.equals("Y") || playAgain.equals("y"));{




    }
}