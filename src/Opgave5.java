import java.util.Scanner;


public class Opgave5 {

    public static void main(String[] args) {
        
        program();
       
        System.out.println("Skriv y for at forsætte n for ikke at forsætte");
        Scanner Ja = new Scanner(System.in);
            String ja = Ja.next();
    
        

        if (ja.equals("y")) {
            program();
        } else {
            System.out.println("Programmet er afsluttet");
            System.exit(0);

        }
        Ja.close();
    }

    private static int sqrt(float d) {
        return 0;
    }
    
    public static void program() {
               // Til at få input fra brugeren 
        Scanner A = new Scanner(System.in);
            int a = A.nextInt();

        Scanner B = new Scanner(System.in);
            int b = B.nextInt();    
        

        Scanner C = new Scanner(System.in);
            int c = C.nextInt();
        

        float d = (b*b)-4*a*c;

        float Ty = -(d)/(2*a);
        float Tx = -(b)/(2*a);

        float r_1 = (-b*sqrt(d))/(2*a);
        float r_2 = (b*sqrt(d))/(2*a);
        
        System.out.println("Ty = " + Ty);
        System.out.println("Tx = " + Tx);
        
        System.out.println("r_1 = " + r_1);
        System.out.println("r_2 = " + r_2);
        
        A.close();
        B.close();
        C.close();
    }
    
}

