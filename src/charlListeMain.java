public class charlListeMain {
    public static void main(String[] args) {
        new charListe('a', 37);
        new charListe('b', 38);
        new charListe('c', 90);
        new charListe('d', 91);
        new charListe('e', 45);
        new charListe('f', 53);
        new charListe('g', 67);
        new charListe('h', 30);
        System.out.println("1");

        // gow the tree
        charListe.GrowTree();
        System.out.println("2");
        // print the tree
        TreeNode.PrintTree();
        System.out.println("3");
    }
}
