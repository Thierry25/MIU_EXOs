public class Main {
    public static void main(String[] args) {
        System.out.println(isNPrimeable(new int[] {5, 15, 27}, 2));
        System.out.println(isNPrimeable(new int[] {5, 15, 27}, 3));
        System.out.println(isNPrimeable(new int[] {5, 15, 26}, 2));
        System.out.println(isNPrimeable(new int[] {1, 1, 1, 1, 1, 1, 1}, 4));
        System.out.println(isNPrimeable(new int[] {}, 2));
    }

    private static int isNPrimeable(int[] arr, int n){
        for(int num: arr){
            if(!isPrime(num + n)) return 0;
        }
        return 1;
    }

    private static boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}