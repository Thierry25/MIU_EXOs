public class Main {
    public static void main(String[] args) {
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(21));
        System.out.println(isFibonacci(34));
        System.out.println(isFibonacci(27));
    }

    private static int isFibonacci(int n){
        for(int i = 2; i < 1_000; i++){
            if(fibonacci(i) == n) return 1;
            else if(fibonacci(i) > n) break;
        }
        return 0;
    }

    private static int fibonacci(int n){
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}