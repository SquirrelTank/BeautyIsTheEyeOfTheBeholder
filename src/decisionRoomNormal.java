public class decisionRoomNormal{
static void decisionRoomNormal(){
String decision = player.imput.nextLine();
        if(decision .equalsIgnoreCase("walk")){
player.pause();
            System.out.println("You jog across the room and make it to the other side.");
            player.pause();
            corridor.corridor();
        }
        else if (decision .equalsIgnoreCase("wait")) {
           player.pause();
            System.out.println("As you wait for two minutes, a rat runs across the floor.");
            player.pause();
            System.out.println("Nothing happens. (Please choose an option again)");
            player.distanceBeholder--;
            decisionRoomNormal();
        }
        else {
        System.out.println("Please enter either \"walk\", or \"wait\"");
        decisionRoomNormal();
        }}}