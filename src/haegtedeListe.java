import javax.lang.model.element.Element;

public class haegtedeListe {
    
    // Navigation variables
    private static haegtedeListe firstElement;
    private haegtedeListe nextElement;

    haegtedeListe(){
        if (firstElement == null) {
            firstElement = this;
        } else {
            nextElement = firstElement;
            firstElement = this;
        }
    }

    public static void removeElement(haegtedeListe element ){
        haegtedeListe tempElement = firstElement;
        while (tempElement.nextElement != element) {
            tempElement = tempElement.nextElement;
            if (tempElement == null) {
                return;
            }
        }
    }
    
    public static haegtedeListe getFirstElement() {
        return firstElement;
    }

    public haegtedeListe getNextElement(haegtedeListe element) {
        return element.nextElement;
    }
}