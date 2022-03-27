package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Delims {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens=s.trim().split("[ !@.,'?]+");
        System.out.println(Arrays.toString(tokens));

//        String s = scan.nextLine().replaceAll("[!,?._'@\\s]+", " ");
//        StringTokenizer st = new StringTokenizer(s);
//        int count = st.countTokens();
//        System.out.println(count);
//        for (int i = 0; i < count; i++) {
//            System.out.println(st.nextToken());
//        }

        scan.close();
    }
}
