public class Main {
    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }

    private static int closestFibonacci(int n){
        if(n < 1) return 0;
        int value = 0;
        for(int i = 2; i < 10_000; i++){
            if(fibonacci(i) <= n) value = fibonacci(i);
            else break;
        }
        return value;
    }
    private static int fibonacci(int n){
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}