
public class Main {
    public static void main(String[] args) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
        System.out.println(areAnagrams(new char[]{'p', 'o', 'o', 'l'}, new char[]{'p', 'o', 'l', 'l'}));
    }

    private static int areAnagrams(char[] a1, char[] a2){
        if(a1.length != a2.length) return 0;
        for(char c: a1){
            if(count(c, a1) != count(c, a2)) return 0;
        }
        return 1;
    }

    private static int count(char c, char[] a1){
        int count = 0;
        for(char c1: a1){
            if(c1 == c) count+= 1;
        }
        return count;
    }
}