package practice;

import java.util.Scanner;

public class power {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int num=0;
            for(int j=0;j<n;j++)
            {
                num += (int)Math.pow(2,j) ;
                System.out.print((a+num*b) + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
