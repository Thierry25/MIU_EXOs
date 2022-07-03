public class Main {
    public static void main(String[] args) {
        System.out.println(primeFactorial(2));
        System.out.println(primeFactorial(3));
        System.out.println(primeFactorial(7));
        System.out.println(primeFactorial(8));
        System.out.println(primeFactorial(11));
        System.out.println(primeFactorial(721));
    }

    private static int primeFactorial(int n){
        if(!isPrime(n)) return 0;
        for(int i = 1; i < n ; i++){
            if(factorial(i) + 1 == n) return 1;
            else if(factorial(i) + 1 > n) break;
        }
        return 0;
    }
    private static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }

    private static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}