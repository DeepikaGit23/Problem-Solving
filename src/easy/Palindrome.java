package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder s= new StringBuilder(A);
        String r= new String (s.reverse());
        if(A.equals(r)){
            System.out.println("Value of r :" + r + "Value of s: " + s + "Yes");}
        else{
            System.out.println("No");
        }
    }
}
