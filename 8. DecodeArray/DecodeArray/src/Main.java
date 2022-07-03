public class Main {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{0,-3,0,-4,0}));
        System.out.println(decodeArray(new int[]{-1,5,8,17,15}));
        System.out.println(decodeArray(new int[]{1,5,8,17,15}));
        System.out.println(decodeArray(new int[]{111,115,118,127,125}));
    }

    public static int decodeArray(int[] arr){
      int number = 0, i = 0;
      for(int j = 1; j < arr.length; j++){
          number = number * 10 + (Math.abs(arr[i] - arr[j]));
          i++;
      }
      return arr[0] >= 0 ? number : number * -1;
    }
}