
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
       while (true) {
           //Player.intro();
           Enemy.firstInteraction();
       }


    }

    public static  String checkStats(){
        String stats = scanner.nextLine();
        while (stats.startsWith("/")) {
            if (stats.equalsIgnoreCase("/stats")) {
                for (String stat : Player.stats)
                    System.out.println(stat);

            }
        }
        return stats;

    }

}


