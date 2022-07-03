public class Main {
    public static void main(String[] args) {
        System.out.println(isComplete(new int[] {36, -28}));
        System.out.println(isComplete(new int[] {36, 28}));
        System.out.println(isComplete(new int[] {4}));
        System.out.println(isComplete(new int[] {3, 2, 1, 1, 5, 6}));
        System.out.println(isComplete(new int[] {3, 7, 23, 13, 107, -99, 97, 81}));
    }

    private static int isComplete(int[] arr){
        return (isPerfectSquare(arr) && containsEven(arr) && (containsSum8(arr))) ? 1 : 0;
    }

    private static boolean isPerfectSquare(int[] arr){
        for(int number: arr) {
            for (int i = 1; i <= number / 2; i++) {
                if (i * i == number) return true;
            }
        }
        return false;
    }

    private static boolean containsSum8(int[] arr){
        if(arr.length < 2) return false;
        for(int i : arr){
            for(int j : arr){
                if(i + j == 8) return true;
            }
        }
        return false;
    }

    private static boolean containsEven(int[] arr){
        for(int num : arr){
            if(num % 2 == 0) return true;
        }
        return false;
    }
}