package easy;

import java.util.Arrays;
import java.util.Scanner;

public class AvgSalary {
    static public double average(int[] salary) {
        if(salary.length==2)return 0;

        double ans=0;
        Arrays.sort(salary);

        for(int i=1;i<salary.length-1;i++)
        {
            ans+=salary[i];
        }

        return ans/(salary.length-2);
}

    public static void main(String[] args) {
        int salary[]= {8000,9000,2000,3000,6000,1000};
        System.out.println(AvgSalary.average(salary));
    }
}
