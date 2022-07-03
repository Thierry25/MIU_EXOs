public class Main {
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1,2,3,4}));
        System.out.println(largestAdjacentSum(new int[]{18,-12,9,-10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,2,1,1,1}));

    }

    public static int largestAdjacentSum(int[] arr){
        int sum = arr[0] + arr[1];
        if(arr.length == 2) return sum;
        int max = sum;
        int j = 1;
        for(int i = 2; i < arr.length; i++){
            max = Math.max(max, arr[i] + arr[j]);
            j++;
        }
        return max;
    }
}