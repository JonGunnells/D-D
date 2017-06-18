
public class Town {


        public static void town() {
            System.out.println("Finally you arrive at the town of ______. Your dirt path begins to turn into a cobblestone road");
            System.out.println("the longer you walk inward toward the city. You com to a large town square and notice a directory");
            System.out.println("________ DIRECTORY");
            System.out.println("1.) _________'s Bank");
            System.out.println("2.) General Store ");
            System.out.println("3.) Hearthstone Inn ");
            System.out.println("What would you like to do? ");
            System.out.println("you can also just say fuck this shit and peace out by typin 'leave' ");

            while (true) {
                String direction = Main.scanner.nextLine();

                if (direction.equalsIgnoreCase("bank")) {
                    Banker.banker();
                } else if (direction.equalsIgnoreCase("general store") || direction.contains("store")) {
                    Merchant.merchant();

                }

            }
        }
    }
