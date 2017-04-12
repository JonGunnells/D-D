import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {
    static boolean first = false;
    static String specialization;
    static String race;
    static int health = 100;
    static int strength;
    static int dexterity;
    static int perception;
    static int charisma;
    static int level;
    static int experience;
    static int buff;
    static int gold;

    public static ArrayList<String> stats = new ArrayList<>();
    public static List<String> inv = new ArrayList<String>();

    public static void inventory(){
        System.out.println(inv);
    }

    public static int roll4(){
        Random rando = new Random();
        int number = rando.nextInt(4);
        return number;
    }

    public static int roll6(){
        Random rand = new Random();
        int number = rand.nextInt(5) + 1;
        return number;
    }

    public static int roll8(){
        Random rand = new Random();
        int number = rand.nextInt(8);
        return number;
    }

    public static int roll10(){
        Random rand = new Random();
        int number = rand.nextInt(10);
        return number;
    }

    public static int roll12(){
        System.out.println("rolling D12");
        Random rand = new Random();
        int number = rand.nextInt(12);
        System.out.println(number);
        return number;
    }

    public static int roll20(){
        Random rand = new Random();
        int number = rand.nextInt(20);
        if (number == 1){
            System.out.println("Critical Failure!");
        }
        if (number == 20) {
            System.out.println("Critical Roll!");
        }
        return number;
    }

//    public static int rollStat(){
//        Random rand = new Random();
//        int first = rand.nextInt(6);
//        int second = rand.nextInt(6);
//        int third = rand.nextInt(6);
//        int stat = first + second + third;
//        System.out.println("Rolling 3 D6");
//        System.out.println(first + " + " + second + " + " + third + " = " + stat);
//        return stat;
//    }

    private static void prologue(){
        System.out.println("Hello, and thank you");
        System.out.println("This game is a text-based adventure that uses virtual dice rolls to decide the outcomes ");
        System.out.println("of various interactions that happen to your character. There are 6 different dice that will ");
        System.out.println("be rolled depending on the situation. As you complete puzzles and fight enemies you will gain experience ");
        System.out.println("that will level up your character. At any time you can press _______ to bring up your stats and inventory. ");
        System.out.println("Now prepare to enter the realm of ________. ");
        System.out.println("Before you lies great adventure to be had, and great treasure to claim.");
        System.out.println("");
    }

    public static void chars(){
        System.out.println("");
        System.out.println("Human: +3 to Dexterity roll");
        System.out.println("Orc: + 3 to Strength roll");
        System.out.println("Dwarf: +3 to Charisma roll");
        System.out.println("Elf: + 3 to Perception roll");
    }

    public static void intro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is this your first time playing? [Y/N]");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            Player.first = true;
            prologue();

        }
        System.out.println("Hello traveler, what is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + ", let us begin your adventure");
        System.out.println("First we must create your character");
    }

    public static String chooseClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What class would you like to be?");
        System.out.println("[Mage/Warrior/Rogue/Priest]");
        specialization = scanner.nextLine();
        System.out.println("Ahh yes, " + specialization + " is a fine choice");
        if (specialization.equalsIgnoreCase("mage")) {
            System.out.println("The mage bends the elements to their will, and those who dare challenge you shall be cast asunder by your awesome might");
        }
        else if (specialization.equalsIgnoreCase("warrior")) {
            System.out.println("The warrior is always at the head of battle, with your plate armor and heavy weapons no foe can match your strength");

        }
        else if (specialization.equalsIgnoreCase("rogue")) {
            System.out.println("The rogue lives in the shadows, as one you will be no stranger to stealth and there shall be no lock you cant pick nor foe you cant slay");
        }

        else if (specialization.equalsIgnoreCase("priest")) {
            System.out.println("The priest uses holy magic to smite their foes, while using it to heal themselves in battle. Your devotion to the light protects you and destroys all who oppose you ");
        }
        else {
            System.out.println("Please Choose an Available Class");
        }
        return specialization;
    }

    public static String chooseRace(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your race");
        System.out.println("[Human/Orc/Dwarf/Elf]");
        if (Player.first == true) {
            Player.chars();
        }
        race = scanner.nextLine();
        if(race.equalsIgnoreCase("Human")) {
        }
        else if(race.equalsIgnoreCase("Orc")) {
            //add stat
        }
        else if (race.equalsIgnoreCase("Dwarf")) {
            //add stat
        }
        else if (race.equalsIgnoreCase("Elf")) {
            //add stat
        }
        else {
            System.out.println("Please choose a valid class");

        }
        return race;
    }


    public static int rollStrength(){
        System.out.println("now we are going to roll your stats randomly with dice");
        System.out.println("we will roll 3 6-sided die and the sum will be your stat");
        System.out.println("Hit ENTER");
        Main.scanner.nextLine();
        System.out.println("Rolling Strength...");
        int first = roll6();
        int second = roll6();
        int third = roll6();
        int stat = first + second + third;
        System.out.println(first + " + " + second + " + " + third);
        System.out.println("Strength = " + stat);
        strength = stat;
        return strength;
    }

    public static int rollDexterity(){
        System.out.println("Rolling Dexterity...");
        int first = roll6();
        int second = roll6();
        int third = roll6();
        int stat = first + second + third;
        System.out.println(first + " + " + second + " + " + third);
        System.out.println("Dexterity = " + stat);
        dexterity = stat;
        return dexterity;
    }

    public static int rollPerception(){
        System.out.println("Rolling Perception...");
        int first = roll6();
        int second = roll6();
        int third = roll6();
        int stat = first + second + third;
        System.out.println(first + " + " + second + " + " + third);
        System.out.println("Perception = " + stat);
        perception = stat;
        return perception;
    }

    public static int rollCharisma(){
        System.out.println("Rolling Charisma...");
        int first = roll6();
        int second = roll6();
        int third = roll6();
        int stat = first + second + third;
        System.out.println(first + " + " + second + " + " + third);
        System.out.println("Charisma = " + stat);
        charisma = stat;
        return charisma;
    }

    public static void printCharacter(){
        System.out.println("Here is an overview of your character");
        if (Player.race.equalsIgnoreCase("Human")) {
            Player.dexterity += 3;
        }
        else if(Player.race.equalsIgnoreCase("Orc")) {
            Player.strength += 3;
        }
        else if(Player.race.equalsIgnoreCase("Dwarf")) {
            Player.charisma += 3;
        }
        else if(Player.race.equalsIgnoreCase("Elf")) {
            Player.perception += 3;
        }
        System.out.println("Level: " + level);
        System.out.println("Race: " + race);
        System.out.println("Class: " + specialization);
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Perception: " + perception);
        System.out.println("Charisma: " + charisma);
        System.out.println("Gold: " + gold);
    }

    public static void beginning() {
        System.out.println("You awake, above you you see the wide open blue sky. You hear the sound of water sloshing around you, you sit up and see you are on a raft ");
        System.out.println("Your head is fuzzy, your lips are chapped from lying in the sun. You scan the small raft and find a small satchel that has been nailed to one of the logs");
        System.out.println("You have no idea where you are or how you got here, but you do know that night will be here soon, and that is not a good time to be on a raft.");
        System.out.println("");
        System.out.println("What would you like to do?");
        String action = Main.scanner.nextLine();
        if (action.contains("bag")) {
            System.out.println("You open the bag and find 10 GOLD COINS, a HEALTH POTION, and a note that reads 'This should get you there -M'");
            gold += 5;
            inv.add("Health Potion");


        }

    }

}







