public class Main {
    public static void main(String[] args) {
        System.out.println(isHodder(3));
        System.out.println(isHodder(4));
        System.out.println(isHodder(7));
        System.out.println(isHodder(30));
        System.out.println(isHodder(31));
        System.out.println(isHodder(120));
        System.out.println(isHodder(127));
    }

    private static int isHodder(int n) {
        if (isPrime(n)) {
            for (int i = 1; i < n; i++) {
                int power = (int) Math.pow(2, i) - 1;
                if (power == n) return 1;
                else if (power > n) break;
            }
        }
        return 0;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}