import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(patternMatches(new int[]{1,1,1,1,1}, new int[]{1}));
        System.out.println(patternMatches(new int[]{1}, new int[]{1}));
        System.out.println(patternMatches(new int[]{1,1,2,2,2,2}, new int[]{1, 2}));
        System.out.println(patternMatches(new int[]{1,2,3}, new int[]{1, 2}));
        System.out.println(patternMatches(new int[]{1,2}, new int[]{1,2,3}));
        System.out.println(patternMatches(new int[]{1,1,2,2,2,2,3}, new int[]{1,3}));
        System.out.println(patternMatches(new int[]{1,1,1,1}, new int[]{1,2}));
        System.out.println(patternMatches(new int[]{1,1,1,1,2,2,3,3}, new int[]{1,2}));
        System.out.println(patternMatches(new int[]{1,1,10,4,4,3}, new int[]{1,4,3}));

//        Integer[] x = {1,1,1,1,1};
//        Set<Integer> hashSet = new HashSet<Integer>(Arrays.asList(x));


    }

   public static int patternMatches(int[] arr, int[] pattern){
        if(arr[arr.length -1] != pattern[pattern.length -1]) return 0;
        int i = 0, k = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != pattern[k]) return 0;
            if(arr[i] != arr[j]){
                i = j;
                if(k != pattern.length - 1) k +=1;
            }
        }
        return 1;
   }
}