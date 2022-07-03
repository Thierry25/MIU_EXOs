public class Main {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[] {1, 2, 1}));
        System.out.println(is121Array(new int[] {1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[] {1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[] {1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[] {1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[] {1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[] {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[] {2, 2, 2}));
    }

    private static int is121Array(int[] arr){
        if(arr[0] != 1 || arr[arr.length -1] != 1) return 0;
        int startCount = 0, endCount = 0;
        int startIdx = 0, endIdx = arr.length -1;

        while(arr[startIdx] == 1){
            startCount += 1;
            startIdx += 1;
            if(startIdx == arr.length -1) return 0;
        }

        while(arr[endIdx] == 1){
            endCount += 1;
            endIdx -= 1;
        }

        while(startIdx < endIdx){
            if(arr[startIdx] != 2) return 0;
            startIdx += 1;
        }
        return (startCount == endCount) ? 1: 0;
    }
}