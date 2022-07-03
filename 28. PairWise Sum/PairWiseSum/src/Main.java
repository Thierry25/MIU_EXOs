import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18, -5})));
        System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18, -5, -5, -15, 0, 0, 1, -1})));
        System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18})));
        System.out.println(Arrays.toString(pairwiseSum(new int[] {})));
    }

    private static int[] pairwiseSum(int[] arr){
        if(arr.length == 0) return null;
        if(arr.length % 2 != 0) return null;
        int[] returnArr = new int[arr.length / 2];
        int i = 0, k = 0;
        for(int j = 1; j < arr.length; j++){
            returnArr[k++] = arr[i] + arr[j];
            i = j + 1;
            j = i;
        }
        return returnArr;
    }
}