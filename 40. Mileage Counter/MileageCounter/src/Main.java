import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = {8, 9, 9, 5, 0};
        int[] y = {8, 9, 9, 5, 0};
        int[] z = {9,9,9,9,9,9,9,9,9,9};
        int[] a = {9,9,9,9,9,9,9,9,9,9};
        addMileage(x, 1);
        addMileage(y, 2);
        addMileage(z, 1);
        addMileage(a, 13);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(z));
        System.out.println(Arrays.toString(a));
    }

    public static void addMileage(int[] arr, int number){
        int count = 0;
        while(count < number){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != 9) {
                    arr[i] += 1; break;
                }else{
                    arr[i] = 0;
                }
            }
            count += 1;
        }

    }
}