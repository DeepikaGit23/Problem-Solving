package easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInt {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        HashMap<Integer,Integer> num= new HashMap<>();
        for (Integer i:a ) {
            if(num.containsKey(i)){
                num.put(i,num.get(i)+1);
            }
            else{
                num.put(i,1);
            }
        }

        int res=0;
        for (Map.Entry<Integer,Integer> e:num.entrySet())
        {
            if(e.getValue().equals(1)){
                res=e.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lonelyinteger(List.of(1,1,2,3,3,4,4)));
    }
}
