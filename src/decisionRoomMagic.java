import java.util.Random;

public class decisionRoomMagic
{
    static void decisionRoomMagic(){
        String decision = player.imput.nextLine();
        if(decision.equalsIgnoreCase("activate")){
            player.pause();
            System.out.println("You touch your hand to the rough stone, and the pedestal lights up.");
            player.pause();
            Random rand2 = new Random();
            int rand_int2 = rand2.nextInt(4);
            if(rand_int2==1){
                System.out.println("The stone, upon touching your skin, glows green, filling you with a sense of health.");
                player.HP++;
                player.pause();
                corridor.corridor();}

            else if(rand_int2==2){
                System.out.println("The stone, upon touching your skin, glows red, filling you with a sense of pain.");
                player.HP--;
                player.pause();
                corridor.corridor();}
            else if (rand_int2==3) {
                System.out.println("The stone, upon touching your skin, glows yellow, filling you with a sense of speed.");
                player.distanceBeholder++;
                player.pause();
                corridor.corridor();}
            else if (rand_int2==4) {
                System.out.println("The stone, upon touching your skin, glows gray, filling you with a sense of slowness.");
                player.distanceBeholder--;
                player.pause();
                corridor.corridor();
            }


            }

        else if (decision.equalsIgnoreCase("walk")) {
            System.out.println("You ignore the pedestal completely, and run to the exit.");
            player.pause();
            corridor.corridor();
        }
        else {
            System.out.println("Please enter either \"activate\", or \"walk\"");
            decisionRoomMagic();
        }}}

