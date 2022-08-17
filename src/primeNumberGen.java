public class primeNumberGen {
    public static void main(String[] args){
        long goal = 1000000000001l;

        while(!isPrime(goal)){
            goal += 2;
        }

        System.out.println(goal);
        System.out.println(isPrime(goal));
    }

    static boolean isPrime(long n) {
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        long sqrtN = (long) Math.sqrt(n);


        for (int i = 3; i <= sqrtN ; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }


        
        return true;
    }
}
