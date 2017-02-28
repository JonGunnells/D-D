import java.util.Random;
import java.util.Scanner;

public class Enemy {

    public static int enRoll4(){
        Random rando = new Random();
        int number = rando.nextInt(4);
        return number;
    }

    public static int enRoll6(){
        Random rand = new Random();
        int number = rand.nextInt(6);
        return number;

    }

    public static int enRoll8(){
        Random rand = new Random();
        int number = rand.nextInt(8);
        return number;

    }

    public static int enRoll10(){
        Random rand = new Random();
        int number = rand.nextInt(10);
        return number;


    }

    public static int enRoll12(){
        Random rand = new Random();
        int number = rand.nextInt(12);

        return number;
    }

    public static int enRoll20(){
        Random rand = new Random();
        int number = rand.nextInt(20);
        return number;
    }

    public static void firstInteraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("A large troll approaches you, he is at least a foot taller than you. What would you like to do?");
        System.out.println("[Run/Fight/Intimidate]");
        String action = scanner.nextLine();
        if (action.equalsIgnoreCase("run")) {
            System.out.println("you attempt to run, rolling your odds...");
            int troll= enRoll20();
            System.out.println("Enemy rolls " + troll);
            int player = Player.roll20();
            System.out.println("Player rolls " + player);
            if (player < troll) {
                System.out.println("you fail your dexterity check and you trip and fall attempting to run away");
            }
            else {
                System.out.println("You run away successfully and escape the troll");
            }

        }
        else if (action.equalsIgnoreCase("fight")) {
            System.out.println("you attempt to fight the troll, rolling your odds...");
            int player = Player.roll20();
            System.out.println("player rolls " + player);
            int troll = enRoll20();
            System.out.println("Enemy Rolls " + troll);
            if (player < troll) {
                System.out.println("Your attack misses and the troll counters");
            }
            else {
                System.out.println("The troll is cleft in twain!");
                System.out.println("+ 10XP");
            }

        }
        else if (action.equalsIgnoreCase("Intimidate")) {
            System.out.println("you attempt to intimidate the troll, rolling your odds...");
            int player = Player.roll20();
            System.out.println("Player rolls " + player);
            int troll = enRoll20();
            System.out.println("Enemy rolls " + troll);
            if (player < troll ) {
                System.out.println("The troll is not phased by your intimidation attempt");
            }
            else {
                System.out.println("Your intimidation is successful, the troll quickly flees without looking back");
                System.out.println("+ 10XP");
            }
        }


    }

}
