public class decisionRoomWall {

    static void decisionRoomWall(){
        String decision = player.imput.nextLine();
        if(decision .equalsIgnoreCase("walk")){
            player.pause();
            System.out.println("You jog across the room and make it to the other side.");
            player.pause();
            corridor.corridor();
        }
        else if (decision .equalsIgnoreCase("break")) {
            player.pause();
            System.out.println("You grab your torch and slam the wall as you run across the room.");
            player.pause();
            System.out.println("The ceiling falls down, partially grazing your leg, but also slowing the beholder.");
            player.distanceBeholder++;
            player.HP--;
            player.pause();
            corridor.corridor();
        }
        else {
            System.out.println("Please enter either \"walk\", or \"break\"");
            decisionRoomWall();
        }}}
