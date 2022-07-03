public class Main {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray(new int[]{-1, 0, 0, 0, 1}));
        System.out.println(decodeArray(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
    }

    public static int decodeArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int count = 0;
                while(arr[i] == 0){
                    count += 1;
                    i++;
                }
                sum = sum * 10 + count;
            }else{
                sum = sum * 10;
            }
        }
        return arr[0] >= 0 ? sum: sum * -1;
    }
}