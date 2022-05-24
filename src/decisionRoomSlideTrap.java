public class decisionRoomSlideTrap {

    static void decisionRoomSlideTrap(){

        String decision = player.imput.nextLine();
        if(decision .equalsIgnoreCase("walk")){
            player.pause();
            System.out.println("You jog down the stairs and make it to the other side without being tempted by the slide.");
            player.pause();
            System.out.println("As you get to the bottom of the stairs, you see that the slide that you considered taking ends abruptly.");
            corridor.corridor();
        }
        else if (decision .equalsIgnoreCase("slide")) {
            player.pause();
            System.out.println("You start to walk down, but then think better of it and jump on the slide.");
            player.pause();
            System.out.println("You slide down, seeing the slide end in a wall, too late.");
            player.HP--;
            corridor.corridor();

        }
        else {
            System.out.println("Please enter either \"walk\", or \"slide\"");
            decisionRoomSlideTrap();
        }

    }

}
