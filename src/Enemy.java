import java.util.Random;
import java.util.Scanner;

public class Enemy {


    public static void firstInteraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("A large troll approaches you, he is at least a foot taller than you.");
        System.out.println("He says something in a primitive language but you cannot understand him. What would you like to do?");
        System.out.println("[Run/Fight/Intimidate]");
        String action = scanner.nextLine();

        if (action.equalsIgnoreCase("run")) {
            System.out.println("you attempt to run, rolling your odds...");
            int player = Player.roll20() + Player.dexterity;
            System.out.println("Player rolls " + player);
            int troll= Player.roll20();
            System.out.println("Enemy rolls " + troll);
            if (player < troll) {
                System.out.println("you fail your dexterity check and you trip and fall attempting to run away");
            }
            else {
                System.out.println("You run away successfully and escape the troll");
            }

        }
        else if (action.equalsIgnoreCase("fight")) {
            System.out.println("you attempt to fight the troll, rolling your odds...");
            int player = Player.roll20() + Player.strength;
            System.out.println("player rolls " + player);
            int troll = Player.roll20();
            System.out.println("Enemy Rolls " + troll);
                if (player < troll) {
                    System.out.println("Your attack misses and the troll counters");
                    System.out.println("-3 HP");
                }
                else if (player == 1) {
                System.out.println("you attempt to attack and trip, comically landing on your face");
                System.out.println("-5 HP");
                }
                else if (player == 20) {
                System.out.println("You land a critical blow, causing the troll to explode");
                System.out.println("+ 10XP");
                System.out.println("+ 05XP (50% Crit XP)");
                }
                else {
                System.out.println("The troll is cleft in twain!");
                System.out.println("+ 10XP");
                }

        }
        else if (action.equalsIgnoreCase("Intimidate")) {
            System.out.println("you attempt to intimidate the troll, rolling your odds...");
            int player = Player.roll20()+ Player.charisma;
            System.out.println("Player rolls " + player);
            int troll = Player.roll20();
            System.out.println("Enemy rolls " + troll);
            if (player < troll ) {
                System.out.println("The troll is not phased by your intimidation attempt");
            }
            else if (player == 1) {
                System.out.println("you attempt to attack and trip, comically landing on your face");
                System.out.println("-5 HP");
            }
            else if (player == 20) {
                System.out.println("You land a critical blow, causing the troll to explode");
                System.out.println("+ 10XP");
                System.out.println("+ 05XP (50% Crit XP)");
            }
            else {
                System.out.println("Your intimidation is successful, the troll quickly flees without looking back");
                System.out.println("+ 10XP");
            }
        }


    }

}
