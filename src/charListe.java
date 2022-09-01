public class charList {
    // navigation variables
    private static charList firstElement;
    private charList nextElement;

    // payload
    public TreeNode node;

    charList(char c, long n) {
        // check if this it the very first element
        if (firstElement == null) {
            firstElement = this;
        } else { // if the list wasn't empty...
            nextElement = firstElement;
            firstElement = this;
        }
        node = new TreeNode();
        node.character = c;
        node.number = n;
    }

    charList() {
        // check if this it the very first element
        if (firstElement == null) {
            firstElement = this;
        } else { // if the list wasn't empty...
            nextElement = firstElement;
            firstElement = this;
        }
    }

    public static void removeElement(charList element) {
        // special case for firstElement = element
        if (element == firstElement)
            firstElement = firstElement.nextElement;
        // all the rest
        charList tempElement = firstElement;
        while (tempElement.nextElement != element) {
            // move down the list
            tempElement = tempElement.nextElement;
            // break if we reached the end
            if (tempElement == null)
                return;
        }
        // if we make it here, we must have found the element, and its
        // tempElement.nextElement - Delete it!
        tempElement.nextElement = element.nextElement;
    }

    public static void removeNextElement(charList element) {
        if (element.nextElement != null)
            element.nextElement = element.nextElement.nextElement;
    }

    public static charList getFirstElement() {
        return firstElement;
    }

    public charList getNextElement() {
        return nextElement;
    }

    // function for combining the two least common elements into a new element
    private static void CombineLeastCommon() {
        // if (firstElement.nextElement == null) return; //can't combine with only one
        // element
        charList low1 = firstElement;
        charList low2 = firstElement.nextElement;
        charList tempElement = firstElement.nextElement.nextElement;
        // loop through the list
        while (tempElement != null) {
            // compare node values
            if (tempElement.node.number < low1.node.number || tempElement.node.number < low2.node.number) {
                if (low1.node.number < low2.node.number) {
                    low2 = tempElement;
                } else {
                    low1 = tempElement;
                }
            }
            // step down the list
            tempElement = tempElement.nextElement;
        }
        // Combine into a new TreeNode
        TreeNode tempNode = new TreeNode();
        tempNode.leftNode = low1.node;
        tempNode.rightNode = low2.node;
        tempNode.number = low1.node.number + low2.node.number;
        // insert into charList (more or less)
        low1.node = tempNode;
        removeElement(low2);
    }

    public static void GrowTree() {
        while (firstElement.nextElement != null) {
            CombineLeastCommon();
        }
        TreeNode.treeTop = firstElement.node; // saving the tree
        firstElement = null; // clears the charList for next use
    }

}