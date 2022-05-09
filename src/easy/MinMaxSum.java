package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        ArrayList<Long> l=new ArrayList<>();
        for (Integer j:arr) {
            l.add(j.longValue());
        }
        Collections.sort(arr);
        Long sum=0L;
        for (Long i: l  ) {
            sum+=i;
        }

        System.out.println(sum-arr.get(arr.size()-1)  + " " + (sum-arr.get(0)));
    }

    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        miniMaxSum(l);
    }
}
