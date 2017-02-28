import java.util.Random;
import java.util.Scanner;

public class Player {
    int health;


    public static int roll4(){
        System.out.println("rolling D4");
        Random rando = new Random();
        int number = rando.nextInt(4);
        return number;
    }

    public static int roll6(){
        System.out.println("rolling D6");
        Random rand = new Random();
        int number = rand.nextInt(6);
        return number;
    }

    public static int roll8(){
        System.out.println("rolling D8");
        Random rand = new Random();
        int number = rand.nextInt(8);
        return number;
    }

    public static int roll10(){
        System.out.println("rolling D10");
        Random rand = new Random();
        int number = rand.nextInt(10);
        return number;

    }

    public static int roll12(){
        System.out.println("rolling D12");
        Random rand = new Random();
        int number = rand.nextInt(12);
        System.out.println(number);
        return number;
    }

    public static int roll20(){
        Random rand = new Random();
        int number = rand.nextInt(20);
        if (number == 1){
            System.out.println("Critical Failure!");
        }
        return number;
    }

    public static int rollStat(){
        Random rand = new Random();
        int first = rand.nextInt(6);
        int second = rand.nextInt(6);
        int third = rand.nextInt(6);
        int stat = first + second + third;
        System.out.println("Rolling 3 D6");
        System.out.println(first + " + " + second + " + " + third + " = " + stat);
        return stat;


    }
    public static void intro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello traveler, what is your name?");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + ", let us begin your adventure");
        System.out.println("First we must create your character");
    }
}





