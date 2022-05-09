package easy;

public class CountOdds {
    static int countOdds(int low, int high) {
        int count=0;
        for( int i=low;i<high+1;i++){
            if(i%2!=0){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOdds(3,7));
    }
}
