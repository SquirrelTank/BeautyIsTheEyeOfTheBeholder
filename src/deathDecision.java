public class deathDecision {

    static void deathDecision(){

        String decision = player.imput.nextLine();
        if(decision .equalsIgnoreCase("yes")){
            player.pause();
            new player();
        }
        else if (decision .equalsIgnoreCase("no")) {
            player.pause();
            System.out.println("Thanks for playing.");
        }
        else {
            System.out.println("Please enter either \"yes\", or \"no\"");
            deathDecision();


        }


    }

}
