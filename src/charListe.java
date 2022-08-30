import javax.lang.model.element.Element;

public class charListe {
    
    //Import singly linked list and simple navigation variables
    // Navigation variables
    private static charListe firstElement;
    private charListe nextElement;
    public TreeNode node;

    //ToDo change constructor so we can add a elements with nodes
    charListe (char c, long n) {
        //Todo reuse code from constructor below and add treenode
        if (firstElement == null) {
            firstElement = this;
        } else {
            nextElement = firstElement;
            firstElement = this;
        }
        node = new TreeNode();
        this.node.character = c;
        this.node.number = n;
    }
    
    charListe(){
        if (firstElement == null) {
            firstElement = this;
        } else {
            nextElement = firstElement;
            firstElement = this;
        }
    }

    public static void removeElement(charListe element ){
        charListe tempElement = firstElement;
        while (tempElement.nextElement != element) {
            tempElement = tempElement.nextElement;
            if (tempElement == null) {
                return;
            }
        }
    }
    
    public static charListe getFirstElement() {
        return firstElement;
    } 
 
    public charListe getNextElement() {
        return nextElement;
    }



    public static void removeElementWith(charListe element) {
        if (element == firstElement) {
            firstElement = firstElement.nextElement;
        } else {
            charListe tempElement = firstElement;
            while (tempElement.nextElement != element) {
                tempElement = tempElement.nextElement;
                if (tempElement == null) {
                    return;
                }
            }
            tempElement.nextElement = tempElement.nextElement.nextElement;
        }
    }

    public static void removeNextElement(charListe element) {
        if (element.nextElement != null){
            element.nextElement = element.nextElement.nextElement;
        }
    }

    //Function for combining the two least common elements in the list
    public static void CombineLeast() {
        // ToDo make work
        charListe low1 = firstElement;  
        charListe low2 = firstElement.nextElement;
        charListe tempElement = firstElement.nextElement.nextElement;
        // loop through the list and find the two least common elements
        while (tempElement != null) {
            if (tempElement.node.number < low1.node.number) {
                low2 = low1;
                low1 = tempElement;
            } else if (tempElement.node.number < low2.node.number) {
                low2 = tempElement;
            }
            tempElement = tempElement.nextElement;
        }
    
    }
}



