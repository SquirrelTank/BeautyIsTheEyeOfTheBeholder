public class decisionRoomTrap {

    static void decisionRoomTrap(){

        String decision = player.imput.nextLine();
        if(decision .equalsIgnoreCase("walk")){
            player.pause();
            System.out.println("You start to move across the room, but halfway through, metal spikes come out of the walls, grazing you.");
            player.HP--;
            player.pause();
            corridor.corridor();
        }
        else if (decision .equalsIgnoreCase("wait")) {
            player.pause();
            System.out.println("A couple seconds into your wait, a rat runs across the floor.");
            player.pause();
            System.out.println("As it gets to midway, spikes come out and impale it. You know that it's now unarmed, and run across, wasting no time.");
            player.pause();
            corridor.corridor();
        }
        else {
            System.out.println("Please enter either \"walk\", or \"wait\"");
            decisionRoomTrap();


        }

}}
