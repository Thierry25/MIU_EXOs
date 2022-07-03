public class Main {
    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }

    public static int checkConcatenatedSum(int n, int catlen){
        int originalNumber = n;
        int sum = 0;
        while(n > 0){
            sum += calculateValue(n % 10, catlen -1);
            n /= 10;
        }
        return (sum == originalNumber) ? 1 : 0;
    }

    public static int calculateValue(int base, int exponent){
        int total = 0;
        while(exponent > -1){
            total += base * (int) Math.pow(10, exponent);
            exponent--;
        }
        return total;
    }
}