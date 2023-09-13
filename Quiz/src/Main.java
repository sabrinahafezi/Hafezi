import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //-----------------------------------------------------------------------------------

        System.out.print("Are you ready for a quiz? (Y/N): ");
        Scanner scanner = new Scanner(System.in);

        String ready = scanner.next();
        if (ready == null) {
            ready = "";
        }

        if(ready.toUpperCase().equals("Y")) {
            System.out.println("Okay, here it comes!");
        } else if(ready.toUpperCase().equals("N")) {
            System.out.println("No? Alright, maybe another time.");
        } else {
            System.out.println("Invalid response. Please provide a Y or N answer.");
        }

        //-----------------------------------------------------------------------------------
        if(ready.toUpperCase().equals("Y")) {

            int correctCount = 0;

            //-----------------------------------------------------------------------------------
            System.out.println("\nQ1) What type of pasta is a short, hollow cylinder?");
            System.out.println("\n    A) Cavatappi");
            System.out.println("    B) Fusilli");
            System.out.println("    C) Rigatoni");

            String q1A = scanner.next();
            if(q1A == null) {
                q1A = "";
            }

            if (q1A.toUpperCase().equals("A")) {
                System.out.println("No, it's rigatoni.");
            } else if (q1A.toUpperCase().equals("B")) {
                System.out.println("No, it's rigatoni.");
            } else if (q1A.toUpperCase().equals("C")) {
                System.out.println("You got it!");
                correctCount++;
            } else {
                System.out.println("Completely wrong!");
            }

            //-----------------------------------------------------------------------------------

            System.out.println("\nQ2) Where are french fries from?");
            System.out.println("\n    A) Belgium");
            System.out.println("    B) Italy");
            System.out.println("    C) France");

            String q2A = scanner.next();
            if(q2A == null) {
                q2A = "";
            }

            if (q2A.toUpperCase().equals("A")) {
                System.out.println("Yes!");
                correctCount++;
            } else if (q2A.toUpperCase().equals("B")) {
                System.out.println("That's not it. :(");
            } else if (q2A.toUpperCase().equals("C")) {
                System.out.println("That's not it. :(");
            } else {
                System.out.println("Completely wrong!");
            }

            //-----------------------------------------------------------------------------------

            System.out.println("\nQ3) Which of these is not a type of pizza?");
            System.out.println("\n    A) Neapolitan.");
            System.out.println("    B) Venetian.");
            System.out.println("    C) Deep-dish.");

            String q3A = scanner.next();
            if(q3A == null) {
                q3A = "";
            }

            if (q3A.toUpperCase().equals("A")) {
                System.out.println("Nope. Venetian pizza isn't a thing.");
            } else if (q3A.toUpperCase().equals("B")) {
                System.out.println("Way to go!");
                correctCount++;
            } else if (q3A.toUpperCase().equals("C")) {
                System.out.println("Nope. Venetian pizza isn't a thing.");
            } else {
                System.out.println("Completely wrong!");
            }

            //-----------------------------------------------------------------------------------

            System.out.println("\nOverall, you got " + correctCount + " out of 3 correct.");
            System.out.println("Thanks for playing!");

        }

    }
}