import java.util.ArrayList;

public class Merchant {

    public static int apples = 3;
    public static int oranges = 59;

   static ArrayList inventory = new ArrayList();


    public static void merchant(){
        System.out.println("Hello take a look at what we have");
        inventory.add("Apples " + "[" + apples + "]");
        //inventory.add("Oranges " + "x " + oranges);
        System.out.println(inventory);


    }
}
