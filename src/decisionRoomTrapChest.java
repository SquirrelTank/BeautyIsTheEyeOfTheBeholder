public class decisionRoomTrapChest {

    static void decisionRoomTrapChest(){

        String decision = player.imput.nextLine();
        if(decision .equalsIgnoreCase("walk")){
            player.pause();
            System.out.println("You jog across the room, ignoring the chest, and make it to the other side.");
            player.pause();
            corridor.corridor();
        }
        else if (decision .equalsIgnoreCase("open")) {
            player.pause();
            System.out.println("You crouch down by the chest and try to pick the lock.");
            player.pause();
            System.out.println("As you fiddle around with it, a dart covered in poison flies out and hits you.");
            player.pause();
            System.out.println("The other darts miss you, as you run away from it.");
            player.HP--;
            player.pause();
            corridor.corridor();
        }
        else {
            System.out.println("Please enter either \"walk\", or \"open\"");
            decisionRoomTrapChest();

    }

}}
