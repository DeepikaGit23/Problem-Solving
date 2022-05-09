package easy;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        ArrayList<Float> p= new ArrayList<>();
        NumberFormat formatter = new DecimalFormat("#0.000000");
    float low=0,high=0,mid=0;

        for (Integer i:arr
             ) {
            if(i>0)
                high++;
            if(i<0)
                low++;
            if(i==0){
                mid++;
            }
        }

        p.add(low/arr.size());
        p.add(mid/arr.size());
        p.add(high/ arr.size());

        for (Float i : p) {

            System.out.println(formatter.format(i));
        }

    }

    public static void main(String[] args) {
            List<Integer> l=new ArrayList<Integer>(){
                {
                    add(-1);
                    add(-2);
                    add(-3);
                    add(0);
                    add(1);
                    add(3);
                }
            };
           plusMinus(l);
    }
}
