package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> res=new ArrayList<>(Collections.nCopies(100, 0));
        for (int i = 0; i < arr.size(); i++) {
          res.set(arr.get(i),res.get(arr.get(i))+1);
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(){
            {
               add(0);
               add(1);
               add(1);
               add(2);
            }
        };
        System.out.println(countingSort(nums));
    }
}
