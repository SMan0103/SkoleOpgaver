public class main {
    public static void main(String[] args){
        Player tempPlayer;
        
        for (int i = 0; i < 100; i++) {
            tempPlayer = new Player();
            tempPlayer.playerId = i;
        }

        System.out.println(Player.dumpData());
    }
}
