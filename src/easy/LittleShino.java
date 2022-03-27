package easy;

import java.util.*;

class LittleShino {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers");

        int num1 = s.nextInt();
        int num2 =s.nextInt();

        int count=0,max=0;

        if(num1>=num2){
            max=num1;
        }
        else{
            max=num2;
        }

        for(int i=1;i<max;i++)
        {
            if(num1%i==0 && num2%i==0){
                System.out.println(i);
             count++;
            }
        }
        System.out.println("Number count is: " + count);

    }
}
