package practice;
import java.util.Arrays;
import java.util.List;
public class JumpingClouds
{
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jump=0;
        boolean flag=false;
        for (int i = 0; i < c.size()-1; i++) {
            if(c.get(i)==1){
                continue;
            }
            if(flag){
                flag=false;
                continue;
            }
            if(c.get(i+1)==0){
                flag=true;
                ++jump;
                continue;
            }
           else if(c.get(i)==0){
               ++jump;
               continue;
            }

        }
        return jump;

    }

    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(0,0,0,0,1,0);
        System.out.println(JumpingClouds.jumpingOnClouds(l));
    }
}
