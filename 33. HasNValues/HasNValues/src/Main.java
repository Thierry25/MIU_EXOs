public class Main {
    public static void main(String[] args) {
        System.out.println(hasNValues(new int[] {1, 2, 2, 1}, 2));
        System.out.println(hasNValues(new int[] {1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(hasNValues(new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 10));
        System.out.println(hasNValues(new int[] {1, 2, 2, 1}, 3));
        System.out.println(hasNValues(new int[] {1,1,1,8,1,1,1,3,3}, 2));
        System.out.println(hasNValues(new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20));
    }

    public static int hasNValues(int[] arr, int numberOfDistinctElements){
        int[] newArr = new int[arr.length];
        int k = 0;
        for(int num : arr){
            if(isNotThere(num, newArr)){
                newArr[k++] = num;
            }
        }
        return (k == numberOfDistinctElements) ? 1 : 0;
    }

    public static boolean isNotThere(int element, int[] arr){
        for(int num: arr){
            if(num == element) return false;
        }
        return true;
    }
}