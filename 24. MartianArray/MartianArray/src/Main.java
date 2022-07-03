public class Main {
    public static void main(String[] args) {
        System.out.println(isMartianArray(new int[] {1, 3}));
        System.out.println(isMartianArray(new int[] {1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println(isMartianArray(new int[] {1, 3, 2}));
        System.out.println(isMartianArray(new int[] {1, 3, 2, 2, 1, 5, 1, 5}));
        System.out.println(isMartianArray(new int[] {1, 2, -18, -18, 1, 2}));
        System.out.println(isMartianArray(new int[] {}));
        System.out.println(isMartianArray(new int[] {1}));
        System.out.println(isMartianArray(new int[] {2}));
    }

    private static int isMartianArray(int[] arr){
        if(arr.length == 1 && arr[0] == 1) return 1;
        int countOne = 0, countTwo = 0;
        for(int i = 0; i < arr.length; i++){
            if(i != arr.length - 1 && arr[i] == arr[i + 1]) return 0;
            if(arr[i] == 1) countOne += 1;
            if(arr[i] == 2) countTwo += 1;
            i += 1;
        }
        return (countOne > countTwo) ? 1 : 0;
    }
}