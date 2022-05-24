public class roomTrap {

    static void roomTrap(){
        System.out.println("This room seems normal.");
        player.pause();
        System.out.println("You could walk through it, which would take 1 minute, or you could wait for 2.");
        player.pause();
        System.out.println("What would you like to do?");
        decisionRoomTrap.decisionRoomTrap();
    }

}
