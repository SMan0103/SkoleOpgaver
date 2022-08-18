public class Player  extends haegtedeListe{

    public int playerId;
    public String playerName;
    public int playerlevel;
    public int playerXp;
 
    public static String dumpData() {
        String result = "";

        haegtedeListe tempElement = getFirstElement();
        while (tempElement != null) {
            result += tempElement.playerId + " " + tempElement.playerName + " " + tempElement.playerlevel + " " + tempElement.playerXp + "\n";
            tempElement = getNextElement(tempElement);
        }




        return result;
    }

}
