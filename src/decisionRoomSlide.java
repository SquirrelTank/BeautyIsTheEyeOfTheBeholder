public class decisionRoomSlide {

    static void decisionRoomSlide(){

        String decision = player.imput.nextLine();
        if(decision .equalsIgnoreCase("walk")){
            player.pause();
            System.out.println("You jog down the stairs and make it to the other side without being tempted by the slide.");
            player.pause();
            corridor.corridor();
        }
        else if (decision .equalsIgnoreCase("slide")) {
            player.pause();
            System.out.println("You start to walk down, but then think better of it and jump on the slide.");
            player.pause();
            System.out.println("You slide to the bottom, hitting some bumps on the way down, but nothing substantial.");
            player.distanceBeholder++;
            corridor.corridor();

        }
        else {
            System.out.println("Please enter either \"walk\", or \"slide\"");
            decisionRoomSlide();
        }}}




