package Tree;

public class charListe {

    // Import singly linked list and simple navigation variables
    // Navigation variables
    private static charListe firstElement;
    private charListe nextElement;
    public TreeNode node;

    // ToDo change constructor so we can add a elements with nodes
    charListe(char c, long n) {
        // Todo reuse code from constructor below and add treenode
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

    charListe() {
        if (firstElement == null) {
            firstElement = this;
        } else {
            nextElement = firstElement;
            firstElement = this;
        }
    }

    // A way to remove elements with a specific value
    public static void removeElement(charListe element) {
        if (element == firstElement) {
            firstElement = firstElement.nextElement;
        }
        charListe tempElement = firstElement;
        while (tempElement.nextElement != element) {
            tempElement = tempElement.nextElement;
            if (tempElement == null) {
                return;
            }
            tempElement.nextElement = tempElement.nextElement.nextElement;
        }

    }

    public static void removeNextElement(charListe element) {
        if (element.nextElement != null) {
            element.nextElement = element.nextElement.nextElement;
        }
    }

    public static charListe getFirstElement() {
        return firstElement;
    }

    public charListe getNextElement() {
        return nextElement;
    }

    // Function for combining the two least common elements in the list
    private static void CombineLeast() {
        // ToDo make work
        // if (firstElement.nextElement == null)
        // return; // Can't combine elements into a new element
        charListe low1 = firstElement;
        charListe low2 = firstElement.nextElement;
        charListe tempElement = firstElement.nextElement.nextElement;
        // loop through the list and find the two least common elements
        while (tempElement != null) {
            if (tempElement.node.number < low1.node.number || tempElement.node.number < low2.node.number) {

                if (low1.node.number < low2.node.number) {
                    low2 = tempElement;
                } else {
                    low1 = tempElement;
                }
            }
            // Go through the list
            tempElement = tempElement.nextElement;
        }
        // Combine into new node and remove old ones
        // Make new treenode
        TreeNode tempNode = new TreeNode();
        tempNode.leftNode = low1.node;
        tempNode.rightNode = low2.node;
        tempNode.number = low1.node.number + low2.node.number;
        low1.node = tempNode;
        removeElement(low2);

    }

    public static void GrowTree() {
        while (firstElement.nextElement != null) {
            CombineLeast();

        }
        // Saving the tree
        TreeNode.treeTop = firstElement.node;
        // Delete all elements
        firstElement = null;

    }
}