public class Main {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }

    public static int largestPrimeFactor(int n){
        int largestPrime = 0;
        for(int i = 2; i <= n/2; i++){
            if(isPrime(i) && n % i == 0)
                largestPrime = i;
        }
        return largestPrime;
    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}