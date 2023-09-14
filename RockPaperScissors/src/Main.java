import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to play rock, paper, scissors? (Y/N) ");
        String play = input.nextLine();
        boolean playingGame = play.equalsIgnoreCase("Y");
        boolean notPlayingGame = play.equalsIgnoreCase("N");


        if (notPlayingGame) {
            System.out.println("No? Alright, maybe another time.");
        }

        int computerScore = 0;
        int playerScore = 0;

        while (playingGame) {

            System.out.println("Choose rock, paper, or scissors. Enter 'r' for rock, 'p' for paper, and 's' for scissors. To exit enter 'x'.");
            System.out.println("Your move:");

            int computerChoice = (int) (Math.random() * 3);

            String playerChoice = input.nextLine();

            String computer;


            if (computerChoice == 0) ; {
                computer = "Rock";
            }

            if (computerChoice == 1) {
                computer = "Paper";
            }

            if (computerChoice == 2) {
                computer = "Scissors";
            }


            if (playerChoice.equalsIgnoreCase("P")) {
                System.out.println();
                System.out.print("Player choice: Paper \n");
                System.out.println("Computer choice: " + computer);
            }

            if (playerChoice.equalsIgnoreCase("R")) {
                System.out.println();
                System.out.print("Player choice: Rock");
                System.out.println();
                System.out.println("Computer choice: " + computer);
            }

            if (playerChoice.equalsIgnoreCase("S")) {
                System.out.println();
                System.out.print("Player choice: Scissors");
                System.out.println();
                System.out.println("Computer choice: " + computer);

            }

            if (playerChoice.equalsIgnoreCase("X")) {
                System.out.print("Thanks for playing!");
                System.exit(0);
            }

            String win = "You win! :D";
            String lose = "You lose. :(";


            if( (playerChoice.equalsIgnoreCase("R") && computer.equalsIgnoreCase("Scissors")) || (playerChoice.equalsIgnoreCase("P") && computer.equalsIgnoreCase("Rock")) || (playerChoice.equalsIgnoreCase("S") && computer.equalsIgnoreCase("Paper"))) {

                playerScore++;
                System.out.println();
                System.out.println(win);

            }

            else if((computer.equalsIgnoreCase("Paper") && playerChoice.equalsIgnoreCase("R")) || (computer.equalsIgnoreCase("Scissors") && playerChoice.equalsIgnoreCase("P")) || (computer.equalsIgnoreCase("Rock") && playerChoice.equalsIgnoreCase("S"))){

                computerScore++;
                System.out.println();
                System.out.println(lose);
            }

            else if((computer.equalsIgnoreCase("Paper") && playerChoice.equalsIgnoreCase("P")) || (computer.equalsIgnoreCase("Scissors") && playerChoice.equalsIgnoreCase("S")) || (computer.equalsIgnoreCase("Rock") && playerChoice.equalsIgnoreCase("R"))){

                System.out.println();
                System.out.println("It's a tie!");
            }

            else{
                System.out.println("Invalid selection. Please input a valid value.");
            }

            System.out.println();
            System.out.println("Wins: "     + playerScore);
            System.out.println("Losses: " + computerScore);

            System.out.println();
            System.out.println("*****************************************************************************************************");

        }

    }

}