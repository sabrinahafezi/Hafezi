import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Ok, " + name + ", how old are you?");

        int age;
        try {
            age = scanner.nextInt();

            if (age < 16) {
                System.out.println("You can't drive, " + name + ".");
            } else if (age >= 16 && age <= 17) {
                System.out.println("You can drive, but you can't vote, " + name + ".");
            } else if (age >= 18 && age <= 24) {
                System.out.println("You can vote but you can't rent a car, " + name + ".");
            } else if (age >= 25) {
                System.out.println("You can do pretty much anything, " + name + ".");
            }


        } catch(Exception e) {
            System.out.println("Please try again and enter a valid value for your age.");
        }

    }
}



