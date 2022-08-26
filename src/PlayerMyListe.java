public class PlayerMyListe  extends Myliste{

    public int playerId;
    public String name;
    public int level;
    public int xp;
 
    public static String dumpData() {
        String result = "";

        Myliste tempElement = Myliste.getFirstElement();
        
        while (tempElement != null) {

            result += ((PlayerMyListe)tempElement).playerId + ", ";

            tempElement = tempElement.getNextElement();      
        }




        return result;
    }

   public static void removeElementWithId(int id) {
        Myliste tempElement = getFirstElement();
        Myliste prevElement = null;

        while (tempElement != null) {
            if (((PlayerMyListe)tempElement).playerId == id) {
                if (tempElement == getFirstElement()) {
                    removeNextElement(tempElement);
                } else {
                    removeNextElement(prevElement);
                }
            }
            prevElement = tempElement;
            tempElement = tempElement.getNextElement();
        }
   }

}
