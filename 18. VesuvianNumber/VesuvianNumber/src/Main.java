public class Main {
    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
    }

    public static int isVesuvian(int number){
        int start = 1;
        int end = (int) Math.sqrt(number);
        int count = 0;
        for(int i = start; i < end; i++){
            for(int j = start; j < end; j++){
                int startExp = i * i;
                int endExp = j * j;
                if(startExp + startExp == number) count +=1;
                if(startExp + endExp == number) count += 1;
                if(count == 2) break;
            }
            if(count == 2) break;
        }
        return count >= 2 ? 1: 0;
    }
}