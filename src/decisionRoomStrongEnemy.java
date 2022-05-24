public class decisionRoomStrongEnemy {

    static void decisionRoomStrongEnemy(){

        String decision = player.imput.nextLine();
        if(decision .equalsIgnoreCase("run")){
            player.pause();
            System.out.println("You jog across the room and make it to the other side.\nSeizing the opportunity, the ogre grabs you, biting your shoulder and dealing 2 damage before you can slip away.");
            player.HP--;
            player.pause();
            corridor.corridor();
        }
        else if (decision .equalsIgnoreCase("fight")) {
            player.pause();
            System.out.println("You grab your torch and swing it at his face.");
            player.pause();
            System.out.println("Blinded, he lashes out, hitting you across the head with his claws.");
            player.pause();
            System.out.println("You manage to stab the pointed end of your torch through his brain, killing him.");
            player.distanceBeholder--;
            player.HP--;
            player.pause();
            corridor.corridor();
        }
        else {
            System.out.println("Please enter either \"run\", or \"fight\"");
            decisionRoomStrongEnemy();

    }

}}
