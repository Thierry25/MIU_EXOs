public class Exo2 {

    public static void main(String[] args) {
        System.out.println(notHappyFunc(new int[]{1,2,3,4,5}, new int[]{3,4,5}));
    }

    private static int notHappyFunc(int[] arr1, int[] arr2){
        int sum = 0;
        for(int num: arr1){
            if(!isThere(num, arr2)){
                sum += num;
            }
        }
        return sum;
    }

    private static boolean isThere(int a, int[] arr){
        for(int num : arr){
            if(num == a) return true;
        }
        return false;
    }
}
