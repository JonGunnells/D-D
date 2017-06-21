
public class Town {


        public static void town() {
            System.out.println("Finally you arrive at the town of ______. Your dirt path begins to turn into a cobblestone road");
            System.out.println("the longer you walk inward toward the city.");
            while (true) {
                String direction = Main.scanner.nextLine();

                if (direction.equalsIgnoreCase("bank")) {
                    Banker.banker();
                }
                else if (direction.equalsIgnoreCase("general store") || direction.contains("store")) {
                    Merchant.merchant();

                }

            }
        }
    }
