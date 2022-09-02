package Tree;

public class charlListeMain {
    public static void main(String[] args) {

        



        // add characters
        new charListe('a', 37);
        new charListe('b', 7);
        new charListe('c', 87);
        new charListe('d', 114);
        new charListe('e', 13);
        new charListe('f', 3);
        new charListe('g', 22);
        new charListe('h', 69);
        // grow the tree
        charListe.GrowTree();
        // print the tree
        TreeNode.PrintTree(); // TODO - Make Work!

        System.out.println("2");
        // gow the tree
        charListe.GrowTree();
        System.out.println("2");
        // print the tree
        TreeNode.PrintTree();
        System.out.println("3");
    }
}
