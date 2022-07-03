public class Main {
    public static void main(String[] args) {
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1,0}));
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println(isOneBalanced(new int[]{}));
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4}));
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));
    }

    private static int isOneBalanced(int[] arr){
        if(arr.length == 0) return 1;
        if(arr[0] != 1 && arr[arr.length - 1] != 1) return 0;
        int i = 0, j = arr.length -1;
        while(arr[i] == 1){
            if(i == arr.length -1) break;
            i++;
        }
        while(arr[j] == 1){
            if(j == 0) break;
            j--;
        }
        if(i > j) return 0;
        while(i < j){
            if(arr[i] == 1) return 0;
            i++;
        }
        return 1;
    }
}