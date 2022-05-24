import java.util.Scanner;


public class player {

    public static void pause(){
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static int HP=3;

    public static int distanceExit = 21;
    static int distanceBeholder = 5;
    public static String name;


    public static Scanner imput = new Scanner(System.in);



    public static void main(String[] args) {

        System.out.println(
                "╔══╗      ╔╗   ╔╦═╗╔╗╔╗   ╔═╗\n" +
                "║╔╗╠═╦═╗╔╦╣╚╦╦╗╠╣═╣║╚╣╚╦═╗║╦╬╦╦═╗\n" +
                "║╔╗║╩╣╬╚╣║║╔╣║║║╠═║║╔╣║║╩╣║╩╣║║╩╣\n" +
                "╚══╩═╩══╩═╩═╬╗║╚╩═╝╚═╩╩╩═╝╚═╬╗╠═╝\n" +
                "            ╚═╝             ╚═╝\n" +
                "  ╔═╗╔╗╔╗   ╔══╗ ╔╗     ╔╗\n" +
                "╔═╣═╣║╚╣╚╦═╗║╔╗╠═╣╚╦═╦╗╔╝╠═╦╦╗\n" +
                "║╬║╔╝║╔╣║║╩╣║╔╗║╩╣║║╬║╚╣╬║╩╣╔╝\n" +
                "╚═╩╝ ╚═╩╩╩═╝╚══╩═╩╩╩═╩═╩═╩═╩╝\n");
        pause();
        System.out.println("What should we call you?");
        name = imput.nextLine();
        System.out.println("Welcome "+ name+".");
        pause();
        System.out.println("This is the story of your demise.");
        pause();
        System.out.println("Err, sorry, destiny!");
        pause();
        System.out.println("You know that gem that you took from the cave of that beholder?");
        pause();
        System.out.println("Well, turns out that that gem was some sort of third eye for the beholder, and they want it back.");
        pause();
        System.out.println("You caught it sleeping, and so have a bit of a head start, but the entrance that you used was blocked, and you need another way out.");
        pause();
        corridor.corridor();
    }
}


