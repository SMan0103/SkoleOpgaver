public class main {
    public static void main(String[] args){
        Player tempPlayer;
        
        for (int i = 0; i < 100; i++) {
            tempPlayer = new Player();
            tempPlayer.playerId = (int) (Math.random() * 100000);
        }

        System.out.println(Player.dumpData());

        Player.removeElementWithId(47);
        Player.removeElementWithId(48);
        Player.removeElementWithId(49);
        Player.removeElementWithId(50);

        



        System.out.println(Player.dumpData());


    }

    
}


 