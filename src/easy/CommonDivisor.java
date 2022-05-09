package easy;

import java.util.ArrayList;

public class CommonDivisor {
    public static void main(String[] args) {
        int[] a1={2,4,6};
        int[] a2={12,24,36};
        ArrayList<Integer> l= new ArrayList<>();

        int low=a1[a1.length-1];
        int high = a2[a2.length-1];

        for (int i = low; i <high ; i++) {

            int count=0;
            for (int a:a2) {
                if(a%i==0)
                    count++;
            }
            if(count==a2.length){
                l.add(i);
            }
        }

        l.stream().forEach(System.out::println);
    }
}
