public class Myliste {

    // Navigation variables
    private static Myliste firstElement;
    private Myliste nextElement;
    private Myliste prevElement;

    // payload
    public int id;

    Myliste() {
        if (firstElement == null) {
            firstElement = this;
        } else {
            firstElement.prevElement = this;
            nextElement = firstElement;
            firstElement = this;
        }
    }

    public static void removeElement(Myliste element) {

        if (element == firstElement) {
            firstElement = element.nextElement;
            firstElement.prevElement = null;
        }

        element.prevElement.nextElement = element.nextElement;
        element.nextElement.prevElement = element.prevElement;

    }

    public static Myliste getFirstElement() {
        return firstElement;
    }

    public Myliste getNextElement() {
        return nextElement;
    }

    public static void removeNextElement(Myliste element) {
        if (element.nextElement != null) {
            element.nextElement = element.nextElement.nextElement;
        }
    }

    public String toString() {
        String result = "";
        Myliste tempElement = firstElement;

        while (tempElement != null) {
            result += tempElement.id + ",";
            tempElement = tempElement.nextElement;
        }
        return result;
    }
}
