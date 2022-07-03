import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }

    private static int[] computeHMS(int number) {
        int[] arr = new int[3];
        int hours = 0, minutes = 0, seconds;
        if (number >= 3600) {
            hours = number / 3600;
            int remainder = number % 3600;
            if (remainder >= 60) {
                minutes = remainder / 60;
                seconds = number % 60;
            }else seconds = remainder;
        }else if(number >= 60){
            minutes = number / 60;
            seconds = number % 60;
        }else seconds = number;

        arr[0] = hours;
        arr[1] = minutes;
        arr[2] = seconds;
        return arr;
    }
}