public class Main {
    public static void main(String[] args) {
        System.out.println(allValuesTheSame(new int[]{1, 1, 1, 1}));
        System.out.println(allValuesTheSame(new int[]{83, 83, 83}));
        System.out.println(allValuesTheSame(new int[]{0,0,0,0,0,0,0,0,0,0,0}));
        System.out.println(allValuesTheSame(new int[]{1, -2343456, 1, -2343456}));
        System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, -1}));
        System.out.println(allValuesTheSame(new int[]{432123456}));
        System.out.println(allValuesTheSame(new int[]{-432123456}));
        System.out.println(allValuesTheSame(new int[]{}));
    }

    public static int allValuesTheSame(int[] arr){
        if(arr.length == 0) return 0;
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]) return 0;
        }
        return 1;
    }
}