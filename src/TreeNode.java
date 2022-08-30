public class TreeNode {
    public static TreeNode treetop;
    public TreeNode leftNode;
    public TreeNode rightNode;

    // Payload
    public char character;
    public long number;

    public static void PrintTree() {
        while (treetop != null) {
            System.out.println(treetop.character + " " + treetop.number);
            treetop = treetop.rightNode;
        }

    }
}
