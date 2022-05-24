public class decisionRoomEnemy
{
    static void decisionRoomEnemy(){
    String decision = player.imput.nextLine();
    if(decision .equalsIgnoreCase("run")){
        player.pause();
        System.out.println("You jog across the room and make it to the other side.\nUnfortunately, the skeleton swipes at you, dealing 1 damage.");
        player.HP--;
        player.pause();
        corridor.corridor();
    }
    else if (decision .equalsIgnoreCase("fight")) {
        player.pause();
        System.out.println("You grab your torch and shove it into the skeletons chest, setting it ablaze.");
        player.pause();
        System.out.println("As he burns, you line up the butt of your torch and slam it through his skull.");
        player.distanceBeholder--;
        player.pause();
        corridor.corridor();
    }
    else {
        System.out.println("Please enter either \"run\", or \"fight\"");
        decisionRoomEnemy();
    }}}
