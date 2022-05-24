import java.lang.Math;

import java.util.Random;

public class corridor {

static void corridor(){
    player.distanceExit--;

    if(player.distanceExit==0){
        System.out.println("Suddenly, as you round a corner, bright light fills your eyes, and you stumble into the outside world.");
        player.pause();
        System.out.println("You run to the light, throwing your hands up in celebration, and get as far away as possible.");
        player.pause();
        System.out.println("It's only after you are resting at a far away inn telling the story of "+player.name+ " that you realise why the beholder didn't chase you: you lost the gem!");
        player.pause();
        System.out.println("Well, there's always next time!");
        player.pause();
        System.out.println("YOU WIN");
        player.pause();
        System.out.println("Would you like to play again?");
        deathDecision.deathDecision();
    }


    else if (player.HP==0) {
        System.out.println("You stumble out of the room, bleeding from all the cuts on your body.");
        player.pause();
        System.out.println("You try to go on, but your body can't handle it, and you collapse, dead on the ground.");
        player.pause();
        death.death();
    }
    else if(player.distanceBeholder<1){
        System.out.println("You run at full sprint out of the room, hearing the beholder close behind.");
        player.pause();
        System.out.println("You think that you made it, but the unmistakable sound of one of it's eye beams firing, stunning you, changes your mind.");
        death.death();
    }
    else{
        System.out.println("You think that the beholder is about " + player.distanceBeholder + " minutes away.");
        player.pause();
        System.out.println("You have "+ player.HP + " health.");
        player.pause();
        System.out.println("You think to be about " + player.distanceExit + " minutes away from the exit.");
        player.pause();
        System.out.println("You walk into the dreary corridor.");
        player.pause();
        System.out.println("You step into the room in front of you.");
        player.pause();
        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        if (rand_int == 0) {
            roomTrap.roomTrap();
        } else if (rand_int == 1) {
            roomWall.roomWall();
        } else if (rand_int == 2) {
            roomMagic.roomMagic();
        } else if (rand_int == 3) {
            roomTreasure.roomTreasure();
        } else if (rand_int == 4) {
            roomEnemy.roomEnemy();
        } else if (rand_int == 5) {
            roomTrapChest.roomTrapChest();
        } else if (rand_int == 6) {
            roomStrongEnemy.roomStrongEnemy();
        } else if (rand_int ==7) {
            roomSlide.roomSlide();
        } else if (rand_int == 8) {
            roomSlideTrap.roomSlideTrap();
        } else {
            roomNormal.roomNormal();
        }
    }
}

}