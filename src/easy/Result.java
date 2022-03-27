package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> s= new HashSet<>();
        int pair=0;
        for (Integer i:ar) {
            if(s.contains(i)){
               pair ++;
               s.remove(i);
            }
            else{
                s.add(i);
            }
        }

        return pair;
    }

    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,1,2,1,3,2);
        int n=l.size();
        System.out.println(Result.sockMerchant(n,l));
    }
}
