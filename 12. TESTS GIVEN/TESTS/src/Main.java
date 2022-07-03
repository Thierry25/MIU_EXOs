public class Main {
    public static void main(String[] args) {
        System.out.println(happyArray(new int[]{1,2,3,0,4,2,6,0,0}));
        System.out.println(happyArray(new int[]{1,4,3,0,4,2,6,0,0}));
        System.out.println(happyArray(new int[]{6,0,0,0,3,3,1,2,3}));
    }

    public static int happyArray(int[] arr){
        if(arr.length < 6) return 0;
        if(arr.length % 3 != 0) return 0;

        int sum = 0;
        int previousSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i < 3) previousSum += arr[i];
            if(i % 3 == 0 && i != 0){
                if(sum != previousSum) return 0;
                sum = 0;
            }
            sum += arr[i];
        }
        return 1;
    }
}