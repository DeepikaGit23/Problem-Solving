package easy;

import java.util.Arrays;

public class Cognizant {

    public static void main(String[] args) {
        String name = "deepika";
        System.out.println("String without sorting elments :" + name);
        char[] nameArray=new char[name.length()];
        for(int i=0;i<name.length();i++)
        {
            nameArray[i]=name.charAt(i);
        }
        Arrays.sort(nameArray);
      String d="";
        for(int j=0;j<name.length();j++)
        {
            d+=nameArray[j];
        }
        System.out.println("Name after sorting elements :" + d);
    }
}
