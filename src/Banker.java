
public class Banker {

    public static int balance = 100;


    public static void options(){
        System.out.println("");
        System.out.println("[Deposit/Withdraw/Check Balance/Leave]");


    }

    public static void banker() {

        System.out.println("Hello what can i help you with?");
        options();




        while (true) {

            String choice = Main.scanner.nextLine();
            
            if (choice.equalsIgnoreCase("deposit")) {
                System.out.println("How much would you like to deposit");
                int answer = Main.scanner.nextInt();
                balance = balance + answer;
                Player.gold  = Player.gold - answer;
                System.out.println("");
                System.out.println("Your current bank balance is " + balance);
                System.out.println("Your personal balance is " + Player.gold);
                options();
                
            }
            else if (choice.equalsIgnoreCase("withdraw")) {
                System.out.println("Your current balance is " + balance + " Gold Pieces");
                System.out.println("How much would you like to withdraw?");
                int withdraw = Main.scanner.nextInt();
                if (withdraw < balance) {
                    Player.gold += withdraw;
                    balance -= withdraw;
                    System.out.println("Your new personal balance is " + Player.gold);
                    System.out.println("");
                    options();

                }

            }
            else if (choice.equalsIgnoreCase("check balance")) {
                System.out.println("Your balance is " + balance + " Gold Pieces");
                options();

            }
            else if (choice.equalsIgnoreCase("leave")) {

                break;
            }


        }
        System.out.println("Have a nice day");
    }
}
