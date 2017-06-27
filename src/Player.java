import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {
    static boolean beginner;
    static String specialization;
    static String race;
    static int health = 100;
    static int level = 1;
    static int strength, dexterity, perception, charisma, experience, buff, gold;

    public static List<String> inv = new ArrayList<String>();

    public static void inventory() {
        System.out.println("Inventory = " +inv);
        System.out.println("Gold = " + gold);
    }

    public static int roll4() {
        Random rando = new Random();
        int number = rando.nextInt(3) + 1;
        return number;
    }

    public static int roll6() {
        Random rand = new Random();
        int number = rand.nextInt(5) + 1;
        return number;
    }

    public static int roll8() {
        Random rand = new Random();
        int number = rand.nextInt(7) + 1;
        return number;
    }

    public static int roll10() {
        Random rand = new Random();
        int number = rand.nextInt(9) + 1;
        return number;
    }

    public static int roll12() {
        System.out.println("rolling D12");
        Random rand = new Random();
        int number = rand.nextInt(11) + 1;
        System.out.println(number);
        return number;
    }

    public static int roll20() {
        Random rand = new Random();
        int number = rand.nextInt(19) + 1;
        if (number == 1) {
            System.out.println("Critical Failure!");
        }
        if (number == 20) {
            System.out.println("Critical Roll!");
        }
        return number;
    }

    private static void prologue() {
        System.out.println("Hello, and thank you");
        System.out.println("This game is a text-based adventure that uses virtual dice rolls to decide the outcomes ");
        System.out.println("of various interactions that happen to your character. There are 6 different dice that will ");
        System.out.println("be rolled depending on the situation. As you complete puzzles and fight enemies you will gain experience ");
        System.out.println("that will level up your character. At any time you can press _______ to bring up your stats and inventory. ");
        System.out.println("Now prepare to enter the realm of ________.");
        System.out.println("Before you lies great adventure to be had, and great treasure to claim.");
        System.out.println("");
    }

    public static void chars() {
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
            prologue();

        }
        System.out.println("Hello traveler, what is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + ", let us begin your adventure");
        System.out.println("");
    }

    public static String chooseClass() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What class would you like to be?");
        System.out.println("[Mage/Warrior/Rogue]");

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
        else {
            System.out.println("Please Choose an Available Class");
        }
        return specialization;
    }

    public static String chooseRace() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First we must create your character");
        System.out.println("");
        System.out.println("Choose your race");
        System.out.println("[Human/Orc/Dwarf/Elf]");
        if (Player.beginner == true) {
            Player.chars();
        }
        race = scanner.nextLine();

        return race;
    }

    public static int rollStrength() {
        System.out.println("now we are going to roll your stats randomly with dice");
        System.out.println("we will roll 3 6-sided dice and the sum will be your stat");
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

    public static int rollDexterity() {
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

    public static int rollPerception() {
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

    public static int rollCharisma() {
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

    public static void printCharacter() {
        System.out.println("Here is an overview of your character");
        if (Player.race.equalsIgnoreCase("Human")) {
            Player.dexterity += 3;
        }
        else if (Player.race.equalsIgnoreCase("Orc")) {
            Player.strength += 3;
        }
        else if (Player.race.equalsIgnoreCase("Dwarf")) {
            Player.charisma += 3;
        }
        else if (Player.race.equalsIgnoreCase("Elf")) {
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
    }

    public static void beginning() {
        System.out.println("You awake, above you you see the wide open blue sky. You hear the sound of water sloshing around you, you sit up and see you are on a raft ");
        System.out.println("Your head is fuzzy, your lips are chapped from lying in the sun. You scan the raft and find a small satchel that has been nailed to one of the logs");
        System.out.println("You have no idea where you are or how you got here, but you do know that night will be here soon, and that is not a good time to be on a raft.");
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("");
        while (true) {
            String action = Main.scanner.nextLine();

            if (action.contains("satchel") || action.contains("bag")) {
                System.out.println("");
                System.out.println("You open the bag and find 10 GOLD COINS, a Compass, and a note that reads 'This should get you there -M'");
                gold += 10;
                inv.add("Compass");
                inv.add("Note From -M");
                break;
            }
            else if (action.equalsIgnoreCase("/inv")) {
                inventory();
            }
            else {
                System.out.println("Try something else");

            }

        }
        System.out.println("");

    }



    public static void raft() {

        System.out.println("You look up in the sky and see clouds start to head towards you, you can hear thunder in the distance");
        System.out.println("The wind starts to pick up, you feel a chill as the sun fades and the sky darkens");
        System.out.println("Suddenly you hear a monstrous roar, you turn around and see a rogue wave towering over you");
        System.out.println("The wave lifts you up and hurls you across the sea, you eventually land on a sandy beach");
        System.out.println("in the Distance you can see a tower of smoke through a thick jungle of palm trees");
        while (true) {
            System.out.println("");
            System.out.println("what would you like to do?");
            String action = Main.scanner.nextLine();

            if (action.contains("smoke")) {
                break;

            }
            else if (action.equalsIgnoreCase("/inv")) {
                inventory();
            }
            else {
                System.out.println("Try Something Else");
            }

        }

        System.out.println("");
        System.out.println("You walk through the brush and trees toward the smoke");
        System.out.println("you see a hooded figure with its back to you, their hands hovering over the fire");
        System.out.println("What would you like to do?");
        System.out.println("[1] Approach the figure and introduce yourself (Charisma)");
        System.out.println("[2] Attempt a sneak attack (Dexterity)");
        System.out.println("[3] Attempt to figure out if they are friendly (Perception)");
        System.out.println("");

        while (true) {
            String choice = Main.scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Rolling...");
                int roll = roll20() + charisma;
                System.out.println("Roll + Charisma = " + roll);
                if (roll >= 15) {
                    System.out.println("You are successful, and manage to introduce yourself peacefully without startling the stranger");
                    break;
                }
                else {
                    System.out.println("");
                    break;
                }



            } else if (choice.equalsIgnoreCase("2")) {
                System.out.println("Rolling...");
                int roll = roll20() + dexterity;
                System.out.println("Roll + Dexterity = " + roll);

                if (roll >= 15) {
                    System.out.println("");
                    System.out.println("Your attack is successful, you leap from the brush and tackle the figure onto the ground");
                    System.out.println("You pin down your opponent and pull off the hood");
                    System.out.println("'STOP!' the man yells. 'I mean you no harm!' ");
                    System.out.println("You step off the man and help him to his feet");

                }
                else {
                    System.out.println("");
                    System.out.println("Your attack fails, you attempt to leap onto the figure but stumble and fall behind them");
                    System.out.println("The hooded figure spins around quickly to see who you are");
                    System.out.println("He removes the hood from his head and helps you to your feet");

                }
                break;


            }
            else if (choice.equalsIgnoreCase("3")) {
                System.out.println("Rolling...");
                int roll = roll20() + perception;
                System.out.println("Roll + Perception = " + roll);
                if (roll >= 15) {
                    System.out.println("");
                    System.out.println("You are successful, and notice something that you recognize as friendly");
                    System.out.println("You approach the figure and introduce yourself");
                }
                break;

            }
            else {
                System.out.println("Select one of the options");
            }
        }

    }

    public static void theOldMan(){
        System.out.println("'Hello my name is _______, I live here on the island. How did you arrive here?");
        String answer = Main.scanner.nextLine();

        if(answer.contains("raft")) {
            System.out.println("'Hmm a raft you say? ");
            System.out.println("");

        }
        else {
            System.out.println("Oh, i see...");

        }
        System.out.println("");
        System.out.println("Well if you are trying to get back to ______ city, the path to your left will take you to the port.");
        System.out.println("The path takes about two days but is much safer than the woods.");
        System.out.println("But if you are in a hurry then you can try your luck through the woods, it takes half the time");
        System.out.println("What would you like to do?");
        System.out.println("");
        while(true) {
            String decision = Main.scanner.nextLine();
            if (decision.contains("path")) {
                System.out.println("");
                System.out.println("'Before you go, take this'");
                System.out.println("");
                System.out.println("HEALTH POTION added to inventory");
                System.out.println("");
                inv.add("HEALTH POTION");
                path();
                break;
            }
            else if (decision.contains("woods")) {
                System.out.println("");
                System.out.println("'I see, a brave soul...you should take this, it may help'");
                System.out.println("");
                System.out.println("HEALTH POTION added to inventory");
                inv.add("HEALTH POTION");
                woods();
                break;
            }
            else if (decision.equalsIgnoreCase("/inv")) {
                inventory();
            }
            else {
                System.out.println("Choose either the Path or the Woods");
            }

        }

    }

    public static void woods(){
        System.out.println("You decide to venture into the woods, you put your potion in your bag and head into the darkness once more");
        System.out.println("You start to walk through the woods, pushing brush aside as you go along.");
        System.out.println("You eventually find yourself lost, looking around in all directions everything looks the same");
        System.out.println("what would you like to do?");
        System.out.println("");

        while (true) {
            String choice = Main.scanner.nextLine();
            if (choice.contains("compass")) {
                System.out.println("You pull out the compass from your bag and examine it closely");
                System.out.println("It begins to spin wildly and then abruptly stops and points to the west, you head in that direction");
                System.out.println("");


            }
            else if(choice.contains("look around")) {
                System.out.println("You look around trying to find the way but still find yourself lost");
                System.out.println("Maybe there is something in your inventory that could help");
                System.out.println("");
            }
            else if (choice.equalsIgnoreCase("/inv")) {
                Player.inventory();
            }
            else {
                System.out.println("Try something else");
            }
        }

    }

    public static void path() {
        System.out.println("You decide to take the path, you put the potion in your bag and head onto the dirt road");
        System.out.println("A few hours go by and your legs begin to tire from the journey");
        System.out.println("Up ahead you see two orcs huddled over what looks like a person lying on the road");
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("[1] Try and go around and avoid them (Dexterity)");
        System.out.println("[2] Walk up and investigate (No Roll Required)");
        System.out.println("");

        while (true) {
            String choice = Main.scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Rolling...");
                int decision = dexterity + roll20();
                System.out.println("Dexterity + Roll = " + decision);

                if (decision >= 15) {
                    System.out.println("Successful ");
                    System.out.println("You sneak off the beaten path and continue to walk around them");
                    System.out.println("once the coast is clear you are able to get back on the path to the port safely");
                }
                else {
                    System.out.println("Failure");
                }
            }
            else if (choice.equalsIgnoreCase("/inv")) {
                    inventory();

            }
            else if (choice.equals("2")) {

                System.out.println("You walk up and ask what has happened");
                System.out.println("The orcs turn around quickly, swords drawn and look at you for a moment");
                System.out.println("'This doesn't concern you " + specialization + "'");
                System.out.println("What would you like to do? ");
                System.out.println("");
                System.out.println("[1] Investigate Further (Charisma)");
                System.out.println("[2] Attack and ask questions later (Strength)");
                System.out.println("[3] Bribe one of them for info (5 Gold) ");
                System.out.println("[4] Continue on your way like a little bitch");
                String action = Main.scanner.nextLine();

                while (true)

                    if (action.equals("1")) {
                        int result = charisma + roll10();
                        System.out.println("Charisma + Roll = " + result);

                        if (result >= 20) {
                            System.out.println("Success!");
                            System.out.println("You look the orc on the right in the eye and ask your question again in a firm tone");
                            System.out.println("The orc pauses for a second, looks at his friend and then replies");
                            System.out.println("Look we found him like 'dis, alright. See for yourself, e aint go no marks on him.");
                            System.out.println("");
                            System.out.println("They move out the way as you approach the man");
                            System.out.println("You kneel down and notice the orcs were telling the truth, the man is struck dead");
                            System.out.println("with no visable wounds or cause of death. Suddenly you notice a small object around");
                            System.out.println("his neck. You reach down and pull the chain off when the orcs turn away");
                            System.out.println("MYSTERIOUS KEY added to inventory");

                            inv.add("MYSTERIOUS KEY");
                            break;
                        } else {
                            System.out.println("Failure!");
                            System.out.println("You Look the orc on the right in th eeye and ask your question again");
                            System.out.println("The orc laughs. 'Get out of here " + specialization + ", before we get angry'");
                            System.out.println("You put your head down and keep along the path like a little bitch");
                            break;
                        }

                    }
                    else if (action.equals("2")) {

                        break;

                    }
                    else if (action.equals("3")) {
                        System.out.println("You pull out 5 gold pieces from your bag and hand one of the orcs the gold");
                        System.out.println("'Ey look, truth is...we found im like 'dis. He aint got no marks on him, look for yourself");
                        System.out.println("They move out the way as you approach the man");
                        System.out.println("You kneel down and notice the orcs were telling the truth, the man is struck dead");
                        System.out.println("with no visable wounds or cause of death. Suddenly you notice a small object around");
                        System.out.println("his neck. You reach down and pull the chain off when the orcs turn away");
                        System.out.println("MYSTERIOUS KEY added to inventory");
                        gold -= 5;
                        inv.add("MYSTERIOUS KEY");

                        break;
                    }
                    else if (action.equals("4")) {
                        System.out.println("You put your head down and keep along the path like a little bitch");
                        System.out.println("You probably missed out on some bitchin' treasure or something");

                        break;

                    }
                    else if (action.equalsIgnoreCase("/inv")) {
                            inventory();

                            break;
                    }
                    else {
                        System.out.println("Please Choose 1, 2 or 3");
                    }
            }
        }
    }


    public static void thePort(){
        System.out.println("CHAPTER 2");
        System.out.println("");
        System.out.println("You finally arrive at the port of _______. You see dock workers loading up crates onto the wooden vessels.");
        System.out.println("The only building in site is a large dock house, a couple trolls are leaning on the side");
        System.out.println("What would you like to do?");
        System.out.println("");
    }
}






