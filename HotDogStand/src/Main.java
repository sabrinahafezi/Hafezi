import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello there, how many hot dogs would you like to order?");

        Scanner scanner = new Scanner(System.in);

        int amountFood = -1;
        while(amountFood == -1) {
            try {
                amountFood = scanner.nextInt();
                if(amountFood == 0) {
                    System.out.println("If you don't want any hot dogs, then how many drinks would you like?");
                } else {
                    System.out.println("How many drinks would you like to order along with your " + amountFood + " hot dogs?");
                }
            } catch(Exception e) {
                String cancel = scanner.next();
                if(cancel.equalsIgnoreCase("X")) {
                    System.exit(0);
                } else {
                    amountFood = -1;
                    System.out.println("I don't understand your request. Please provide a numeric answer, or enter X to exit.");
                }

            }
        }

        int amountDrinks = scanner.nextInt();

        if (amountFood == 0 && amountDrinks == 0) {
            System.out.println("We don't sell anything other than hot dogs and drinks.");
            System.exit(0);
        }

        if (amountFood == 0) {
            System.out.println("Your total for " + amountDrinks + " drinks is $" + ((2 * amountDrinks) + ((2 * amountDrinks) * (0.12))) + ". Thank you!");
        } else if (amountDrinks == 0) {
            System.out.println("Your total for " + amountFood + " hot dogs is $" + ((5.5 * amountFood) + ((5.5 * amountFood) * (0.12))) + ". Thank you!");
        } else {
            System.out.println("Your total for " + amountFood + " hot dogs and " + amountDrinks + " drinks is $" + (((5.5 * amountFood) + (2 * amountDrinks)) + ((5.5 * amountFood) + (2 * amountDrinks)) * (0.12)) + ". Thank you!");
        }

    }
}