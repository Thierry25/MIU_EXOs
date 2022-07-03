public class Main {
    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }

    public static int isDigitIncreasing(int n){
        String val = String.valueOf(n);
        int len = val.length();

        int i = 1;
        int sum = 0;
        int k = 0;
        while(i < 10){
            while(k < len){
                sum += getValue(i, k);
                k++;
            }
            i++;
            if(sum == n) return 1;
            sum = 0;
            k = 0;
        }
        return 0;
    }

    public static int getValue(int base, int exponent){
        int sum = 0;
        while(exponent > -1){
            sum += base * (int) Math.pow(10, exponent);
            exponent -= 1;
        }
        return sum;
    }
}