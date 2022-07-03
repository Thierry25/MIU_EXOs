public class Main {
    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[]{1,2,3,4,5}, 1,5));
        System.out.println(isSequencedArray(new int[]{1,3,4,2,5}, 1,5));
        System.out.println(isSequencedArray(new int[]{-5,-5,-4,-4,-4,-3,-3,-2,-2,-2}, -5,-2));
        System.out.println(isSequencedArray(new int[]{0,1,2,3,4,5}, 1,5));
        System.out.println(isSequencedArray(new int[]{1,2,3,4}, 1,5));
        System.out.println(isSequencedArray(new int[]{1,2,5}, 1,5));
        System.out.println(isSequencedArray(new int[]{5,4,3,2,1}, 1,5));
    }

    public static int isSequencedArray(int[] arr, int m, int n){
        if(arr[0] != m || arr[arr.length -1] != n) return 0;

        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j] && arr[i] + 1 != arr[j]) return 0;
            i++;
        }
        return 1;
    }
}