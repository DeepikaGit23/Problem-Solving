package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Arithmetic{
    public Integer sum(Integer[] ints){
        int sum=0;
        for (Integer integer : ints) {
            sum+=integer;
        }
        return sum;
    }

    public String sum(String[] strings){
        String sum="";
        for (String string : strings) {
            sum+= string;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        String[] s= b.readLine().split(" ");
        Integer[] in=new Integer[s.length];
        Arithmetic A= new Arithmetic();
        System.out.println(Character.isDigit(s[0].charAt(0)));
        if(Character.isDigit(s[0].charAt(0))){
            for (int i=0;i<s.length;i++) {
                in[i]=Integer.parseInt(s[i]);
            }
            System.out.println(A.sum(in));
        }
        else
        {
            System.out.println(A.sum(s));
        }
    }

}