
public class Main {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{-2, 3, 4, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }

    public static int largestDifferenceOfEvens(int[] arr) {
        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount += 1;
        }
        if (evenCount < 2) return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num % 2 == 0){
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        }
        return max - min;
    }
}