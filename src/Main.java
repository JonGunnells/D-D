
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You run into a Troll, do you wish to fight? [Y/N}]");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                int roll = Player.roll20();
                if (roll < 10) {
                    System.out.println("you lose");
                } else {
                    System.out.println("The Troll is Cleft in Twain!");
                }


            }


        }

    }
}


