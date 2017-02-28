import java.util.Random;
public class Player {

    public static void roll4(){
        Random rando = new Random();
        int number = rando.nextInt(4);
        System.out.println(number);
    }

    public static void roll6(){
        Random rand = new Random();
        int number = rand.nextInt(6);
        System.out.println(number);
    }

    public static void roll8(){
        Random rand = new Random();
        int number = rand.nextInt(8);
        System.out.println(number);
    }

    public static void roll10(){
        Random rand = new Random();
        int number = rand.nextInt(10);
        System.out.println(number);

    }

    public static int roll12(){
        Random rand = new Random();
        int number = rand.nextInt(12);
        System.out.println(number);
        return number;
    }

    public static int roll20(){
        Random rand = new Random();
        int number = rand.nextInt(20);
        System.out.println(number);
        return number;
    }



}
