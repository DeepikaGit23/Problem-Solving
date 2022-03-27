package problemSolving;

import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        if(A.charAt(0)>B.charAt(0)) {
        	
        	System.out.println(A);
        }
        else {
        	System.out.println(B);
        }
        
	}
}
