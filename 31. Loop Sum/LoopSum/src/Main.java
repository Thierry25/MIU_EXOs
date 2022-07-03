public class Main {
    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1, 2, 3}, 2));
        System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
        System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
        System.out.println(loopSum(new int[]{3}, 10));
    }

    private static int loopSum(int[] arr, int n) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
          count++;
          if(i == arr.length -1) i = -1;
          if(count == n) break;
        }
        return sum;
    }
}