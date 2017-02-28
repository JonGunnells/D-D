import java.util.Random;

public class Enemy {

    public static void enRoll4(){
        Random rando = new Random();
        int number = rando.nextInt(4);
        System.out.println(number);
    }

    public static void enRoll6(){
        Random rand = new Random();
        int number = rand.nextInt(6);
        System.out.println(number);
    }

    public static void enRoll8(){
        Random rand = new Random();
        int number = rand.nextInt(8);
        System.out.println(number);
    }

    public static void enRoll10(){
        Random rand = new Random();
        int number = rand.nextInt(10);
        System.out.println(number);

    }

    public static int enRoll12(){
        Random rand = new Random();
        int number = rand.nextInt(12);
        System.out.println(number);
        return number;
    }

    public static int enRoll20(){
        Random rand = new Random();
        int number = rand.nextInt(20);
        System.out.println(number);
        return number;
    }
}
