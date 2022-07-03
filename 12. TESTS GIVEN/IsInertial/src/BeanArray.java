public class BeanArray {
    public static void main(String[] args) {
        System.out.println(isBean(new int[]{4,9,8}));
        System.out.println(isBean(new int[]{2,2,5,11,23}));
        System.out.println(isBean(new int[]{7,7,3,6}));
        System.out.println(isBean(new int[] {0}));
    }

    private static int isBean(int[] arr){
        for(int num: arr){
            if(!isThere(num, arr))return 0;
        }
        return 1;
    }

    private static boolean isThere(int val, int[] arr){
        //2n, 2n+1 or n/2
        for(int num: arr){
            if(num == val * 2 || num == (2 * val) + 1 || num == val / 2) return true;
        }
        return false;
    }
}
