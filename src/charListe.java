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
    //A way to remove elements with a specific value
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
    private static void CombineLeast() {
        // ToDo make work
        if ( firstElement.nextElement == null) return; //Can't combine elements into a new element
        charListe low1 = firstElement;  
        charListe low2 = firstElement.nextElement;
        charListe tempElement = firstElement.nextElement.nextElement;
        // loop through the list and find the two least common elements
        while (tempElement != null) {
            //Smuk kode, ikke lange navne på nogen måde
            if (tempElement.node.number < low1.node.number || tempElement.node.number < low2.node.number) {
                
                if (low1.node.number < low2.node.number) {
                    low2 = tempElement;
                } else {
                    low1 = tempElement;
                } 
            } 
            //Go through the list
            tempElement = tempElement.nextElement;
        }
        // Combine into new node and remove old ones
        //Make new treenode
        TreeNode tempNode = new TreeNode();
        //Define left and right node as previous previous nodes
        tempNode.leftNode = low1.node;
        tempNode.rightNode = low2.node;
        //Combine the two nodes as a sum
        tempNode.number = low1.node.number + low2.node.number;
        // insert new node into list
        low1.node = tempNode;
        removeElement(low2);
        
    }
    //Må jeg være en del af githubben?
    public static void GrowTree(){
        while (firstElement.nextElement != null) {
            CombineLeast();
        }
        //Saving the tree
        TreeNode.treetop = firstElement.node;
        //Delete all elements
        firstElement = null;

    }
}