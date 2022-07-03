public class Main {
    public static void main(String[] args) {
        System.out.println(isPairedN(new int[] {1, 4, 1, 4, 5, 6}, 5));
        System.out.println(isPairedN(new int[] {1, 4, 1, 4, 5, 6}, 6));
        System.out.println(isPairedN(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println(isPairedN(new int[] {1, 4, 1}, 5));
        System.out.println(isPairedN(new int[] {8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println(isPairedN(new int[] {8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println(isPairedN(new int[] {3}, 3));
        System.out.println(isPairedN(new int[] {}, 0));
    }

    private static int isPairedN(int[] arr, int n){
        if(arr.length < n) return 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == n && i + j == n) return 1;
            }
        }
        return 0;
    }
}