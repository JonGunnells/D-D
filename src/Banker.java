
public class Banker {

    public static void banker(){
        System.out.println("Hello what can i help you with?");
        System.out.println("[Deposit/Withdraw/Check Balance/Leave]");

        String choice = Main.scanner.nextLine();
        if (choice.equalsIgnoreCase("deposit")) {

        }
        else if (choice.equalsIgnoreCase("withdraw")) {

        }
        else if (choice.equalsIgnoreCase("check balance")){

        }
        else if (choice.equalsIgnoreCase("leave")) {
            System.out.println("Have a nice day");
        }
        else {
            System.out.println("Please enter a valid option");
        }
        System.out.println("You leave the Bank");
    }

}
