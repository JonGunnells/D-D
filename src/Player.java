import java.util.Random;
public class Player {
    int health;


    public static void roll4(){
        System.out.println("rolling D4");
        Random rando = new Random();
        int number = rando.nextInt(4);
        System.out.println(number);
    }

    public static void roll6(){
        System.out.println("rolling D6");
        Random rand = new Random();
        int number = rand.nextInt(6);
        System.out.println(number);
    }

    public static void roll8(){
        System.out.println("rolling D8");
        Random rand = new Random();
        int number = rand.nextInt(8);
        System.out.println(number);
    }

    public static void roll10(){
        System.out.println("rolling D10");
        Random rand = new Random();
        int number = rand.nextInt(10);
        System.out.println(number);

    }

    public static int roll12(){
        System.out.println("rolling D12");
        Random rand = new Random();
        int number = rand.nextInt(12);
        System.out.println(number);
        return number;
    }

    public static int roll20(){
        System.out.println("rolling D20");
        Random rand = new Random();
        int number = rand.nextInt(20);
        if (number == 1){
            System.out.println("Critical Failure!");
        }
        System.out.println(number);

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
}





