import java.util.Scanner;

public class Opgave7 {
  public static void main(String args[]) {

    int i, m = 0, flag = 0, n = 0;
    Scanner InputTo = new Scanner(System.in);

    int inputTo = InputTo.nextInt();

    int inputEt = 0;

    while (inputEt < inputTo) {
      inputEt++;
      n++;

      m = n / 2;
      if (n == 0 || n == 1)

      {
        System.out.println(n + " is not prime number");
      }

      else {
        for (i = 2; i <= m; i++) {
          if (n % i == 0) {
            System.out.println(n + " is not prime number");
            flag = 1;
            break;
          }
        }

        if (flag == 0) {
          System.out.println(n + " is prime number");
        }
      }
    }
  



  }

  
  
  

  
  



}
