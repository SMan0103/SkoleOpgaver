import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        Scanner hej2 = new Scanner(System.in);
        int hej = hej2.nextInt();
        

        for (int i = 0; i < 21; i++) {
            int i2 = i * hej;

            System.out.println(i2);
        }

    }
}




