public class Main {
    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1}));
        System.out.println(isInertial(new int[]{2}));
        System.out.println(isInertial(new int[]{1,2,3,4}));
        System.out.println(isInertial(new int[]{1,1,1,1,1,1,2}));
        System.out.println(isInertial(new int[]{2,12,4,6,8,11}));
        System.out.println(isInertial(new int[]{2,12,12,4,6,8,11}));
        System.out.println(isInertial(new int[]{-2,-4,-6,-8,-11}));
        System.out.println(isInertial(new int[]{2,3,5,7}));
        System.out.println(isInertial(new int[]{2,4,6,8,10}));
    }

    private static int isInertial(int[] arr){
        if(!containsOddValue(arr)) return 0;
        int max = getMax(arr);
        if(max % 2 != 0) return 0;
        int evenIndex = 0;
        int oddIndex = 0;
        int[] ev = new int[arr.length];
        int[] od = new int[arr.length];
        for(int num: arr){
            if(num % 2 == 0 && num != max) ev[evenIndex++] = num;
            if(num % 2 != 0) od[oddIndex++] = num;
        }
        int[] evenArr = new int[evenIndex];
        int[] oddArr = new int[oddIndex];
        System.arraycopy(ev, 0, evenArr, 0, evenIndex);
        System.arraycopy(od, 0, oddArr, 0, oddIndex);
        for(int num: oddArr){
            if(!greaterThan(num, evenArr)) return 0;
        }
        return 1;
    }

    private static boolean greaterThan(int num, int[] arr){
        for(int val: arr){
            if(num < val) return false;
        }
        return true;
    }

    private static boolean containsOddValue(int[] arr){
        for(int num: arr){
            if(num % 2 != 0) return true;
        }
        return false;
    }

    private static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num: arr){
            max = Math.max(num, max);
        }
        return max;
    }
}