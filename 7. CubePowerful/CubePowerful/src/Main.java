public class Main {
    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }

    public static int isCubePowerful(int n){
        if(n <= 0) return 0;
        int originalNumber = n;
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n % 10, 3);
            n /= 10;
        }
        return (sum == originalNumber) ? 1 : 0;
    }
}