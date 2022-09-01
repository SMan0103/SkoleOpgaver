public class TreeNode {
    public static TreeNode treetop;
    public TreeNode leftNode;
    public TreeNode rightNode;

    // Payload
    public char character;
    public long number;

    public static void PrintTree() {
        PrintTree(treetop, "");
        System.out.println("5");
    }

    public static void PrintTree(TreeNode node, String s) {
        if (node.leftNode != null) {
            PrintTree(node.leftNode, s + "0");
            PrintTree(node.rightNode, s + "1");
        } else {
            System.out.println(node.character + " >> " + s);
        }
    }
}
