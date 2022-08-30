import java.util.Scanner;
import java.util.Arrays;

public class Opgave3 {
    public static void main(String[] args) {
        // make a sorting algorithm that sorts a list of numbers in ascending order

        // make a for loop for input of numbers to 20

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sorted: ");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        input.close();
    }
}