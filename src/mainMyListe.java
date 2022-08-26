public class mainMyListe {
    public static void main(String[] args) {
        Myliste tempElement = null;
        Myliste imNr42 = null;

        for (int i = 0; i < 100; i++) {
            tempElement = new Myliste();
            tempElement.id = i;
            if (i == 42) {
                imNr42 = tempElement;
            }
        }

        System.out.println(tempElement);

        Myliste.removeElement(imNr42);
        System.out.println();

        System.out.println(tempElement);

    }
}