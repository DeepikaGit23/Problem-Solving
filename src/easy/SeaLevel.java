package practice;

public class SeaLevel
{
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int seaLevel=0;
        int m=0;
        for (int i=0;i<steps;i++)
        {
            if(path.charAt(i) == 'U') {
                if (++seaLevel == 0)
                    m++;
            }
            if(path.charAt(i) == 'D')
               --seaLevel;
        }
        return m;
    }

    public static void main(String[] args) {
        String s="DDUUDDUDUUUD";
        int l=s.length();
        System.out.println(SeaLevel.countingValleys(l,s));
    }

}
