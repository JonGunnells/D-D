import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static final String SAVE_FILE = "game.json";
    static Player player;

    public static void main(String[] args) {

        player = loadGame(SAVE_FILE);
        if (player == null) {
            player = new Player();
            System.out.println("Starting new game...");
        }
        else {
            System.out.println("Found save file...");
            System.out.println("Start new game instead? [Y/N]");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                player = new Player();
            }
        }

            Player.intro();
            Player.difficulty();

            Player.chooseRace();

            Player.chooseClass();
            System.out.println("Hit ENTER");
            scanner.nextLine();

            Player.rollStrength();
            System.out.println("Hit ENTER");
            scanner.nextLine();

            Player.rollCharisma();
            System.out.println("Hit ENTER");
            scanner.nextLine();

            Player.rollDexterity();
            System.out.println("Hit ENTER");
            scanner.nextLine();

            Player.rollPerception();
            System.out.println("Hit ENTER");
            scanner.nextLine();

            Player.printCharacter();
            System.out.println("Hit ENTER");
            scanner.nextLine();

            Player.beginning();
            Player.raft();

            //Player.theOldMan();
            //Player.thePort();
            Banker.banker();


        //Enemy.firstInteraction();

        }


    public static Player loadGame(String filename) {
        File f = new File(filename);
        try {
            Scanner scanner = new Scanner(f);
            scanner.useDelimiter("\\Z");
            String contents = scanner.next();
            JsonParser parser = new JsonParser();
            return parser.parse(contents, Player.class);
        } catch (FileNotFoundException e) {
        }
        return null;
    }

    public static void saveGame(Player player, String filename) {
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.include("*").serialize(player);

        File f = new File(filename);
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}


