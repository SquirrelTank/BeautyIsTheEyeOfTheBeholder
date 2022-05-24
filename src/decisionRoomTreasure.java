public class decisionRoomTreasure {
    static void decisionRoomTreasure(){

        String decision = player.imput.nextLine();
        if(decision .equalsIgnoreCase("walk")){
            player.pause();
            System.out.println("You jog across the room, ignoring the chest, and make it to the other side.");
            player.pause();
            corridor.corridor();
        }
        else if (decision .equalsIgnoreCase("open")) {
            player.pause();
            System.out.println("As fast as you can manage, you open the chest and grab the potion inside, drinking it as you run.");
            player.HP++;
            player.pause();
            corridor.corridor();
        }
        else {
            System.out.println("Please enter either \"walk\", or \"open\"");
            decisionRoomTreasure();


        }
}}
