import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
 


class Opgave4 {
 
    // Main driver method
    public static void main(String[] args) throws Exception
    {

        Scanner hej5 = new Scanner(System.in);
        

        String str = hej5.nextLine();
       
  
        char arr[] = str.toCharArray();
 
       
        char temp;
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
 
    
        System.out.println(arr);
    }
}