
public class Banker {

    public static int balance = 100;


    public static void banker() {

        System.out.println("Hello what can i help you with?");

        while (true) {

            System.out.println("[Deposit/Withdraw/Check Balance/Leave]");

            String choice = Main.scanner.nextLine();
            if (choice.equalsIgnoreCase("deposit")) {
                System.out.println("How much would you like to deposit");
                int answer = Main.scanner.nextInt();
                balance = balance + answer;
                Player.gold  = Player.gold - answer;

                System.out.println("Your current bank balance is " + balance);
                System.out.println("");
                System.out.println("Your personal balance is " + Player.gold);
                
            }
            else if (choice.equalsIgnoreCase("withdraw")) {
                System.out.println("Your current balance is " + balance + " Gold Pieces");
                System.out.println("How much would you like to withdraw?");

            }
            else if (choice.equalsIgnoreCase("check balance")) {
                System.out.println("Your balance is " + balance + " Gold Pieces");

            }
            else if (choice.equalsIgnoreCase("leave")) {
                break;
            }
            else {
                System.out.println("Please enter a valid option");
            }


        }
        System.out.println("Have a nice day");

    }
}
