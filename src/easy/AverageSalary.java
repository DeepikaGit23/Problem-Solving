package easy;

import java.util.Arrays;

public class AverageSalary {
    public static double average(int[] salary) {

        double sum=0;
        for (int i:salary
             ) {
            sum+=i;
        }
        return sum/ salary.length;
    }

    public static void main(String[] args) {
        System.out.println(average(new int[]{8000,9000,2000,3000,6000,1000}));
    }
}
