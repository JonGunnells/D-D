import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {
    int health = 100;
    int level;
    int experience;
    public static ArrayList<String> stats = new ArrayList<>();
    public static List<String> inv = new ArrayList<String>();

    public static void inventory(){
        inv.add("axe");
        System.out.println(inv);
    }

    public static int roll4(){
        System.out.println("rolling D4");
        Random rando = new Random();
        int number = rando.nextInt(4);
        return number;
    }

    public static int roll6(){
        System.out.println("rolling D6");
        Random rand = new Random();
        int number = rand.nextInt(6);
        return number;
    }

    public static int roll8(){
        System.out.println("rolling D8");
        Random rand = new Random();
        int number = rand.nextInt(8);
        return number;
    }

    public static int roll10(){
        System.out.println("rolling D10");
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

    public static int rollStat(){
        Random rand = new Random();
        int first = rand.nextInt(6);
        int second = rand.nextInt(6);
        int third = rand.nextInt(6);
        int stat = first + second + third;
        System.out.println("Rolling 3 D6");
        System.out.println(first + " + " + second + " + " + third + " = " + stat);
        return stat;
    }

    public static void intro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello traveler, what is your name?");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + ", let us begin your adventure");
        System.out.println("First we must create your character");
    }

    public static void chooseCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What class would you like to be?");
        System.out.println("[Mage/Warrior/Rogue/Priest]");
        String choice = scanner.nextLine();
        System.out.println("ahh yes, " + choice + " is a fine choice");
        if (choice.equalsIgnoreCase("mage")) {
            System.out.println("The mage bends the elements to their will, and those who dare challenge you shall be cast asunder by your awesome might");
        }
        else if (choice.equalsIgnoreCase("warrior")) {
            System.out.println("The warrior is always at the head of battle, with your plate armor and heavy weapons no foe can match your strength");

        }
        else if (choice.equalsIgnoreCase("rogue")) {
            System.out.println("The rogue lives in the shadows, as one you will be no stranger to stealth and there shall be no lock you cant pick nor foe you cant slay");
        }

        else if (choice.equalsIgnoreCase("priest")) {
            System.out.println("The priest uses holy magic to smite their foes, while using it to heal themselves in battle. Your devotion to the light protects you and destroys all who oppose you ");
        }
        else {
            System.out.println("Please Choose an Available Class");
        }



    }

    public static void characterSpecs(){
        System.out.println("now we are going to roll your stats randomly with diee");
    }


}





