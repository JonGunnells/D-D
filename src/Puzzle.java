
public class Puzzle {

    public static void zero(){
        System.out.println(" _____ \n" +
                "|  _  |\n" +
                "| |/' |\n" +
                "|  /| |\n" +
                "\\ |_/ /\n" +
                " \\___/ \n" +
                "       ");

    }
    public static void one(){
        System.out.println(" __  \n" +
                "/  | \n" +
                "`| | \n" +
                " | | \n" +
                "_| |_\n" +
                "\\___/\n" +
                "     ");
    }

    public static void two(){
        System.out.println(" _____ \n" +
                "/ __  \\\n" +
                "`' / /'\n" +
                "  / /  \n" +
                "./ /___\n" +
                "\\_____/\n" +
                "       ");
    }

    public static void three(){
        System.out.println(" _____ \n" +
                "|____ |\n" +
                "    / /\n" +
                "    \\ \\\n" +
                ".___/ /\n" +
                "\\____/ \n" +
                "       ");
    }

    public static void four(){
        System.out.println("   ___ \n" +
                "  /   |\n" +
                " / /| |\n" +
                "/ /_| |\n" +
                "\\___  |\n" +
                "    |_/\n" +
                "       ");
    }

    public static void five(){
        System.out.println(" _____ \n" +
                "|  ___|\n" +
                "|___ \\ \n" +
                "    \\ \\\n" +
                "/\\__/ /\n" +
                "\\____/ \n" +
                "       ");
    }

    public static void six(){
        System.out.println("  ____ \n" +
                " / ___|\n" +
                "/ /___ \n" +
                "| ___ \\\n" +
                "| \\_/ |\n" +
                "\\_____/\n" +
                "       ");

    }

    public static void seven(){
        System.out.println(" ______\n" +
                "|___  /\n" +
                "   / / \n" +
                "  / /  \n" +
                "./ /   \n" +
                "\\_/    \n" +
                "       ");
    }

    public static void eight(){
        System.out.println(" _____ \n" +
                "|  _  |\n" +
                " \\ V / \n" +
                " / _ \\ \n" +
                "| |_| |\n" +
                "\\_____/\n" +
                "       ");
    }

    public static void nine(){
        System.out.println(" _____ \n" +
                "|  _  |\n" +
                "| |_| |\n" +
                "\\____ |\n" +
                ".___/ /\n" +
                "\\____/ \n" +
                "       ");
    }

    public static void up(){
        System.out.println(
                 "    .\n" +
                "   .:;:.\n" +
                " .:;;;;;:.\n" +
                "   ;;;;;\n" +
                "   ;;;;;\n" +
                "   ;;;;;");
    }

    public static void down(){
        System.out.println();
    }

    public static void theDoor(){
        System.out.println("As you walk down the dirt path you come across a large door that appears to be made of solid gold");
        System.out.println("You look closer you notice there is no handle to open it, but the surface is covered in scratches and dents");
        System.out.println("what would you like to do?");
        String action = Main.scanner.nextLine();
        if (action.contains("examine")) {
            System.out.println("You look closer at the door and notice a small ");

        }
        else if (action.contains("")) {

        }
    }
}
