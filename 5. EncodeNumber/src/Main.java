import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }

    public static int[] encodeNumber(int n){
        if(n <= 1) return null;
        int[] arr = new int[20];
        int k = 0;
        for(int i = 2; i <= n ; i++){
            if(n % i == 0 && isPrime(i)){
                while(n % i == 0){
                    arr[k++] = i;
                    n /= i;
                }
            }
        }
        int[] val = new int[k];
        System.arraycopy(arr, 0, val, 0, k);
        return val;
    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}