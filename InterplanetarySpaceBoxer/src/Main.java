import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double weight, total1, total2, total3, total4, total5, total6, finalWeight = 0;
        int planet;


        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Hi Julio Cesar Chavez Mark VII, please enter your current earth weight: ");
            weight = scanner.nextDouble();

            System.out.println("\nI have information for the following planets:");
            System.out.println("    1. Venus" + "    2. Mars  " + "   3. Jupiter");
            System.out.println("    4. Saturn  " + " 5. Uranus  " + " 6. Neptune");


            System.out.print("\nWhich planet are you visiting? ");
            planet = scanner.nextInt();

            total1 = weight * 0.78;
            total2 = weight * 0.39;
            total3 = weight * 2.65;
            total4 = weight * 1.17;
            total5 = weight * 1.05;
            total6 = weight * 1.23;


            if (planet == 1) {
                finalWeight = total1;

            } else if (planet == 2) {
                finalWeight = total2;

            } else if (planet == 3) {
                finalWeight = total3;

            } else if (planet == 4) {
                finalWeight = total4;

            } else if (planet == 5) {
                finalWeight = total5;

            } else if (planet == 6) {
                finalWeight = total6;
            } else {
                throw new Exception();
            }

            System.out.println();
            System.out.println("Your weight would be " + finalWeight + " pounds on that planet. ");

        } catch(Exception e) {
            System.out.println("Please try again and enter a valid value.");
        }
    }
}