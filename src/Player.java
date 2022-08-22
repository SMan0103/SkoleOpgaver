public class Player  extends haegtedeListe{

    public int playerId;
    public String name;
    public int level;
    public int xp;
 
    public static String dumpData() {
        String result = "";

        haegtedeListe tempElement = haegtedeListe.getFirstElement();
        
        while (tempElement != null) {

            result += ((Player)tempElement).playerId + ", ";

            tempElement = tempElement.getNextElement();

            

            
            
        }




        return result;
    }

}
