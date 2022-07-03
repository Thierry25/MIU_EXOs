public class Main {
    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0,0,0,0,0}));
        System.out.println(isZeroPlentiful(new int[]{1,2,0,0,0,0,2,-18,0,0,0,0,0,12}));
        System.out.println(isZeroPlentiful(new int[]{0,0,0,0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0}));
        System.out.println(isZeroPlentiful(new int[]{1,2,3,4}));
        System.out.println(isZeroPlentiful(new int[]{1,0,0,0,2,0,0,0,0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
    }

    public static int isZeroPlentiful(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int zeroCount = 0;
            if(arr[i] == 0){
                while(arr[i] == 0){
                    zeroCount += 1;
                    if(i == arr.length -1) break;
                    i++;
                }
                if(zeroCount >= 4) count += 1;
                else return 0;
            }
        }
        return count;
    }
}